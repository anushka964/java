import java.util.*;
public class Function{
    /*public static void printMyName(String name){
        System.out.println(name);
        return;
    }*/
    /*public static int CalculateSum(int a,int b){
        int sum = a+b;
        return sum;
    }*/

    //PRODUCT
    /*public static int CalculateProduct(int a,int b){
        int product=a*b;
        return product;
    }*/

    //FACTORIAL
    public static void printFactorial(int n){
        int fact =1;
        for(int i=n;i>=1;i--){
            fact =fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);


       // String name = sc.next();
        //printMyName(name); //calling the function

      //  int a = sc.nextInt();
        //int b = sc.nextInt();


        //int sum =CalculateSum(a,b);
        //System.out.println("Sum of two number s = "+sum);


      //  int product=CalculateProduct(a,b);
        //System.out.println("Product of two numbers = "+product);
    int n=sc.nextInt();
    printFactorial(n);
}
}