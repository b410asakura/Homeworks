package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("break me baby.txt");
        Scanner scanner = new Scanner(fileReader);
        Song song = new Song();
        song.setName(scanner.nextLine());
        song.setSinger(scanner.nextLine());
        song.setGenre(scanner.nextLine());
        String lyrics = "";
        for (int i = 0; scanner.hasNextLine(); i++) {
            lyrics = lyrics + scanner.nextLine() + "\n";
        }
        song.setLyrics(lyrics);

        System.out.println(song);
    }
}
