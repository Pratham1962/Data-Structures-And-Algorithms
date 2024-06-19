import java.util.*;

class Pair {
    String word;
    int steps;

    public Pair(String word, int steps) {
        this.word = word;
        this.steps = steps;
    }
}

class Solution {
    public int minMutation(String beginWord, String endWord, String[] wordList) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(wordList)); 
        if (!wordSet.contains(endWord)) {
            return -1;
        }

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(beginWord, 0));
        wordSet.remove(beginWord);

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            String word = current.word;
            int steps = current.steps;

            if (word.equals(endWord)) {
                return steps;
            }

            for (int i = 0; i < word.length(); i++) {
                 for (char ch : new char[]{'A', 'C', 'G', 'T'}) {
                    char[] charArray = word.toCharArray();
                    charArray[i] = ch;
                    String newWord = new String(charArray);

                    if (wordSet.contains(newWord)) {
                        wordSet.remove(newWord);
                        queue.offer(new Pair(newWord, steps + 1));
                    }
                }
            }
        }

        return -1;
    }
}
