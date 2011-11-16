import java.math.*;
import java.text.*;
import java.util.*;

/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then 
there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, 
how many letters would be used?


NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) 
contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" 
when writing out numbers is in compliance with British usage.
*/
public class Sol17 extends BaseSolution {
    public void runSolution() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += countLetters(getWords(i));
        }
        System.out.println(sum);
    }

    private static Map<Integer, String> wordMap = new HashMap<Integer, String>();
    static {
        wordMap.put(0, "zero");
        wordMap.put(1, "one");
        wordMap.put(2, "two");
        wordMap.put(3, "three");
        wordMap.put(4, "four");
        wordMap.put(5, "five");
        wordMap.put(6, "six");
        wordMap.put(7, "seven");
        wordMap.put(8, "eight");
        wordMap.put(9, "nine");
        wordMap.put(10, "ten");
        wordMap.put(11, "eleven");
        wordMap.put(12, "twelve");
        wordMap.put(13, "thirteen");
        wordMap.put(14, "fourteen");
        wordMap.put(15, "fifteen");
        wordMap.put(16, "sixteen");
        wordMap.put(17, "seventeen");
        wordMap.put(18, "eighteen");
        wordMap.put(19, "nineteen");
        wordMap.put(20, "twenty");
        wordMap.put(30, "thirty");
        wordMap.put(40, "forty");
        wordMap.put(50, "fifty");
        wordMap.put(60, "sixty");
        wordMap.put(70, "seventy");
        wordMap.put(80, "eighty");
        wordMap.put(90, "ninety");
        wordMap.put(100, "hundred");
        wordMap.put(1000, "thousand");
    }

    public String getWords(int i) {
        StringBuilder words = new StringBuilder();
        while (i >= 1) {
            int target = 0;
            if (i >= 1000) {
                target = i / 1000;
                words.append(wordMap.get(target) + " " + wordMap.get(1000));
                i = i % 1000;
            } else if (i >= 100) {
                if (words.length() > 0) words.append(" ");                
                target = i / 100;
                words.append(wordMap.get(target) + " " + wordMap.get(100));
                i = i % 100;                
                if (i != 0) words.append(" and");
            } else if (i >= 20) {
                if (words.length() > 0) words.append(" ");
                target = i / 10;
                words.append(wordMap.get(target * 10));
                i = i % 10;                  
                if (i != 0) words.append("-");                                 
            } else if (i >= 10 && i <= 19) {
                if (words.length() > 0) words.append(" ");
                words.append(wordMap.get(i));                
                break;
            } else {
                if (words.length() > 0 && words.charAt(words.length() - 1) != '-') words.append(" ");
                words.append(wordMap.get(i));                
                break;                
            }
        }
        System.out.println(words.toString());
        return words.toString();
    }

    public int countLetters(String words) {
        int sum = 0;
        for (int i = 0; i < words.length(); i++) {
            if (Character.isLetter(words.charAt(i))) {
                sum++;
            }
        }
        return sum;
    }
}