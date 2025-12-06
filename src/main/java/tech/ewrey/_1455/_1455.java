package tech.ewrey._1455;

public class _1455 {

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger", "burg"));
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith(searchWord)) return i + 1;
        }
        return -1;
    }

}
