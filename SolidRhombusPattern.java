public class SolidRhombusPattern{
    public static void main(String args[]){
        int n=5;
       //outer 
       for(int i=1;i<=5;i++){
        // space
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");
         }
        //star
        for(int j=1;j<=5;j++){
            System.out.print("*");
        }
        System.out.println();
       }
            
        }
    }
