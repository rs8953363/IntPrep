package Arrays;

public class MaxElement2 {
    public static void main(String[] args) {
        int arr[]={1,3,9,7,10,90,88};
        int k=0;

        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                    k=arr[i];
                }else {
                    k=arr[j];
                }
            }

        }
        System.out.println(k);
    }
}
