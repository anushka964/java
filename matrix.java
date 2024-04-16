import java.util.*;
public class matrix{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("enter rows = ");
     
     int rows=sc.nextInt();
     System.out.println("Enter coloums = ");
     int cols=sc.nextInt();
     System.out.println("Enter elements =");
     int [][] matrix = new int[rows][cols];
     //outer loop for rows
     for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){ //inner loop for cols
         matrix[i][j]=sc.nextInt();
        }
     }
      //printing the matrix
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }    

    //searchimg an element
    System.out.println("Enter element you want = ");
    int x = sc.nextInt();
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            //compare element with x
            if(matrix[i][j]==x){
                System.out.print("X found at ="+i+","+j);
            }
            }
        }
    }

}
}