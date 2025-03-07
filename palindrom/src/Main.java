import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int num=sc.nextInt();
        int temp,temp2;
        temp2=num;
        int sum=0;
        while (temp2> 0) {
            temp=temp2%10;
            sum=sum*10+temp;
            temp2=temp2/10;
        }
        if(sum==num){
            System.out.println("the number is a palindrome.");
        }
        else{
            System.out.println("the number is not a palindrome.");
        }
    }
}