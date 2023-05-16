package az.coders.project.lesson7.Algorithm;

public class Task3
{
    public static void main(String[] args) {
int arr[]={1,2,3,4,3,4,4,4};
        System.out.println(findMostRepeated(arr));

    }
    public static int findMostRepeated(int[] arr) {
        int mostRepeated = arr[0];
        int count = 1;
        int maxCount = 1;

        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostRepeated = arr[i];
            }
        }

        return mostRepeated;
    }
}
