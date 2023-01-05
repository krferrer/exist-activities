package com.daytwo.homework.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Table {


    public static Map<String, String>[][] generateTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Input number of columns: ");
        int cols = sc.nextInt();

        Map<String, String>[][] arrMap = new HashMap[rows][cols];

        String baseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;':,.<>?";
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String key = "";
                String val = "";
                for (int k = 0; k < 3; k++) {
                    key += baseChars.charAt(rand.nextInt(baseChars.length()));
                    val += baseChars.charAt(rand.nextInt(baseChars.length()));
                }
                Map<String, String> map = new HashMap<>();
                map.put(key, val);
                arrMap[i][j] = map;
                System.out.print(" " + key + "," + val + " |");
            }
            System.out.println();
        }
        return arrMap;
    }

    public static void searchTable(Map<String, String>[][] mapArr) {
        if (mapArr != null) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input value to be searched: ");
            char targetChar = sc.next().charAt(0);
            for (int i = 0; i < mapArr.length; i++) {
                for (int j = 0; j < mapArr[i].length; j++) {

                    String tempStr = "";
                    int valCtr = 0;
                    int keyCtr = 0;
                    for (Map.Entry<String, String> entry : mapArr[i][j].entrySet()) {
                        tempStr += entry.getKey() + "," + entry.getValue();
                        if (entry.getKey().split(String.valueOf(targetChar)).length - 1 > 0) {
                            keyCtr++;
                        }
                        ;
                        if (entry.getValue().split(String.valueOf(targetChar)).length - 1 > 0) {
                            valCtr++;
                        }
                        ;
                    }
                    if (tempStr.contains(String.valueOf(targetChar))) {
                        String outputStr = "Output: " + "[" + i + "," + j + "] - ";
                        if (valCtr > 0) {
                            outputStr += valCtr + " Occurence found on value field ";
                        }
                        if (keyCtr > 0) {
                            outputStr += keyCtr + " Occurence found on key field ";
                        }
                        System.out.println(outputStr);
                    }

                }
            }
        } else {
            System.out.println("Generate a table first before searching!");
        }

    }

    public static void editTable(Map<String, String>[][] arrMap) {
        if (arrMap != null) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Input row to be modified:");
            int row = sc.nextInt();
            System.out.print("Input column to be modified:");
            int col = sc.nextInt();

            System.out.println("1. Key");
            System.out.println("2. Value");
            System.out.print("Select which field you wish to edit: ");
            int selectedOpt = sc.nextInt();

            System.out.print("Enter new value: ");
            String newVal = sc.next();

            switch (selectedOpt) {
                case 1:
                    Map<String, String> keyNewMap = new HashMap<>();
                    keyNewMap.put(newVal, arrMap[row][col].values().iterator().next());
                    arrMap[row][col] = keyNewMap;
                    break;
                case 2:
                    Map<String, String> valNewMap = new HashMap<>();
                    valNewMap.put(arrMap[row][col].keySet().iterator().next(), newVal);
                    arrMap[row][col] = valNewMap;
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Generate a table first before you edit!");
        }

    }

    public static void viewTable(Map<String, String>[][] arrMap) {
        if (arrMap != null) {
            for (int i = 0; i < arrMap.length; i++) {
                for (int j = 0; j < arrMap[i].length; j++) {
                    for (Map.Entry<String, String> entry : arrMap[i][j].entrySet()) {
                        System.out.print(" " + entry.getKey() + "," + entry.getValue() + " |");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Generate a table first before displaying!");
        }

    }
}
