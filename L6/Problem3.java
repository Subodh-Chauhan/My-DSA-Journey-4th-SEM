import java.util.Scanner;

public class Problem3 {
    public static void main(String args[]){
        System.out.println("Enter an no. --> ");
        Scanner scan= new Scanner(System.in);
        int inputNo = scan.nextInt();
        for(int i=2;i<=inputNo/2;i++){
            if(inputNo%i ==0){
                System.out.println("Its a prime no. and divisible by "+i);
                break;
            }else{
                System.out.println("Its not a prime no.");
            }
        } 
    }

}
