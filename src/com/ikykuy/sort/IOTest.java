package com.ikykuy.sort;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOTest {

    public static void main(String[] args) {
        File file = new File("/Users/liuxiaowei/Desktop/document");
        listFiles(file, 1);
    }

    static void listFiles(File file, int deep) {
        if (file.isDirectory()) {
            System.out.print("|-");
            System.out.println(file.getName());
            File[] fs = file.listFiles();
            for (File fff: fs) {
                listFiles(fff, deep+1);
            }
        } else {
            System.out.print("|");
            for (int i = 0; i < deep; i++) {
                System.out.print("-");
            }
            System.out.println(file.getName());
        }
    }

    static void testInputStream(File file) {

        try {
            FileInputStream in = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



}
