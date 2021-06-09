package com.company;

import com.sun.source.tree.WhileLoopTree;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String lyrics = "Oh, Father tell me, do we get what we deserve?\n" +
                "Whoa, we get what we deserve\n\n" +
                "And way down we go\n" +
                "Way down we go\n" +
                "Say way down we go\n" +
                "Way down we go\n\n" +
                "You let your feet run wild\n" +
                "Time has come as we all, oh, go down\n" +
                "Yeah but for the fall, ooh, my\n" +
                "Do you dare to look him right in the eyes? Yeah\n\n" +
                "Oh, 'cause they will run you down, down 'til the dark\n" +
                "Yes and they will run you down, down 'til you fall\n" +
                "And they will run you down, down 'til you go\n" +
                "Yeah, so you can't crawl no more\n\n" +
                "And way down we go\n" +
                "Way down we go\n" +
                "Say way down we go\n" +
                "Oh, 'cause they will run you down, down 'til you fall\n" +
                "Way down we go\n\n" +
                "Oh baby, yeah\n" +
                "Oh, baby\n" +
                "Baby\n" +
                "Way down we go\n" +
                "Yeah\n\n" +
                "And way down we go\n" +
                "Way down we go\n" +
                "Say way down we go, ooh\n" +
                "Way down we go";
        Song song = new Song("Way Down We Go", "Kaleo", "Блюз-рок", lyrics);
        FileWriter fileWriter = new FileWriter("way down we go.txt");
        fileWriter.write(song.toString());
        fileWriter.close();
    }
}
