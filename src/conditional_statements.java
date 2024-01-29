import java.util.*;
public class conditional_statements {
    public static void main(String[] args) {
        // if else
        // else if
        // switch
        // break

//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//
//        if(age> 18){
//            System.out.println("Adult");
//
//        }else{
//            System.out.println("not adult");
//        }

//      Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if (a==b){
//            System.out.println("equal");
//        }else if (a>b) {
//                System.out.println("a is  greater");
//            } else{
//                System.out.println("a is lesser");
//            }
//

        //switch

        Scanner sc =new Scanner (System.in);
        int button = sc.nextInt();

        switch(button){
            case 1 : System.out.println("Namaste");
            break;
            case 2 : System.out.println("Hello");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid button");

        }




    }
}























