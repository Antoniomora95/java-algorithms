package com.amora;
import java.util.Objects;
import java.util.Scanner;

//https://codeforces.com/contest/158
public class MaximizeTaxis {
    private static void getMinimumTaxis(String [] groups) {
        int partialGroupsWithOne = 0;
        int partialGroupsWithTwo = 0;
        int partialGroupsWithThree = 0;
        int fullGroupsWithFour = 0;

        for (String g : groups) {
            if (Objects.equals(g, "1")) {
                partialGroupsWithOne += 1;
            } else if (Objects.equals(g, "2")) {
                partialGroupsWithTwo += 1;
            } else if (Objects.equals(g, "3")) {
                partialGroupsWithThree += 1;
            } else {
                fullGroupsWithFour += 1;
            }
        }

        if(partialGroupsWithThree > 0 && partialGroupsWithOne > 0) {
            partialGroupsWithOne = Math.max(partialGroupsWithOne - partialGroupsWithThree, 0);
        }
        double fullAndPartialTaxisOneAndTwo = (double) partialGroupsWithTwo / 2 + (double) partialGroupsWithOne / 4;
        int fullTaxisForOneAndTwo = (int) Math.ceil(fullAndPartialTaxisOneAndTwo);

        int totalTaxis = fullGroupsWithFour + partialGroupsWithThree + fullTaxisForOneAndTwo;
        System.out.println(totalTaxis);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String secondLine = sc.nextLine();
        sc.close();
        String[] groups = secondLine.split(" ");
        getMinimumTaxis(groups);
    }
}
