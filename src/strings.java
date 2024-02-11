import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //string declaration
//        String name = "Sahil";
//        String fullName = "Sahil Vaish";
//        String sentence = "My name is sahil";
//        String name = sc.nextLine();
//        System.out.println("Your name is : "+ name);

        //concatenation
//        String firstName = "tony";
//        String lastName = "stark";
//        String fullName = firstName + "@" + lastName;
//        //tony@stark
//        System.out.println(fullName.length());

        //charAt
//        for (int i=0; i<fullName.length(); i++){
//            System.out.println(fullName.charAt(i));
//        }

//        String name1 = "Tony";
//        String name2 = "Tony";

        //1 s1> s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve value

//        if (name1.compareTo(name2) == 0) {
//
//            System.out.println("Strings are equal");
//        }else {
//            System.out.println("strings are not equal");
//        }

//        if (name1 == name2) {
//
//            System.out.println("Strings are equal");
//        }else {
//            System.out.println("strings are not equal");
//        }
//        if (new String("Tony")== new String("Tony")){
//            System.out.println("Strings are equal");
//        }else{
//            System.out.println("Strings are not equal");
//        }

//        String sentence = "My name is Tony";
//        String name = sentence.substring(11, sentence.length());
//        System.out.println(name);

        //compare
        String sentence = "TonyStark";
        String name = sentence.substring(4);
        System.out.println(name);
    }
}
