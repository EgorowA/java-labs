package lab6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public void execute() {
        String[] testCases = {
                "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago",
                "simple test",
                "1234 only numbers",
                "null",
                null
        };

        System.out.println("Task 2");

        for (String test : testCases) {
            try {
                String result = transformWordsToUppercase(test);
                System.out.printf("Original: '%s'%nTransformed: '%s'%n%n", test, result);
            } catch (Exception e) {
                System.out.printf("Input: '%s' -> Error: %s%n%n", test, e.getMessage());
            }
        }
    }

    public static String transformWordsToUppercase(String input) {
        if (input == null) {
            throw new NullPointerException("Input string cannot be null");
        }

        Pattern pattern = Pattern.compile("\\b[a-zA-Z]+\\b");
        Matcher matcher = pattern.matcher(input);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            matcher.appendReplacement(result, matcher.group().toUpperCase());
        }
        matcher.appendTail(result);

        return result.toString();
    }
}
