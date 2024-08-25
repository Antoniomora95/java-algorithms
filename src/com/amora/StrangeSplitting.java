package com.amora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrangeSplitting {

    private static void processOutput(int numberElements, List<Integer> elements) {
        int first = elements.get(0);
        int last = elements.get(elements.size() -1);
        if (first == last) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            String output = "R".repeat(numberElements - 1);
            System.out.println("B" + output);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine());

        for (int i = 0; i < testCases; i++) {
            int numberElements = Integer.parseInt(reader.readLine());
            List<Integer> elements = Stream.of(reader.readLine().split(" "))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());
            processOutput(numberElements, elements);
        }
    }
}
