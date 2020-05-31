package com.company;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;
import java.util.StringTokenizer;

public class Main {
    public static void szukaj(String nazwaPliku, String nazwaPlikWy, String slowo) throws IOException {

        File plik = new File(nazwaPliku);
        FileWriter wyjscie = new FileWriter(nazwaPlikWy);
        Scanner in = new Scanner(plik);
        long linie = Files.lines(Paths.get(nazwaPliku)).count();

        for(int i=1; i<=linie; i++) {
            String zdanie = in.nextLine();

            StringTokenizer stringtokenizer = new StringTokenizer(zdanie, " ");
            while (stringtokenizer.hasMoreTokens()) {
                String znalezionyWyraz = stringtokenizer.nextToken();
                if (znalezionyWyraz.equalsIgnoreCase(slowo))
                {
                    wyjscie.write(i+": "+zdanie+"\n");
                }
            }
        }
        wyjscie.close();
    }
    public static void main(String[] args) throws IOException {

        szukaj("tekst.txt", "wyjscie.txt", "egzamin");

    }
}
