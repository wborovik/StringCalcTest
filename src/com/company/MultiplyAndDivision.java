package com.company;

public class MultiplyAndDivision {

    String inputOperation;
    String oneArgument;
    String argumentQuotes;
    String nextArgument;
    String twoArgumentString;
    String mathOperator;
    String[] valueArguments;
    StringBuilder stringValue;

    int twoArgumentNum;
    int lengthDivision;
    int zero;

    public void mathOperation() {

        if (inputOperation.startsWith("\"")) {

            valueArguments = inputOperation.split("[\"]");

            oneArgument = valueArguments[1];
            argumentQuotes = valueArguments[2];

            nextArgument = inputOperation.replace("\"" + oneArgument + "\"", "").trim();
            mathOperator = nextArgument.substring(0, 1);

            twoArgumentString = nextArgument.replace(mathOperator, "").trim();

            twoArgumentNum = Integer.parseInt(twoArgumentString);
        } else {
            zero = 1 / zero;
        }
    }

    public void multiplyDivisionString() {

        if (oneArgument.length() <= 10 && twoArgumentNum >= 1 && twoArgumentNum <= 10) {

            if (mathOperator.equals("*") || mathOperator.equals("/")) {

                if (mathOperator.equals("*")) {

                    StringBuilder s = new StringBuilder();

                    for (int i = 1; i <= twoArgumentNum; i++) {
                        stringValue = s.append(oneArgument);
                    }
                }

                if (mathOperator.equals("/")) {

                    lengthDivision = oneArgument.length() / twoArgumentNum;
                    oneArgument = oneArgument.substring(0, lengthDivision);

                    StringBuilder s = new StringBuilder();
                    stringValue = s.append(oneArgument);
                }
            } else {
                zero = 1 / zero;
            }
        } else {
            zero = 1 / zero;
        }
        String multiplyOrDivision = stringValue.toString();
        if (multiplyOrDivision.length() > 40) {
            multiplyOrDivision = multiplyOrDivision.substring(0, 40) + "...";
        }

        System.out.println("\"" + multiplyOrDivision + "\"");
    }
}
