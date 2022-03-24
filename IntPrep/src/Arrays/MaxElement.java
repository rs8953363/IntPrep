package Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int a [] = {3,15,10,11,9,1,25,56,68,98};

        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println("Maximum deger" + max);

    }
}

