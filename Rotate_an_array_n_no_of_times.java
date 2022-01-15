import java.util.Scanner;

public class Rotate_an_array_n_no_of_times {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println("Enter how many times it should be rotated");
        int n=scanner.nextInt();
        int[] newArray=shiftArrayRight(arr,n);
        printArray(newArray);
    }

    public static int[] shiftArrayRight(int[] array1,int n){
        int count=0;
        while(count!=n) {
            int tempVariable = array1[array1.length - 1];
            for (int i = array1.length - 2; i >= 0; i--) {
                array1[i + 1] = array1[i];
            }
            array1[0] = tempVariable;
            count++;
        }
        return array1;
    }

    public static void printArray(int[] arr){
        for (int x:arr
             ) {
            System.out.print(x);
        }
    }
}
