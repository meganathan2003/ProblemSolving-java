package com.problems.zoho;

import java.util.*;

/**
 * Day 08
 */
public class SalaryHikeToEmployees {

    public static List<Map<String, Object>> salaryHikeToEmployees(List<Map<String, Object>> employees) {

        if (employees.isEmpty()) {
            return new ArrayList<>();
        }

        // Run the loop and get the rating 
        for (Map<String, Object> emp : employees) {

            int salary = (int) emp.get("salary");
            int rating = (int) emp.get("rating");


            // Check the condition for ratings
            if (rating == 5) {
                salary += (int) Math.round(salary * 0.20);
            } else if (rating == 4) {
                salary += (int) Math.round(salary * 0.10);
            } else if (rating == 3) {
                salary += (int) Math.round(salary * 0.05);
            }

            emp.put("salary", salary);
            emp.put("rating", 0); // update panurom rating eh

        }
        return employees;

    }


    public static void main(String[] args) {

        List<Map<String, Object>> employees = new ArrayList<>(Arrays.asList(
                new HashMap<String, Object>() {{
                    put("name", "Meganathan");
                    put("salary", 70000);
                    put("rating", 4);
                }},
                new HashMap<String, Object>() {{
                    put("name", "Dinesh");
                    put("salary", 50000);
                    put("rating", 5);
                }},
                new HashMap<String, Object>() {{
                    put("name", "Subha");
                    put("salary", 60000);
                    put("rating", 3);
                }}
        ));

        System.out.println(salaryHikeToEmployees(employees));
    }

}
