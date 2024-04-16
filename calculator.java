import java.util.*;
public class calculator{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter any two Numbers = ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.print("Choose an operation = ");
    
    int operation = sc .nextInt();
   
    switch(operation){
        case 1 : 
        System.out.print(a+b);
        
        break;
        case 2:  System.out.print( a*b);
        
        break;
        case 3 : if(b==0){
            System.out.println("invalid denominator");
        }
        else{ System.out.println(a/b);}
       
        break;
        case 4 : System.out.println(a%b);
        break;
        default : System.out.println("invalid input");
    }

    }
}