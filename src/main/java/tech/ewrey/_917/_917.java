package tech.ewrey._917;

import java.util.Arrays;
import java.util.Stack;

public class _917 {

    public static void main(String[] args) {
//        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    /*
        Проходимся по массиву s.toCharArr
            Если arr[i] == буква, то кладем в stack

        Проходимся снова по массиву s.toCharArr
            Если arr[i] == буква, то заменяем ее на stack.pop

        Возвращаем arr.toString
     */
    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char i : chars) {
            if (Character.isAlphabetic(i)) stack.add(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isAlphabetic(chars[i])) {
                chars[i] = stack.pop();
            }
            sb.append(chars[i]);
        }

        return sb.toString();
    }

}
