import java.util.*;
public class bit_manipulation {
    public static void main(String[] args) {
        //Get bit
//        int n = 5;
//        int pos = 2;
//        int bitMask = 1<<pos;
//
//        if ((bitMask & n) == 0) {
//            System.out.println("bit was error");
//        }else{
//            System.out.println("bit was one");
//        }

        //Set bit
//        int n = 5;
//        int pos = 1;
//        int bitMask = 1<<pos;
//
//       int newNumber = bitMask | n;
//        System.out.println(newNumber);

        //Clear bit
//        int n = 5;  //0101
//        int pos = 2;
//        int bitMask = 1<<pos;
//        int notBitMask = ~(bitMask);
//
//        int newNumber = notBitMask & n;
//        System.out.println(newNumber);

        //Update Bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
         // update bit to 1 else update bit to 0

        int bitMask = 1<<i;
        int newNumber = bitMask | n;

    }
}
