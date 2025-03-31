package ArraysPractice;

import java.util.Scanner;

public class Array_userInput {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array, number only!");
        int size = sc.nextInt();

        int [] numbers = new int[size];
        for (int i =0; i<numbers.length; i++){
            System.out.println("enter the numbers");
            numbers[i] = sc.nextInt();
        }

        System.out.println("_______");

        //print all numbers
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }


    }
}
