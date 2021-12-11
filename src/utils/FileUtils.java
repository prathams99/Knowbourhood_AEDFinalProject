
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jarvis
 */
public class FileUtils {
    
    private static final String nameRegex = "^[a-zA-Z ]+$";
     private static final String numberRegex = "^[0-9.]*$";
     private static final String nameNumberRegex = "^[a-zA-Z0-9-, ]+$";
     private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MM-DD-YYYY");
     
     private static final SimpleDateFormat formatter3 = new SimpleDateFormat("MM-dd-yyyy"); 
    
     public static boolean validateName(String inputName) {
        return inputName.matches(nameRegex);
    }
     
     public static boolean validateNumber(String numberInput) {
        return numberInput.matches(numberRegex);
    }
     public static boolean validateNameNumber(String nameNumberInput) {
        return nameNumberInput.matches(nameNumberRegex);
    }
     
      public static boolean isValidDate(String input) {
        try {
            dateFormat.parse(input);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
      
      public static Date convertStringToDate(String date) {
        if (date != null) {
            try {
                Date date3 = formatter3.parse(date);  
                return date3;
            } catch (ParseException e) {
                // nothing we can do if the input is invalid
                throw new RuntimeException(e);
            }
        }
        return null;
    }
      
      public static int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
    
    public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
    
}
