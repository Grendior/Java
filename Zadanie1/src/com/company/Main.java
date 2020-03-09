package com.company;

public class Main {
    public static int Check(String a){

        int lastIndexOfString = a.length()-1;
        int countOf = 0;

        for (int i = 0; i < a.length(); i++){
            if (Character.toLowerCase(a.charAt(i)) == a.charAt(lastIndexOfString)){
                countOf++;
            }
        }
        return countOf;
    }

    public static void main(String[] args) {
        System.out.println(Check("Abrakadabra"));
    }
}
