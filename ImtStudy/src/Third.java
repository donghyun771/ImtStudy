import java.util.Scanner;
import java.util.regex.Pattern;

public class Third{

    public void third() {
        Arithmetic_Operation AritOper = new Arithmetic_Operation();
        Scanner sc = new Scanner(System.in);
        String str;
        int[] arry;
        int cnt;

        try {

            str = sc.next();
            cnt = sc.nextInt();
            int i = 0;
            arry = new int[cnt];

            while (i < cnt) {

                arry[i] = sc.nextInt();
                i++;

            }

            if (Pattern.matches("[+]", str)) {
                int res = 0;
                int now;
                int j = 0;

                res = AritOper.plus(arry);

                while (j < cnt) {

                    now = arry[j];
                    if (j == cnt - 1) {

                        System.out.printf(now + " = " + res);

                    } else {

                        System.out.printf(now + " + ");

                    }
                    j++;

                }

            } else if (Pattern.matches("[-]", str)) {
                int res = 0;
                int now;
                int j = 0;

                res = AritOper.minus(arry);

                while (j < cnt) {

                    now = arry[j];
                    if (j == cnt - 1) {

                        System.out.printf(now + " = " + res);

                    } else {

                        System.out.printf(now + " - ");

                    }
                    j++;

                }

            } else if (Pattern.matches("[/]", str)) {
                int res = 0;
                int now;
                int j = 0;

                res = (int) AritOper.division(arry);

                while (j < cnt) {

                    now = arry[j];
                    if (j == cnt - 1) {

                        System.out.printf(now + " = " + res);

                    } else {

                        System.out.printf(now + " / ");

                    }
                    j++;

                }

            } else if (Pattern.matches("[*]", str)) {
                int res = 0;
                int now;
                int j = 0;

                res = AritOper.multiply(arry);

                while (j < cnt) {

                    now = arry[j];
                    if (j == cnt - 1) {

                        System.out.printf(now + " = " + res);

                    } else {

                        System.out.printf(now + " * ");

                    }
                    j++;

                }

            }else {

                System.out.println("???????????? ?????????????????????.");

            }


        } catch (Exception e){

            System.out.println("???????????? ?????????????????????.");

        }
    }
}
