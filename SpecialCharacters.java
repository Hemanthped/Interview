public class SpecialCharacters {
    public static void main(String[] args) {
        String s = "H9 el1loH2 em*Al6l%& !@is";
        s.replaceAll("\\s","");
        System.out.println(s);
        char[] c = s.toCharArray();
        

        int splcount = 0;
        int numcount = 0;
        int alpcount = 0;
        for(int i = 0;i<s.length();i++){
            if(!Character.isDigit(c[i])&& !Character.isLetter(c[i])&&!Character.isWhitespace(c[i])){
                splcount++;
            }
            else if(Character.isDigit(c[i])){
                    numcount++;
                }
             else{
                    alpcount++;
                }
            }
 
        System.out.println("special characters count is:"+splcount);
        System.out.println("Numeric count is:"+numcount);
        System.out.println("alphabets count is:"+alpcount);
    }

}
