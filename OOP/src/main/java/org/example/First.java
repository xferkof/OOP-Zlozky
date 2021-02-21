package org.example;
import java.util.Arrays;
import java.util.Scanner;  // Import the Scanner class

public class First {
    public static void main(String[] args){
        int[] pole =  {75,45,80,20,124};
        Arrays.sort(pole);
        System.out.print("Zoradene cisla : ");
        for(int j = 0 ; j < 5; j++){
            System.out.print(" "+pole[j]);
        }
    }
}
