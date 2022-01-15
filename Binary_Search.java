import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;


public class Binary_Search {
    public static void main(String[] args) {
    int a[]=new int[]{2,5,8,12,16,23,38,56,72,91};
    int b=binarySearch(a,0,a.length,56);
        System.out.println(b);
    }

    public static int binarySearch(int[] arr,int l,int r,int x){
        if(r>=l){
            int mid=l+(r-l)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
                return binarySearch(arr,l,mid-1,x);
            }else {
                return binarySearch(arr,mid+1,r,x);
            }
        }
        return -1;
    }
}