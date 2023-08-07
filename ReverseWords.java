public class ReverseWords {
    public static void main(String[] args) {
        String s = "Java programming oops java is a wonderful language";
        String splitArray[] = s.split(" ");
        System.out.println("Acual String: "+s);
        
        for(int i=splitArray.length-1;i>=0;i--){
            System.out.print(splitArray[i]+" ");
        }
          System.out.println("\n");
        String reverse = "";
       
        String[] words = s.split(" ");
        for(String w : words){
             String revWords = "";
            StringBuffer sb = new StringBuffer(w);
            sb.reverse();
        
            revWords = revWords+sb.toString()+" ";
            reverse = reverse+revWords+" ";
        }
    System.out.println(reverse);
         
        // System.out.println("\n");

        // for(int i= s.length()-1;i>0;i--){

        //     System.out.print(s.charAt(i));

        // }
        
    }
}
