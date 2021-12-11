
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import data.CommunityAdmin;
import data.Fireman;
import data.Police;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public static String readFile(String filepath) {
        BufferedReader reader = null;
        try {
            String s = "";
            reader = new BufferedReader(new FileReader(new File(filepath)));
            while (true) {
                String p = reader.readLine();
                if (p == null) {
                    break;
                } else {
                    s = s + p;
                }
            }
            reader.close();
            return s;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeFile(String filepath, String content) {
        try {
            File file = new File(filepath);
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(filepath))));
            pw.println(content);
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<CommunityAdmin> readCommunityAdmins() {
        Gson g = new Gson();
        String json = FileUtils.readFile("src/database/communityadmins.json");
        return g.fromJson(json, new TypeToken<ArrayList<CommunityAdmin>>() {
        }.getType());
    }

    public static void writeCommunityAdmins(ArrayList<CommunityAdmin> communityAdminList) {
        Gson g = new GsonBuilder().setPrettyPrinting().create();
        writeFile("src/database/communityadmins.json", g.toJson(communityAdminList));
    }
    
    public static ArrayList<Fireman> readFiremen() {
        Gson g = new Gson();
        String json = FileUtils.readFile("src/database/firemen.json");
        return g.fromJson(json, new TypeToken<ArrayList<Fireman>>() {
        }.getType());
    }

    public static void writeFiremen(ArrayList<Fireman> firemenList) {
        Gson g = new GsonBuilder().setPrettyPrinting().create();
        writeFile("src/database/firemen.json", g.toJson(firemenList));
    }
    
    public static ArrayList<Police> readPolice() {
        Gson g = new Gson();
        String json = FileUtils.readFile("src/database/police.json");
        return g.fromJson(json, new TypeToken<ArrayList<Police>>() {
        }.getType());
    }

    public static void writePolice(ArrayList<Police> policeList) {
        Gson g = new GsonBuilder().setPrettyPrinting().create();
        writeFile("src/database/police.json", g.toJson(policeList));
    }
}
