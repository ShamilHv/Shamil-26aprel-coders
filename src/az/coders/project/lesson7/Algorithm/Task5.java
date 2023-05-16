package az.coders.project.lesson7.Algorithm;

public class Task5 {
    public static void main(String[] args) {
        String sentence="hello world, how are you?";
        System.out.println(capitalizeSentence(sentence));
    }

    public static String capitalizeSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1);
                capitalizedSentence.append(firstChar).append(restOfWord).append(" ");
            }
        }

        return capitalizedSentence.toString().trim();
    }

}
