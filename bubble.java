public class bubble {
    public int min_swap(int arr[]){

        int cnt =0;
        int[] arr1 =new int[arr.length];
        for(int i =0;i<arr.length;i++)arr1[i]=arr[i];
        for(int i =0;i<arr.length;i++) {
            for (int j = 0; j < arr.length - i-1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                    cnt++;

                }
            }
        }
        arr1= arr;
        int cnt2 =0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0;j<arr.length-i-1; j++) {
                if (arr1[j]<arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                    cnt2++;
                }
            }
        }
        return Math.min(cnt,cnt2);
    }

    public static void main(String[] args) {
        int arr[] = {4,5,1,2,3};
        bubble obj = new bubble();
        System.out.println(obj.min_swap(arr));
    }
}
