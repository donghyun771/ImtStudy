public class Arithmetic_Operation implements Arithmetic_Operation_Interface{

    @Override
    public int plus(int[] arry) {
        int i = 0;
        int res = 0;
        while (i < arry.length) {

            res += arry[i];
            i++;
        }

        return res;

    }

    @Override
    public int minus(int[] arry) {
        int i = 0;
        int res = 0;
        while (i < arry.length) {
            if (i == 0) {
                res = arry[i];
            }
            else {
                res -= arry[i];
            }
            i++;
        }
        return res;

    }

    @Override
    public double division(int[] arry) {
        int i = 0;
        double res = 0;
        while (i < arry.length) {
            if (i == 0) {
                res = arry[i];
            }
            else {
                res /= arry[i];
            }
            i++;
        }
        return res;

    }

    @Override
    public int multiply(int[] arry) {
        int i = 0;
        int res = 0;
        while (i < arry.length) {
            if (i == 0) {
                res = arry[i];
            }
            else {
                res *= arry[i];
            }
            i++;
        }
        return res;

    }

}
