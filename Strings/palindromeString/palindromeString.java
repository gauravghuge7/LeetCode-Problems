package palindromeString;

class palindromeString {

    static boolean isPalindrome(String s) {

        s = s.toLowerCase();


        StringBuilder temp = new StringBuilder();


        for(int i =0; i<s.length(); i++) {

            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)) {

                temp.append(ch);
            }

        }

        String straight = temp.toString();
        String reverse = temp.reverse().toString();

        return reverse.equals(straight);

    }

    public static void main(String[] args) {

        String s = "abcddcba7";

        System.out.println(isPalindrome(s));

    }

    
}