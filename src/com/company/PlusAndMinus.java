package com.company;

public class PlusAndMinus {

    String inputOperation;
    String oneArgument;
    String twoArgument;
    String mathOperator;
    String[] valueArguments;
    String sumOrDifference;

    int zero;

    public void mathOperationPlusMinus() {

        if (inputOperation.startsWith("\"") && inputOperation.endsWith("\"")) {

            valueArguments = inputOperation.split("[\"]");

            oneArgument = valueArguments[1];
            twoArgument = valueArguments[3];
            mathOperator = valueArguments[2].trim();

            if (valueArguments.length > 4) {
                zero = 1 / zero;
            }

            if (mathOperator.equals("+") || mathOperator.equals("-")) {

                if (oneArgument.length() <= 10 && twoArgument.length() <= 10) {

                    if (mathOperator.equals("+"))
                        sumOrDifference = oneArgument + twoArgument;
                    if (mathOperator.equals("-"))
                        sumOrDifference = oneArgument.replace(twoArgument, "");
                } else {
                    zero = 1 / zero;
                }
            } else {
                zero = 1 / zero;
            }
        } else {
            zero = 1 / zero;
        }

        System.out.println("\"" + sumOrDifference + "\"");
    }
}
