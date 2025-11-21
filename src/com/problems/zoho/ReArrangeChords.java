package com.problems.zoho;

import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

/**
 * Day 16
 *
 * @author Meganathan
 */

public class ReArrangeChords {

    public static String reArrangeChords(String chords) {
        if (chords.isEmpty()) {
            return "";
        }

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : chords.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int n = chords.length();
        int maxFreq = 0;
        for (int freq : freqMap.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }
        if (maxFreq > (n + 1) / 2) {  // 3 > (9 + 1) / 2 = 5
            return "Not Possible";
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(freqMap.entrySet());

        StringBuilder result = new StringBuilder();
        Map.Entry<Character, Integer> prev = null;

        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> current = maxHeap.poll();
            result.append(current.getKey()); // getkey returns the keys

            // decrease frequency and tracking the pre one
            current.setValue(current.getValue() - 1);

            if (prev != null && prev.getValue() > 0) {
                maxHeap.offer(prev);
            }

            prev = current;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String chords = "AAABBBCCC";
        System.out.println(reArrangeChords(chords));

        String impossibleChords = "AAAA";
        System.out.println(reArrangeChords(impossibleChords));
    }
}
