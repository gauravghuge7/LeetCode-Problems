

public class minimum_desiBinary {

    private static int binary(int n) {

        StringBuilder s = new StringBuilder();

        while(n > 0) {


            s.append(n % 2);

            n = n / 2;

        }

        return Integer.parseInt(s.toString());
    }

    private static int calculate(int n, int size) {

        if(n == 0) return 0;

//        n -

//        calculate(n - , size);


        return 0;
    }

    private static int minPartitions(String s) {

        /**
         *  Convert the Number into Integer and give size
         */

        int n = Integer.parseInt(s);
        int size = s.length();

        calculate(n, size);


        return 0;
    }

    public static void main(String[] args) {



    }

}
