package me.marcsteiner.aoc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day2 {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("input.txt"));

        int twoCount = 0;
        int threeCount = 0;

        for (String line : lines) {
            Map<String, Integer> map = new HashMap<>();
            for (char c : line.toCharArray()) {
                if (map.containsKey(Character.toString(c))) {
                    map.put(Character.toString(c), map.get(Character.toString(c)) + 1);
                    continue;
                }

                map.put(Character.toString(c), 1);
            }

            if (map.containsValue(2)) {
                twoCount++;
            }

            if (map.containsValue(3)) {
                threeCount++;
            }
        }

        System.out.println(twoCount * threeCount);
    }

}
