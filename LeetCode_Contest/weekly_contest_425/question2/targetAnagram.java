package question2;

public class targetAnagram {



    public static boolean isPossibleToRearrange(String s, String t, int k) {

        String[] arr = s.split(String.valueOf(k));


        for(String a : arr) {
            System.out.println(a);
        }

        return true;
    }


    public static void main(String[] args) {

        String a = "abcd", t = "cdab";
        int k = 2;

        System.out.println(isPossibleToRearrange(a, t, k));
    }
}
