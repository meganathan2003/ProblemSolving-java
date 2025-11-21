package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.List;

public class BaseBallGame {

    // create a new static method

    public static int calPoints(String[] operations) {

        if (operations.length == 0) {
            return 0;
        }

        List<Integer> record = new ArrayList<>();

        for (String operation : operations) {
            if (operation.equals("C")) {

                if (!record.isEmpty()) {
                    record.remove(record.size() - 1);
                }
            } else if (operation.equals("D")) {

                if (!record.isEmpty()) {
                    record.add(2 * record.get(record.size() - 1));
                }
            } else if (operation.equals("+")) {
                if (record.size() >= 2) {
                    record.add(record.get(record.size() - 1) + record.get(record.size() - 2));
                }
            } else {
                record.add(Integer.parseInt(operation));
            }
        }

        int score = 0;
        // here the record list we have to add
        for (int num : record) {
            score += num;
        }

        return score;
    }

    public static void main(String[] args) {

        String[] ops = { "5", "2", "C", "D", "+" };

        System.out.println(calPoints(ops));
    }

}
