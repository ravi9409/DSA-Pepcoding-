import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class Removing_vowel_from_String {
    public static void main(String[] args) {
       String string="what is your name ?";
       char[] a=string.toCharArray();
       char[] b=new char[a.length];
       for (int i=0;i<a.length;i++){
           if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
               continue;
           }
           b[i]=a[i];
        }
       String string1=new String(b);
       string1.trim();
        System.out.println(string1);
    }
}

