package org.spituk.study.programs;

import java.util.Stack;

/**
 * The HelloWorld program implements an application that simply displays "Hello World!" to the standard output.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/8/2018
 */
public class DecimalNumberConversion {

    public String covertToBinary(final int number) {
        Stack<Integer> integers = new Stack<>();
        int numberToConvert = number;
        while (numberToConvert > 0) {
            integers.push(numberToConvert % 2);
            numberToConvert = numberToConvert / 2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!integers.empty()) {
            stringBuilder.append(integers.pop());
        }
        return stringBuilder.toString();
    }

    public String convertToRomam(final int number) {
        int numberToConvert = number;
        StringBuilder romanNumber = new StringBuilder();
        while (numberToConvert > 0) {
            if (numberToConvert >= 1000) {
                romanNumber.append("M");
                numberToConvert = numberToConvert - 1000;
            } else if (numberToConvert >= 900) {
                romanNumber.append("CM");
                numberToConvert = numberToConvert - 900;
            } else if (numberToConvert >= 500) {
                romanNumber.append("D");
                numberToConvert = numberToConvert - 500;
            } else if (numberToConvert >= 400) {
                romanNumber.append("CD");
                numberToConvert = numberToConvert - 400;
            } else if (numberToConvert >= 100) {
                romanNumber.append("C");
                numberToConvert = numberToConvert - 100;
            } else if (numberToConvert >= 90) {
                romanNumber.append("XC");
                numberToConvert = numberToConvert - 90;
            } else if (numberToConvert >= 50) {
                romanNumber.append("L");
                numberToConvert = numberToConvert - 50;
            } else if (numberToConvert >= 40) {
                romanNumber.append("XL");
                numberToConvert = numberToConvert - 40;
            } else if (numberToConvert >= 10) {
                romanNumber.append("X");
                numberToConvert = numberToConvert - 10;
            } else if (numberToConvert >= 9) {
                romanNumber.append("IX");
                numberToConvert = numberToConvert - 9;
            } else if (numberToConvert >= 5) {
                romanNumber.append("V");
                numberToConvert = numberToConvert - 5;
            } else if (numberToConvert >= 4) {
                romanNumber.append("IV");
                numberToConvert = numberToConvert - 4;
            } else if (numberToConvert >= 1) {
                romanNumber.append("I");
                numberToConvert = numberToConvert - 1;
            }
        }
        return romanNumber.toString();
    }
}
