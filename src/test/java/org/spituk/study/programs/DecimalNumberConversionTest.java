package org.spituk.study.programs;

/**
 * The HelloWorld program implements an application that simply displays "Hello World!" to the standard output.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/8/2018
 */
public class DecimalNumberConversionTest {

    public static void main(String[] args) {
        DecimalNumberConversion decimalNumberConversion = new DecimalNumberConversion();
        System.out.println(decimalNumberConversion.covertToBinary(12));
        System.out.println(decimalNumberConversion.convertToRomam(9));
        System.out.println(decimalNumberConversion.convertToRomam(3999));
    }

}
