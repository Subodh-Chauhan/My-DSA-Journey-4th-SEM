
import java.util.Arrays;
import java.util.Scanner;

class Program4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of elements u want to have in yr array.");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements here " );
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("The array u have entered is "+Arrays.toString(arr));
        reverse(arr);
        System.out.println("The reversed array is "+Arrays.toString(arr));
    }
static void reverse(int[] arr){
    int head =0;
    int tail =arr.length-1;
    while(head<tail){
        swap(arr,head,tail);
        head++;
        tail--;
    } 
}
static void swap(int[] arr,int head,int tail){
    int temp= arr[head];
    arr[head] = arr[tail];
    arr[tail]= temp;
}

}