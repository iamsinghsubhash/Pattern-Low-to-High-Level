import java.util.*;
public class SwitchPro{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int number=sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namste");
                break;
            case 3:
                System.out.println("Jai ram");
                break;
        
            default:
                System.out.print("Invalid Number");
                break;
        }
    }
}