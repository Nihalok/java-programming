
import java.util.Scanner;
enum pizza{
    LARGE,MEDIUM,REGULAR
}

public class enumeg {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("input pizza size:");
       try {
            pizza size= pizza.valueOf(sc.nextLine().toUpperCase());
               System.out.println("Your order is "+size+" pizza");
       } catch (IllegalArgumentException e) {
        System.out.println("invalid");
       }

        

    }
    
}