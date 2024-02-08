import java.util.*;
public class functions_and_methods_01 {
//    public static void printMyName(String name){
//        System.out.println(name);
//        return;
//    }

//    public static int calculateProduct(int a, int b){
//        return a*b;
//    }
    public static void printFactorial(int n ){
        //loop
        if (n<0){
            System.out.println("invalid number");
            return;
        }
        int factorial=1;
        for(int i= n; i>=1; i--){
            factorial = factorial *i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
//        returnType functionName(type arg1, type arg2...){
//            //operation
//        }
//       String name = sc.next();
//        Scanner sc = new Scanner(System.in);
//        printMyName(name); //call kiya function ko

        // add 2 numbers and return the sum



        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum = calculateProduct(a, b);
//        System.out.println("Product of 2 numbers is:"+ sum);



        //there is no factorial of negative numbers.



    }
}
