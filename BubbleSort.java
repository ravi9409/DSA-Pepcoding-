import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;


public class BubbleSort {
    public static void main(String[] args) {
    int a[]=new int[]{78,87,43,21,1,67,89,60};
    int[] b=bubbleSort(a);
        for (int c:b
             ) {
            System.out.println(c);
        }
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}