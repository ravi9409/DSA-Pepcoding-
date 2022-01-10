import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Repeated_word_count_in_String {
    public static void main(String[] args) {

       String string="welcome to code decode and code decode welcome you";
       String[] st1=string.split(" ");
        List<String> list=Arrays.asList(st1);

        Map<String,Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
