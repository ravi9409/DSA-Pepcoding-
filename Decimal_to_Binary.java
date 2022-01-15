import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        int pow=1,binary=0,rem=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=scanner.nextInt();
        while (a!=0){
            rem=a%2;
            binary=binary+(rem*pow);
            pow=pow*10;
            a=a/2;
        }
        System.out.println(binary);
    }
}
