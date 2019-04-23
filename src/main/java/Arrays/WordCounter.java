package Arrays;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
import java.util.*;

public class WordCounter {
    List<String> words;
    Map<String, Integer> wordCount;
    public WordCounter(String... strings) {
        words = new ArrayList<>(Arrays.asList(strings));
        wordCount = new HashMap<>();
    }

    public Map<String, Integer> getWordCountMap() {
        for(String word : words)
        {
            if(!wordCount.containsKey(word))
                wordCount.put(word, 1);
            else
                wordCount.put(word, wordCount.get(word) + 1);
        }
        return wordCount;
    }
}
