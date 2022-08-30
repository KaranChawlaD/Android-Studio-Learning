package com.example.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
////        String[] names = new String[5];
//        String[] names = {"Name 1", "Name 2", "Name 3", "Name 4", "Name 5"};
//        System.out.println(names[2]);
//
////        names[5] = "Name 6" //Not Allowed
//
//        String[] newNames = new String[6];
//        for (int i = 0; i < names.length; i++) {
//            newNames[i] = names[i];
//        }
//
//        newNames[5] = "Name 6";
//        System.out.println(newNames[5]); //This gets the job done but so much code is involved

        ArrayList<String> names = new ArrayList<>();
        names.add("Name 1");
        names.add("Name 2");
//        System.out.println(names.get(0));
//        System.out.println(names.size());
////        names.clear();
////        System.out.println(names.size());
//        names.remove("Name 1");
//        System.out.println(names.get(0));
//        System.out.println(names.contains("Name 2"));
//        names.remove("Name 2");
//        System.out.println(names.isEmpty());

//        System.out.println(names.indexOf("Name 2"));

//        for (int i=0; i< names.size(); i++) {
//            System.out.println(names.get(i));
//        }

        Map<String, String> emailList = new HashMap<>();
        emailList.put("Karan", "karan.chawla@gmail.com");
        emailList.put("Brad", "brad@gmail.com");
        System.out.println(emailList.get("Karan"));
        System.out.println(emailList.size());
        emailList.remove("Brad");
        System.out.println(emailList.containsKey("Brad"));
        System.out.println(emailList.containsValue("karan.chawla@gmail.com"));


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Karan", 15));
        students.add(new Student("Sarah", 18));

        for (Student s: students) {
            System.out.println(s.getName());
        }
    }
}
