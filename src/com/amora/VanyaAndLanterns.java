package com.amora;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://codeforces.com/problemset/problem/492/B
public class VanyaAndLanterns {
    private static void printMinLanternLightRadious(int streetLength, List<Integer> lanternList) {

        List<Integer> orderedLanterns = lanternList.stream().
                sorted(Integer::compareTo).
                collect(Collectors.toList());

        double minimumLanternRadius = 0;

        minimumLanternRadius = orderedLanterns.get(0);

        for (int i = 0; i < orderedLanterns.size() - 1; i++) {
            double actualValue = orderedLanterns.get(i);
            double nextValue = orderedLanterns.get(i + 1);
            minimumLanternRadius = Math.max((nextValue - actualValue) / 2, minimumLanternRadius);
        }
        int fromLastToEndStreet = streetLength - orderedLanterns.get(orderedLanterns.size() - 1);
        minimumLanternRadius = Math.max(fromLastToEndStreet, minimumLanternRadius);
        System.out.println(minimumLanternRadius);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String lanternNumberAndLengthStreet = reader.readLine();
        String lanterns = reader.readLine();
        String[] lanternNumberAndLength = lanternNumberAndLengthStreet.split(" ");
        int streetLength = Integer.parseInt(lanternNumberAndLength[1]);
        List<Integer> lanternList = Arrays.stream(lanterns.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        printMinLanternLightRadious(streetLength, lanternList);
    }
}
