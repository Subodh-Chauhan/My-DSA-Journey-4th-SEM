import java.util.Scanner;

class Program1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. to be searched. ");
        int n = scan.nextInt();
        int[] arr= {18,12,9,14,77,50};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("yes it exist in the array");
                break;
            }else if(i==arr.length-1){
                System.out.println("No it is not in the list");
            }
        }
    }
}