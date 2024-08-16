import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        Map<Character, Character> ring = new HashMap<>();

        for (int i = 0; i < s.length() - 1; i = i + 2) {

            ring.put(s.charAt(i + 1), s.charAt(i));

        }

        System.out.println(ring);

    }
}