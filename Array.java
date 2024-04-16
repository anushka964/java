import java.util.*;
public class Array{
public static int  linearSearch(int Marks[],int key){
    for(int i=0;i<Marks.length;i++){
        if (Marks[i]==key){
            return i;
        }
        
    }
    return -1;

}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int Marks[]= new int[size];
        //input
        for(int i= 0;i<size;i++){
            Marks[i]=sc.nextInt();
        }
        System.out.print("Enter key number = ");
        int key= sc.nextInt();
        //output
        /*for(int i=0;i<size;i++){
            System.out.print( Marks[i]);
        }*/

        //SEARCH A NUMBER IN ARRAY
        //output
       /* System.out.println("Enter the element u want to search = ");
        int x= sc.nextInt();
        for(int i=0;i<Marks.length;i++){
            if(Marks[i]==x){
                System.out.println("X found at index = "+i);
            }
        }*/
        
        //Calling function
        //FUNCTION TO DO LINEAR SEARCH 
        int index = linearSearch(Marks, key);
        if (index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("Key found at index = "+index);
        }

    }
}