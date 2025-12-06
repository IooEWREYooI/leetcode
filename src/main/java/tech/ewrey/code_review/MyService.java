package tech.ewrey.code_review;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//@Service
// Изменить название в зависимости от что он делает
public class MyService {

    public static List<String> words = new ArrayList<>();

    public List<String> getWords() {
        words.clear();

        String response = requestRandomWord();
        System.out.println("make request and get result: " + response); // logging
        for (int i = 0; i < 10; i++) {
            try {
//                request = [{"word":"a"},{"word":"abc"}]
//                words.add(List<WordObjectDto>);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return words;
    }

    public boolean containsStringInFile(String csvFile, String str)  {
        if (csvFile == null || str == null) {
            throw new IllegalArgumentException("csvFile or str == null");
        }
        if (!csvFile.endsWith(".csv")) {
            throw new IllegalArgumentException("Working with not csv file");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            List<String> list = new ArrayList<>();

            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }

            return list.contains(str);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static String requestRandomWord() {
        return UUID.randomUUID().toString();
    }
}
