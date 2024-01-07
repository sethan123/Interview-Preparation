package Java_Numbers;

import java.util.Scanner;

public class NumberToWordExample1 {
	private static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    private static final String[] teens = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
    private static final String[] thousands = { "", "Thousand", "Million", "Billion" };

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        String words = "";
        for (int i = 0; number > 0; i++) {
            if (number % 1000 != 0) {
                words = convertToWordsLessThanThousand(number % 1000) + thousands[i] + " " + words;
            }
            number /= 1000;
        }

        return words.trim();
    }

    private static String convertToWordsLessThanThousand(int number) {
    	if (number == 0) {
            return "";
        } else if (number < 10) {
            return units[number] + " ";
        } else if (number < 20) {
            return teens[number - 10] + " ";
        } else if (number < 100) {
            return tens[number / 10] + " " + units[number % 10] + " ";
        } else {
            return units[number / 100] + " Hundred " + convertToWordsLessThanThousand(number % 100);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999999999) {
            System.out.println("Number out of range. Please enter a number between 0 and 999,999,999.");
        } else {
            String words = convertToWords(number);
            System.out.println("In words: " + words);
        }

        scanner.close();
    }
}