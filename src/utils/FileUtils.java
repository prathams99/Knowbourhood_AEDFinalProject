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
    
     public static boolean validateName(String inputName) {
        return inputName.matches(nameRegex);
    }
     
     public static boolean validateNumber(String numberInput) {
        return numberInput.matches(numberRegex);
    }
     public static boolean validateNameNumber(String nameNumberInput) {
        return nameNumberInput.matches(nameNumberRegex);
    }
    
}
