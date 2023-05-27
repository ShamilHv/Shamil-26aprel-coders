package az.coders.project.lesson10;

public class SumArrayRecursion {
    public static void main(String[] args) {
         int arr[]= {1,2,3,4,5};
        int i= arr.length;
        System.out.println(Sum(arr,arr.length-1));
    }
    static int Sum(int arr[],int index) {
if (index<0){
    return 0;
}
    return arr[index]+Sum(arr,index-1);



    }

}
