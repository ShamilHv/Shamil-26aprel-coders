package az.coders.project.lesson7.Algorithm;

public class Task2 {
    public static void main(String[] args) {
        findLongestWord("sjdfhks df dsfskdfdjs sdfskjnssdknj sdfjms");
    }
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
