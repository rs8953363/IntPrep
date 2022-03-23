package Lists;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueChars2 {
    public static void main(String[] args) {
/*
6-Write a return method that can remove the duplicated values from String
       Ex: removeDup(“AAABBBCCC”) ==> ABC
 */
        String str="AAABBBCCC";
        whitSub(str);
        WhitCollec(str);
    }

    private static void WhitCollec(String str) {
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));
        Set<String> set=new HashSet<>();
        for (int i = 0; i <str.length()-1 ; i++) {
            set.add(arr[i]);
        }
        System.out.println(" set "+set.toString());
    }
    private static void whitSub(String str) {
        String cont="";
        for (int i = 0; i <str.length()-1 ; i++) {
            if (!cont.contains(str.substring(i,i+1))){
                cont+=str.substring(i,i+1);
            }
        }
        System.out.println(" uniqu "+cont);
    }
}
