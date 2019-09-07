package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class GeneralSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

//        String s1 = "abckjhdlikkkk";
//        String s2 = "abdlikkkkdsfdfdf";

        ArrayList<String> generalSubstrings = new ArrayList<>();
        StringBuilder generalSubstring = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (i < s1.length()) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        generalSubstring.append(s1.charAt(i));
                        i++;
                    }
                }
            }
            generalSubstrings.add(generalSubstring.toString());
            generalSubstring = new StringBuilder();
        }

        System.out.println(maxLengthGeneralSubString(generalSubstrings));

    }

    private static String maxLengthGeneralSubString(ArrayList<String> generalSubstrings) {
        String maxLengthGeneralSubString = generalSubstrings.get(0);

        for (int i = 0; i < generalSubstrings.size() - 1; i++) {
            for (int j = i + 1; j < generalSubstrings.size(); j++) {
                if (generalSubstrings.get(j).length() > generalSubstrings.get(i).length()) {
                    maxLengthGeneralSubString = generalSubstrings.get(j);
                }
            }
        }
        return maxLengthGeneralSubString;
    }

}
