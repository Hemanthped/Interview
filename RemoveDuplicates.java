import java.util.HashSet;
import java.util.Set;

class RemoveDupicates{
    public static void main(String[] args) {
        String str = "Helloworld";
        System.out.println(removeDuplicates(str));
        
    }

    private static String removeDuplicates(String str) {
        Set<Character> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<str.length();i++){
            Character c = str.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                sb.append(c);
            }
        }
     
        return sb.toString();
    }
}