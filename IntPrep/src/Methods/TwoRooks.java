package Methods;

public class TwoRooks {
  /*  Write a function that returns true if two rooks can attack each other, and false otherwise.
    canCapture(["A8", "E8"]) ➞ true
    canCapture(["A1", "B2"]) ➞ false
    canCapture(["H4", "H3"]) ➞ true
    canCapture(["F5", "C8"]) ➞ false
    Assume no blocking pieces.     Two rooks can attack each other if they share the same row (letter) or column (number).
   */
    public class Challenge {
        public static boolean canCapture(String[] rooks) {
            return ((rooks[0].charAt(0) == rooks[1].charAt(0)) ||
                    (rooks[0].charAt(1) == rooks[1].charAt(1)));
        }
    }

//    public class Challenge {
//        public static boolean canCapture(String[] rooks) {
//            return rooks[0].startsWith(rooks[1].substring(0,1)) || rooks[0].endsWith(rooks[1].substring(1));
//        }
//    }
}
