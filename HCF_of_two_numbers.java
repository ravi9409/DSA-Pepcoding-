import java.util.*;

public class Prac {

    static int a = 0;
    static int b = 0;


    public static void main(String[] args) {
        Prac prac = new Prac();
        int result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        if (!(a > b)) {
            prac.swap(a, b);
        } else {
            while (result != 0) {
                result = a % b;
                if (result == 0) {
                    break;
                }
                a = b;
                b = result;
            }
        }
        System.out.println("The HCF is " + b);
    }

    public void swap(int a, int b) {
        int temp = 0;
        temp = b;
        a = b;
        temp = a;
        this.a = a;
        this.b = b;
    }
}
