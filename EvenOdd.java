import java.util.*;
public class EvenOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("Even");
        }
        else
            System.out.println("Odd");
    }
}