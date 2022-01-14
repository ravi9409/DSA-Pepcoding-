import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Digit_of_a_number_without_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scanner.nextInt();
        int b = power(count(a));
        print(a,b);
    }

    public static void print(int a,int b){
        int c=0;
        while(b!=0) {
             c = a / b;
            System.out.print(c);
            a = a % power(count(a));
            b = b / 10;
        }
    }
    public static int power(int n) {
        if (n != 1) {
            return 10 * power(n - 1);
        } else {
            return 1;
        }
    }

    public static int count(int a) {
        int count = 0;
        while (a != 0) {
            a = a / 10;
            count++;
        }
        return count;
    }
}