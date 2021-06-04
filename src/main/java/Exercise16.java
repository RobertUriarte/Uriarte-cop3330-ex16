/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;
public class Exercise16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = scan.nextInt();
        if(age >15){
            System.out.print("You are old enough to legally drive");
        }
        else{
            System.out.print("You are not old enough to legally drive");
        }
    }
}