package az.coders.project.lesson5;

public class FindINArray {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 15, 6, 1, 7, 8};
        int min = findMinimum(arr);
        int max = findMaximum(arr);
        System.out.println("Minimum Number in the array is: " + min + ", Maximum Number in the array is " + max);

    }

    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMaximum(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}

