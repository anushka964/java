import java.util.*;
public class demo{
    public static void main(String args[]){
      Scanner sc = new Scanner (System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println("Please select an option = ");
      int button = sc.nextInt();
      switch(button){
        case 1:
        System.out.println("Sum = "+(a+b));
        break;
        case 2:
        System.out.println("Diffrence = "+(a-b));
        break;
        case 3:
        System.out.println("Product = "+(a*b));
        break;
        case 4:
        System.out.println("Division = "+(a/b));
        break;
        default:System.out.println("Invalid input");


        }

        
        int fact = 1;
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
          fact=fact*i;

        }System.out.println(fact);
        
    }
}