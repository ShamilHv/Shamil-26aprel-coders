package az.coders.project.lesson10;

public class BiggestArrayRecursion {

    public static void main(String[] args) {

        int arr[] = {3, 4, 5, 6, 1};
        System.out.println(Biggest(arr,arr.length-1));
    }
    static int Biggest(int arr[],int index){
        if (index==0){
            return arr[0];
        }else{
            int indexNow=arr[index];
            int maxRest=Biggest(arr,index-1);
            return Math.max(indexNow,maxRest);

        }

    }
}
