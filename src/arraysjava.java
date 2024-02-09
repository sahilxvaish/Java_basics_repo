import  java.util.*;
public class arraysjava {
    public static void main(String[] args) {

        // type[] arrayName = new type[size];

        // int marks[] = {97, 98,95};
//        marks[0] = 97; //phy
//        marks[1] = 98; //chem
//        marks[2] = 95; //eng

//        System.out.println(marks[0]);

//        for(int i=0; i<3; i++){
//            System.out.println(marks[i]);
//        }

        // type[] arrayName = [1,2,3,4,5,6,..]
        // linear search
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
      //input loop
        for(int i =0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x =sc.nextInt();
       //output loop
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==x){
                System.out.println("x found at index:"+i);
            }
        }

        // numbers.length [size]
    }
}