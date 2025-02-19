public class lenstring {
    public static void main(String[] args) {
        String str = "Hello, World!";

        int len =str.length();
        System.out.println("Length of the string is: " + len);

        int  CharIndex=str.charAt(4);
        System.out.println("Character at index 4 is: " + CharIndex);

        String upper =str.toUpperCase();
        System.out.println("uppercase"+upper);

        String subString=str.substring(5);
        System.out.println("SUB"+subString);


    }
    
}
