import java.util.Scanner;

class Calculator {
    
    void ADD(int a, int b) {
        int result = this.MULTIPLY(a, b); 
        System.out.println("Multiplication result: " + result);
    }

    
    int MULTIPLY(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        
        Calculator calc = new Calculator();

        
        calc.ADD(num1, num2);

        sc.close();
    }
}
