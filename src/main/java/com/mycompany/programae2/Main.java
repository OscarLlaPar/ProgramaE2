/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programae2;

import java.util.Scanner;

/**
 *
 * @author Oscar Llamas Parra
 */
public class Main {

        private static String name;//User's name
        private static String firstSurname;//User's first surname
        private static String secondSurname;//User's second surname
        private static String fullName = name + firstSurname + secondSurname;
        //User's full name
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Introduzca su nombre: ");
       Scanner reader = new Scanner(System.in);
       name = reader.nextLine();
       System.out.println("Introduzca su primer apellido: ");
       reader = new Scanner(System.in);
       firstSurname = reader.nextLine();
       System.out.println("Introduzca su segundo apellido: ");
       reader = new Scanner(System.in);
       secondSurname = reader.nextLine();
       System.out.println("Nombre introducido: "+name+" "+firstSurname+" "+secondSurname);
    }
    
}
