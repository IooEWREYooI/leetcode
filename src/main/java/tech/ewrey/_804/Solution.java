package tech.ewrey._804;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations("gin","zen","gig","msg"));
        System.out.println(uniqueMorseRepresentations("a"));
        System.out.println(uniqueMorseRepresentations("rwjje","aittjje","auyyn","lqtktn","lmjwn"));
    }

    public static int uniqueMorseRepresentations(String... words) {
        String[] arr = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int m = 0; m < word.length(); m++) {
                sb.append(arr[word.charAt(m) - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }

}
