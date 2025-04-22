import java.util.Scanner;
public class Array {
  public static void triangle(int max){
        for(int i = 1;i<=max;i++){
            

            System.out.println();
            for(int j=max;j>=i;j--){
                
                
                System.out.print(" ");
            }
            for(int k = 1;k<=(2*i)-1;k++){
                if (i ==1) {
                    System.out.print("*");
                    break;
                }
                if(i==max){
                    if(k%2 == 0){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else
                {
                  if(k==1 || k == (2*i)-1){
                    System.out.print("*");
                  }
                  else{
                     System.out.print(" ");
                  }
                }            
            }
        }
    }
 
   public static void main(String[] arg){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size of the triangle: ");
            int max = input.nextInt();
            triangle(max);
            input.close();
        
    }
}
