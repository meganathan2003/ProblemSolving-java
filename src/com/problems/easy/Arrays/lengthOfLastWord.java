package com.problems.easy.Arrays;
import java.util.Arrays;

public class lengthOfLastWord {
    public static int solution(String s){
        String str = s;
        String[] parts = s.split("\\s+"); // for spilt the parts using spaces
        for(String part :parts){
            str = part;
        }
        return str.length();
    }

    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
         int res = solution(str);
         System.out.println(res);
    }
}
