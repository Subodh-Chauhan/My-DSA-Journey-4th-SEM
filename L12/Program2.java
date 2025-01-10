
import java.util.Arrays;



class Program2{
    public static void main(String args[]){
    int[] arr = {1,2,3,4,5};
    System.out.println(Arrays.toString(arr));
    swap(arr,0,1);
    System.out.println(Arrays.toString(arr));
    }
static void swap(int[] farr,int a,int b){
    int temp = farr[a];
    farr[a] = farr[b];
    farr[b] = temp;
}
}
 