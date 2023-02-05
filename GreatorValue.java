import java.util.*;
public class GreatorValue{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enetr the value of a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int c=sc.nextInt();
        if(a==b)
        System.out.println("Equal");
        else if(a<b)
        System.out.println("a is less than");
        else
        System.out.println("a is greater than");
    }
}