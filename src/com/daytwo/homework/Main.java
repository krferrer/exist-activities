package com.daytwo.homework;

import com.daytwo.homework.utils.Table;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String>[][] baseMap = null;

        outer:
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("Table Generator");
            System.out.println();
            System.out.println("1. Generate Table");
            System.out.println("2. Search Table");
            System.out.println("3. Edit Table");
            System.out.println("4. View Table");
            System.out.println("5. Exit Program");
            System.out.print("Enter desired option: ");
            int selectedOpt = sc.nextInt();

            switch (selectedOpt) {
                case 1:
                    baseMap = Table.generateTable();
                    break;
                case 2:
                    Table.searchTable(baseMap);
                    break;
                case 3:
                    Table.editTable(baseMap);
                    break;
                case 4:
                    Table.viewTable(baseMap);
                    break;

                default:
                    break outer;
            }
        }
    }
}
