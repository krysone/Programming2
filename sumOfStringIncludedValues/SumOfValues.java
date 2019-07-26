package sumOfStringIncludedValues;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfValues {

    public int addFoundValues(String toBeAnalyzed) {

        System.out.println("Numbers extracted from the string: " + toBeAnalyzed + " are as follow:");

        int sumOfFoundValues = 0;

        //we create an array of strings separated by none-digits and "-" sign
        String[] splitedValues = toBeAnalyzed.split("[^0-9\\-]+");
        List<String> values = new ArrayList<>();

        //here Im making sure that the negative values are respected and that whenever there is more than 1 '-' only
        // only 1 is being taken into account
        for (String splitedVal : splitedValues) {
            int minusIndex = splitedVal.indexOf('-');
            if (splitedVal.contains("-")) {
                if (minusIndex > 0) {
                    String substring1 = splitedVal.substring(0, minusIndex);
                    String substring2 = splitedVal.substring(minusIndex);
                    values.add(substring1);
                    values.add(substring2);
                } else
                    for (String s : splitedVal.split("[\\-]+")) {

                        values.add("-" + s);
                    }
            } else
                values.add(splitedVal);
        }
        List<String> onlyValues = values.stream().filter(s -> s.length() > 0)
                .collect(Collectors.toList());

        for (String splitedVal : onlyValues) {

            if (!splitedVal.isEmpty() && splitedVal.matches("[\\-]?[0-9]+")) {
                int value = Integer.parseInt(splitedVal);
                System.out.println(value);
                sumOfFoundValues = sumOfFoundValues + value;
            }

        }
        System.out.println("TOTAL = " + sumOfFoundValues);
        return sumOfFoundValues;
    }







   /* public  class Value{
ArrayList<Character> digitList;
    }


    public  int addFoundValues(String toBeAnalyzed) {
        String numbers = "0123456789";
        char[] numberArray = numbers.toCharArray();
        int sumOfFoundValues = 0;
        char[] charArray = toBeAnalyzed.toCharArray();
        ArrayList<Character> values = new ArrayList<>();
        ArrayList<Value> separateValues = new ArrayList<>();
        ArrayList<Character> digitList;
        boolean skip = false;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                skip = true;
            }else if (Character.isDigit(charArray[i])){
                skip = false;
            }
            while (skip == false) {
                Value separateVal = new Value();
                separateVal.digitList.add(charArray[i]);
            }

        }



        return sumOfFoundValues;

    }*/
}
