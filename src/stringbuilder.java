public class stringbuilder {
    public static void main(String[] args) {
        //strings are immutable in java
        //stack and heap memory

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //character at index 0
        System.out.println(sb.charAt(0));

        //set char at index

        sb.setCharAt(0, 'p');
        System.out.println(sb);

        //insert a char

        sb.insert(2, 'n');
        System.out.println(sb);

        //delete char in string

        sb.delete(2, 3);
        System.out.println(sb);

        //append in the string
        StringBuilder sbe = new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sbe);

        //reverse string question

        StringBuilder sbc = new StringBuilder("hello");

        for (int i= 0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i; //5-1-0 = > 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sbc);

    }
}
