public class Recursion {
   
    public static void main(String[] args) {
        String s = "hemanth";
        System.out.println(recurse(s));
       
      
    }

        private static String recurse(String s){
            if(s==null||s.length()<=1)
            {
                return s;

            }
            return recurse(s.substring(1))+s.charAt(0);
    
            
        }
    
    }

