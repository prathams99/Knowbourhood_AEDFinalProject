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
    
     public static boolean validateName(String inputName) {
        return inputName.matches(nameRegex);
    }
    
}
