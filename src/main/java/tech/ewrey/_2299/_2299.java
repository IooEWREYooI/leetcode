package tech.ewrey._2299;

import java.util.List;

public class _2299 {

    public static void main(String[] args) {
//        System.out.println(strongPasswordCheckerII("IloveLe3tcode!"));
//        System.out.println(strongPasswordCheckerII("Me+You--IsMyDream"));
//        System.out.println(strongPasswordCheckerII("1aB!"));
        System.out.println(strongPasswordCheckerII("aA0!bB1@@3rbHkB8Puvl"));
    }

    /*
        В нём не менее 8 символов.
        В нём есть по крайней мере одна строчная буква.
        В нём есть по крайней мере одна заглавная буква.
        В нём есть по крайней мере одна цифра.
        В нём есть по крайней мере один специальный символ.
            Специальные символы — это символы из следующей строки: "!@#$%^&*()-+".
        В нём нет 2 одинаковых символов в соседних позициях (то есть "aab" нарушает это условие, а "aba" — нет).
     */
    public static boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) return false;

        char[] arr = password.toCharArray();
        boolean isLowLetter = false;
        boolean isUpLetter = false;
        boolean isNumeric = false;
        boolean isSpecSym = false;
        List<Character> specs = List.of('!','@','#','$','%','^','&','*','(',')','-','+');

        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            if (j < arr.length) {
                if (arr[i] == arr[j]) return false;
            }

            if (Character.isDigit(arr[i])) isNumeric = true;
            if (Character.isLowerCase(arr[i])) isLowLetter = true;
            if (Character.isUpperCase(arr[i])) isUpLetter = true;
            if (specs.contains(arr[i])) isSpecSym = true;

        }

        return isNumeric && isLowLetter && isUpLetter && isSpecSym;
    }

}
