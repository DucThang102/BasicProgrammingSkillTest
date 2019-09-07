package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    static Map<String, String> mapDictionary = new HashMap<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("    Từ điển");
            System.out.println("1. Nhập từ điển");
            System.out.println("2. Tra từ");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            int chosenFunction = scanner.nextInt();

            switch (chosenFunction) {
                case 1:
                    inputDictionary();
                    break;
                case 2:
                    lookup();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn lại chức năng");
                    break;
            }
        }
    }

    private static void lookup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập từ muốn tìm kiếm: ");
        String keyWord = scanner.nextLine();
        String result = mapDictionary.get(keyWord);
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Không tìm thấy");
        }
    }

    private static void inputDictionary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn nhập bao nhiêu từ: ");
        int numberOfWord = scanner.nextInt();
        scanner.nextLine();
        String englishWord, vietnameseWord;
        for (int i = 0; i < numberOfWord; i++) {
            System.out.println("Nhập từ tiếng anh: ");
            englishWord = scanner.nextLine();
            System.out.println("Nhập từ nghĩa tiếng việt: ");
            vietnameseWord = scanner.nextLine();
            mapDictionary.put(englishWord, vietnameseWord);
        }
    }
}
