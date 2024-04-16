import java.util.*;
public class oddEven{
    public static void main(String args[]){
       System.out.print("Enter number = ");
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();
        
       /*  if(Num==1){
            System.out.println("Hello"); 
        }
        else if (Num==2) {
            System.out.println("hallo");
        } else if (Num==3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("invalid input");
        }*/
    switch (Button){
     case 1:System.out.println("Guten Morgan");
     break;
     case 2:System.out.println("Guten Abend");
     break;
     case 3:System.out.println("Hallo");
     break;
     default:System.out.println("invalid input");        
    }
    }
}
