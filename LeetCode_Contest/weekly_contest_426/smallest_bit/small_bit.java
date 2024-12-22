public class small_bit {

    public static boolean check(int n) {

        if(n == 0) return false;

        StringBuilder binary = new StringBuilder();

        for(int i=31; i>=0; i--) {

            int bit = (n << i) & 1;
            System.out.println(binary);

            binary.append(bit);
//            if(bit == 0) return false;

        }

        return true;
    }

    public static int smallestNumber(int n) {

        int temp = n;

        while(temp >= n) {

            if(check(temp)) return temp;
            temp++;

            if(temp == 15) break;
        }

        return 0;

    }

    public static void main(String[] args) {

        int n = 5;

        smallestNumber(n);

    }
}
