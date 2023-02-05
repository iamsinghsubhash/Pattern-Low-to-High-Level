public class NumberPyramidPattern{
    public static void main(String args[]){
        int n=5;
       //outer 
       for(int i=1;i<=5;i++){
        // space
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");
         }
        //star
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
       }
            
        }
    }
