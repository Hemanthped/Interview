import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCount {
    public static void main(String[] args) {
       
        String s= "Java programming oops java is a wonderful language";
        System.out.println("Enter a character:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int totalCount = s.length();
       int charcount = s.replace(str,"").length();
       int a_count = totalCount-charcount;
       System.out.println("Occurence of char: "+str+" is " + a_count);
      
       Map<String,Long> map = Arrays.stream(s.split("")).collect(
        Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

    }
}
