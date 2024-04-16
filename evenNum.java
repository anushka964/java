import java.util.*;
public class evenNum{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
       
        int input;
       
        do{ 
             System.out.println("Enetr marks = ");
            int marks = sc.nextInt();
        
            if(marks>=90){
                System.out.println("good");
            }
            else if(marks<=89 && marks>=60){
                System.out.println("vgood");
            }
            else if(marks<= 59 && marks>=0){
                System.out.println("vvgood");
            }
            else{
                System.out.println("invalid");
            }
            
            System.out.println("Do you want to continue = yes(1) No(0)");
             input= sc.nextInt();
        }   while(input==1);
    }
            
        
        
        
        
        
    }
