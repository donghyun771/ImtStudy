

interface Arithmetic_Operation
{

    static int plus(int[] arry) {
        int i = 0;
        int res = 0;
        while (i < arry.length) {

            res += arry[i];
            i++;
        }

        return res;

    }

    static int minus(int[] arry) {
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

    static double division(int[] arry) {
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

    static int multiply(int[] arry) {
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


    abstract void arit_oper();


}

