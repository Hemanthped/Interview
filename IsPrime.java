import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            boolean flag = false;
            
                for(int i = 2; i<=Math.sqrt(num);i++){
                    if(num%2==0){

                        System.out.println("number is not prime");
                        flag = true;
                        break;
                    }
                
            }
            if(flag==false){
                System.out.println("Number is prime");
            }
        }
        
    }
}
