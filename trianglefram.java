import java.util.Scanner;
public class trianglefram {
  public static void triangle(int max){
        for(int i = 1;i<=max;i++){
           
            System.out.println();
            for(int j=max;j>=i;j--){
                if(j==max && i != 1){
                    System.out.print("*");
                }
                if(i==1){
                    int c;
                         for(c=1; c<=max; c++) {
                            if(c%2 == 0){
                            System.out.print(" ");
                            }
                            else{
                            System.out.print("*");
                            }
                            
                        }
                        break;
                }
                else{
                System.out.print(" ");
                }
            }
            
            for(int k = 1;k<=(2*i)-1;k++){
                if (i ==1) {
                    System.out.print(" *");
                
                    for(int c=0; c<=max; c++) {
                       if(c%2 == 0){
                       System.out.print(" ");
                       }
                       else{
                       System.out.print("*");
                       }

                    }
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
            
            
            if(i!=1){
            for(int j = max; j>=i-1;j--){
                if(j== i-1){
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
