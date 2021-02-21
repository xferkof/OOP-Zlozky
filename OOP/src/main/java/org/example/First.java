package org.example;
import java.util.Arrays;
import java.util.Scanner;  // Import the Scanner class

public class First {
    public static void main(String[] args){
        int[] pole = new int[5];
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        for(int i = 0 ; i < 5; i++){
            System.out.println("Zadaj cislo do pola: ");
            pole[i] = myObj.nextInt();

        }
        for(int j = 0 ; j < 5; j++){
            System.out.println("Na pozicii " +j+ " je cislo : " + pole[j]);


        }


    }

}
