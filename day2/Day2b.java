package me.marcsteiner.aoc;

import org.apache.commons.text.similarity.LevenshteinDistance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Day2 {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("input.txt"));

        for (String line : lines) {
            for (String line2 : lines) {
                int i = LevenshteinDistance.getDefaultInstance().apply(line, line2);

                if (i == 1) {
                    System.out.println(line + " / " + line2);
                    return;
                }
            }
        }
    }

}
