public class Pattern2 {
  public static void main(String args[]){
    int n=5;
    int m=4;
    //outer loop
    for(int i=1;i<=m;i++){  //for row
          //inner loop
        for(int j=1;j<=n;j++){
            if(i==1 || i==m || j==1 || j==n){
          System.out.print("*");
        }
         else{
            System.out.print(" ");
        }
        }
        System.out.println(" ");
    }
  }  
}
