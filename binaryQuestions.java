public class binaryQuestions{
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,15,43,56,78,91};
        int target=57;
        System.out.println(ceiling_of_number(arr,target));
        //finding smallest letter greater than target
        char[] arr2 = {'c','f','g','j'};
        char target2 = 'c';
       char output = ceiling(arr2, target2);
        System.out.println(output);
    }
        //finding number that is smallest greater and equal to target
    static char ceiling(char[] arr, char target){
       
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>target){
           
              
                end=mid-1;
            }
            else{ 
                start = mid+1;
            }
        }

        return arr[start% arr.length];
}

     static int ceiling_of_number(int[] arr, int target){
       
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>=target){
                if(arr[mid]==target){
               
               return arr[mid];
                }
              
                end=mid-1;
            }
            else{ 
                start = mid+1;
            }
        }

        return arr[start];
    }
} 