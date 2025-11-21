package com.problems.easy.Arrays;

import java.util.Arrays;

public class GoalParserInterpretation {
    // Create a static method

    public static String interpret(String command) {
        // validation
        if (command.isEmpty()) {
            return "";
        }

        String result = command.replace("()", "o");

        // Replace "(al)" with "al"
        result = result.replace("(al)", "al");

        return result;

    }


    public static void main(String[] args) {
        String command = "G()()()()(al)";

        System.out.println(interpret(command));
    }

}
