import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occurence {
    public static void main(String[] args) {
        List<String>  names = Arrays.asList("AA","BB","CC","DD","AA","DD");
        
     Map<String, Long> s = names.stream().filter(e->Collections.frequency(names,e)>1).collect
        (Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(s);
    }
}
