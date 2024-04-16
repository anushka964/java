import java.util.*;
public class newpatterns{
    public static void main(String args[]){
        int n=5;

        /*1
          22
          333
          4444
          55555
         */
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
                System.out.print(i);
            }
           
            System.out.println();
        }*/

        /*
              *****
             *****
            *****
          *****
         */

        /*for (int a=1;a<=n;a++){
            //print spaces
            for (int b=1;b<=n-a;b++){
                System.out.print(" ");
            }
            for(int b=1;b<=n;b++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*
             1
            2 2
           3 3 3
          4 4 4 4
         5 5 5 5 5  
         */
         
         /*for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
 
 
            //numbers
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }*/
 
     //PRINT BUTTERFLY PATTERN FOR N=4
     //UPPER HALF
     for(int i=1;i<=4;i++){
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
     }

     //LOWER HALF
     for(int i=n; i>=1; i--) {
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }


        int spaces = 2 * (n-i);
        for(int j=1; j<=spaces; j++) {
            System.out.print(" ");
        }


        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    }
}