import java.util.Scanner;
import java.util.stream.Stream;

public class sum_of_n_natural_no {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write the first N natural no");
        int a=scanner.nextInt();
        System.out.println(sum(a));
    }

    public static int sum(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
