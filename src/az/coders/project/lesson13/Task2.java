package az.coders.project.lesson13;
interface Pair<K, V> {
    K getKey();
    V getValue();
}

public class Task2 {
    static class StringIntegerPair implements Pair<String, Integer> {
        private String key;
        private Integer value;

        public StringIntegerPair(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public Integer getValue() {
            return value;
        }
    }


        public static void main(String[] args) {
            Pair<String, Integer> pair = new StringIntegerPair("Example", 42);

            String key = pair.getKey();
            Integer value = pair.getValue();

            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        }
}
