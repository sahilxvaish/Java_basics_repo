import java.util.*;
public class twoDarray {
    public static void main(String[] args) {
       //2D arrays

        // type[][] array name = new type[rows][columns];
        // int[][] numbers = new int[3][5]

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int  columns = sc.nextInt();

        int[][] numbers = new int [rows][columns];
        //  outer loop is for rows
        // inner loop is for columns
        for(int i =0; i<rows; i++){
            for(int j =0; j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
//        int x = sc.nextInt();
        for (int i =0; i<rows; i++){
            for(int j =0; j<columns; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
