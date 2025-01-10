import java.util.Scanner;
class Problem1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.err.print("Please Enter the Salary here--> ");
        int empSal = scan.nextInt();
        if(empSal>10000){
            empSal+=2000;
            System.out.println("Salary including bonus is: "+ empSal);
        }else{
            empSal+=1000;
            System.out.println("Salary including bonus is: "+ empSal);
        }

    }

}