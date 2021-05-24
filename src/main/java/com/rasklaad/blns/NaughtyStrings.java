package com.rasklaad.blns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class NaughtyStrings {

    private static final List<String> naughtyStrings;

    static {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(NaughtyStrings.class.getResourceAsStream("blns.txt")))) {
            naughtyStrings = reader.lines()
                    .filter((String it) -> !it.startsWith("#"))
                    .filter((String it) -> !it.isEmpty())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Can't read blns.txt file");
        }
    }


    public static List<String> getStrings() {
        return naughtyStrings;
    }
}
