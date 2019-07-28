package com.sda.randomizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Utils {


    private static void readNames() throws IOException {
        Path source = Paths.get("D:\\RandomizerApp\\randomizer\\src\\main\\resources\\Name List.txt");
        List<String> lines = Files.readAllLines(source);
        lines.forEach(line -> System.out.println(line));
//        for (String line : lines) {
//            System.out.println(line);
//        }
    }
}
