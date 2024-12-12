package lab6;

public class task1 {
    public void execute() {
        String[] testCases = {"CAFE", "10", "FF", "1A3", "abc", null, "GHI"};

        System.out.println("Task 1");
        for (String test : testCases) {
            try {
                int result = hexStringToInt(test);
                System.out.printf("Hexadecimal string '%s' -> Integer: %d%n", test, result);
            } catch (Exception e) {
                System.out.printf("Hexadecimal string '%s' -> Error: %s%n", test, e.getMessage());
            }
        }
    }

    public static int hexStringToInt(String s) {
        if (s == null) {
            throw new NullPointerException("Input string cannot be null");
        }
        if (!s.matches("[0-9A-Fa-f]+")) {
            throw new IllegalArgumentException("Input string is not a valid hexadecimal number");
        }

        return Integer.parseInt(s, 16);
    }
}

