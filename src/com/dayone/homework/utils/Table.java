package com.dayone.homework.utils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Table {


    public static String[][] generateTable(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Input number of columns: ");
        int cols = sc.nextInt();
        String[][] baseStrArr = new String[rows][cols];
        Random rand = new Random();
        String baseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;':,.<>?";


        System.out.println();

        for(int i=0;i<rows;i++){
            System.out.println();
            for (int j=0;j<cols;j++){
                System.out.print("| ");
                String colStr = "";
                for(int k=0;k<3;k++){
                    char c = baseChars.charAt(rand.nextInt(baseChars.length()));
                    colStr+=c;
                }
                baseStrArr[i][j] = colStr;
                System.out.print(colStr);
                System.out.print(" ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        return baseStrArr;
    }

    public static void searchTable(char targetChar,String[][] arr){

        for(int rows=0;rows<arr.length;rows++){
            for(int cols=0;cols<arr[rows].length;cols++){
                if(arr[rows][cols].contains(String.valueOf(targetChar))){
                    int count = arr[rows][cols].split(String.valueOf(targetChar)).length-1;
                    System.out.print("["+rows+"]"+"["+cols+"] - "+count+ " Occurrence");
                    System.out.println();
                }
            }
        }
        System.out.println();
    }

    public static void viewTable(String[][] baseArr){
        if(baseArr!=null){
            for(int i=0;i< baseArr.length;i++){
                System.out.println();
                for (int j=0;j<baseArr[i].length;j++){
                    System.out.print(" "+baseArr[i][j]+" |");
                }
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }else{
            System.out.println("Generate a table first!");
        }
    }

}
