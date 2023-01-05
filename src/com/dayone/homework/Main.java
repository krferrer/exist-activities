package com.dayone.homework;

import com.dayone.homework.utils.Table;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] baseArr=null;

        outer:
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Table Generator");
            System.out.println();
            System.out.println("1. Generate Table");
            System.out.println("2. Search Table");
            System.out.println("3. Edit Table");
            System.out.println("4. View Table");
            System.out.println("5 Exit Program");
            System.out.print("Enter desired option: ");
            int selectedOpt= sc.nextInt();

            switch(selectedOpt) {
                case 1:
                    baseArr = Table.generateTable();
                    break;
                case 2:
                    if(baseArr!=null){
                        System.out.print("Input search character: ");
                        char targetChar = sc.next().charAt(0);
                        Table.searchTable(targetChar,baseArr);
                    }else{
                        System.out.println("You have to generate a table first before trying to search!");
                    }
                    break;
                case 3:
                    System.out.println("Input row to be edited: ");
                    int row = sc.nextInt();
                    System.out.println("Input column to be edited: ");
                    int col = sc.nextInt();
                    System.out.println("Input new value with length of 3: ");
                    String val = sc.next();
                    if(val.length()==3){
                        baseArr[row][col]=val;
                    }else{
                        System.out.println("No change has been made, value should be 3 characters");
                    }
                    break;
                case 4:
                    Table.viewTable(baseArr);
                    break;

                default:
                    break outer;
            }
        }
    }
}
