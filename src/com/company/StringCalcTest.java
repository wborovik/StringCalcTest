package com.company;

import java.util.Scanner;

public class StringCalcTest {

 static Scanner scan = new Scanner(System.in);

 static PlusAndMinus plusminus = new PlusAndMinus();
 static MultiplyAndDivision multiplydivision = new MultiplyAndDivision();

    public static void main(String[] args) {

        plusminus.zero = 0;
        multiplydivision.zero = 0;

        System.out.println("Input:");

        String inputOperation;
        inputOperation = scan.nextLine();

        System.out.println("Output:");

        if (inputOperation.startsWith("\"") && inputOperation.endsWith("\"")) {
            plusminus.inputOperation = inputOperation;
            plusminus.mathOperationPlusMinus();
        } else {
            multiplydivision.inputOperation = inputOperation;
            multiplydivision.mathOperation();
            multiplydivision.multiplyDivisionString();
        }
    }
}
