/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.IOException;
import java.net.Socket;
/**
 *
 * @author viveksharma
 */
public class MySingletonSocket {
    
    private static Socket clientSocket;
    
    static {
        try {
            clientSocket = new MySingletonSocket("localhost", 5500);
        } catch (Exception e) {
            System.out.println("Server listening");
        }
    }
}
