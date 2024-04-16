import java.util.*;
public class patterns{
    public static void main(String args[]){
        /*Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();*/

        /*SOLID RECTANGLE */
        int n = 4;
        int m = 5;
        /*for(int i=1;i<=n;i++){
            for(int j= 1;j<=m;j++){
            System.out.print("*");
        }
        System.out.println("*");

    }*/


    // HOLLOW RECTANGLE
 /*for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               if(i == 0 || i == n-1 || j == 0 || j == m-1) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }*/

    //HALF PYRAMID
    
   /*  for(int i=1;i<=4;i++){
        for(int j =1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }   */

    // INVERTED PYRAMID
    /*for(int i=4;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

    } */
    // N IS 4 HERE IN ALL CODE
    /*for(int i=n; i>=1; i--) {
        for(int j=1; j<i; j++) {
            System.out.print(" ");
        }


        for(int j=0; j<=n-i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }*/

    // NUMBER HALF PYRAMID
    /*for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }*/

    //Inverted Half Number Pyramid
    /*  for(int i=n;i>=1;i--){
        for(int j =1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }*/
  
     //FLOYD'S TRIANGLE
     /*int k=1;
     for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(k);
            k++;
        }
        System.out.println();
     }*/
     
     // 0 AND 1 PYRAMID
     int a=5;
     for (int i=1;i<=a;i++){
        for(int j=1;j<=i;j++){
            int sum =i+j;
            if(sum % 2 ==0)//even sum print 0
            {
                System.out.print("0");
            }else{//sum odd print 1
                System.out.print("1");
            }

            }
            System.out.println();
        }
     }
    }  


