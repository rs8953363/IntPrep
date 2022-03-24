package ForLoops;

public class IntegerInRange {
//    Write a function that validates whether a number n is within the lower and upper bounds. Return true if so, false otherwise.
//    intWithinBounds(3, 1, 9) ➞ true
//    intWithinBounds(6, 1, 6) ➞ false
//    intWithinBounds(3, 3, 8) ➞ true
//    The term "within bounds" means, that, a number is considered greater than or equal to the lower bound but lesser than the upper bound, (see example #2).
//    Bounds will always be given as integers.

        public static boolean intWithinBounds(int n, int lower, int upper) {
            return (n >= lower && n < upper);
        }


//    public class IntegerInRange {
//        public static boolean intWithinBounds(int n, int lower, int upper) {
//            for(int i=lower;i<upper;i++){
//                if(i==n)
//                    return true;
//            }
//            return false;
//        }
//    }
}
