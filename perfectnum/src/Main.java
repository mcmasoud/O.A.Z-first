import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a integer : ");
        int n = sc.nextInt();
        int div=1;
        int sum=0;
        while(div<n){
            if(n%div==0){
                sum+=div;
            }
            div++;
        }if(sum==n){
            System.out.println("n is perfect number");
        }
    else{
        System.out.println("n is not perfect number");
    }
}}