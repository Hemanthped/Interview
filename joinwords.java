public class joinwords {
    Integer x= 10;
     static boolean check(int[]arr) {

        int n = arr.length;
   
        for(int i=0; i < n-1;i++) {
   
            if(arr[i+1] <= arr[i]) {
   
                return false;
   
            }
   
        }
   
        return true;
    }
    public static void main(String[] args) {
        
//         int[] arr = {0, 2, 4, 1, 3};
// for(int i = 0; i < arr.length; i++) {
//     arr[i] = arr[(arr[i] + 3) % arr.length];
//     }
//     for(int i=0;i<arr.length;i++){
//     System.out.print(arr[i]+" ");
//     }
        int[] arr = {1,2,5,4};
            
            System.out.println(joinwords.check(arr));
   }
    }
