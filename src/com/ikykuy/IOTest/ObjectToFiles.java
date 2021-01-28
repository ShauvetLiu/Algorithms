package com.ikykuy.IOTest;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectToFiles {

    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("A");
        strList.add("A");
        strList.add("A");
        strList.add("A");
        strList.add("A");
        strList.add("A");
        strList.add("A");
        strList.add("A");
        strList.add("A");
        Object a = new Object();

        File file = new File("/Users/liuxiaowei/Desktop/you/indicator_relation.achv");
        ObjectOutputStream os = null;
        ObjectInputStream in = null;
        try {
//            os = new ObjectOutputStream(new FileOutputStream(file));
//            os.writeObject(strList);
            in = new ObjectInputStream(new FileInputStream(file));
            HashMap<String, Object> temp = (HashMap<String, Object>) in.readObject();
            List<String> templateIds = (List)temp.get("templateIds");
            List<Object> relations = (List)temp.get("relation");
            templateIds.forEach(str -> {
                System.out.println(str);
            });
            relations.forEach(item -> {
                System.out.println(item);
            });
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
//            if (os!=null) {
//                try {
//                    os.flush();
//                    os.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
