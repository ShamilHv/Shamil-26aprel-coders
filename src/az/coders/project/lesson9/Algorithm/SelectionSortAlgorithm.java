package az.coders.project.lesson9.Algorithm;

public class SelectionSortAlgorithm {


    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 4, 6, 5, 9};
        int startIndex = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                }
                if (arr[startIndex] > arr[i]) {
                    int temp = arr[startIndex];
                    arr[startIndex] = arr[i];
                    arr[i] = temp;
                    startIndex += 1;
                }
            }
        }
    }
}
