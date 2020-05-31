package com.company;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static int[] liczZnakiSlowa(String fileName) throws IOException {

        File file = new File(fileName);
        Scanner input = new Scanner(file);
        int[] tab= new int[3];
        tab[0] = 0;
        tab[1] = 0;
        tab[2] = 0;

        long lineCount = Files.lines(Paths.get(fileName)).count();

        if (lineCount==1){
            String zdanie = input.nextLine();
            tab[0] = zdanie.length();
        }
        else {
            for (int i = 0; i < lineCount; i++){
                String zdanie = input.nextLine();
                tab[0] = tab[0] + zdanie.length();

                for (int j = 0; j < zdanie.length(); j++){
                    char znak;
                    int kodAscii;
                    znak = zdanie.charAt(j);
                    kodAscii = (int)znak;


                    if (kodAscii == 32 || kodAscii == 9){
                        tab[1]++;
                    }
                }
            }
        }
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            scanner.next();
            tab[2]++;
        }
        scanner.close();
        return tab;
    }

    public static void main(String[] args) throws IOException {



        int[] tab = liczZnakiSlowa("tekst.txt");

        System.out.println("Liczba znakow: " + tab[0]);
        System.out.println("Liczba białych znaków: " + tab[1]);
        System.out.println("Liczba słów: " + tab[2]);



    }
}
