import java.util.Scanner;
import java.util.regex.Pattern;

public class Fourth{
    public void fourth() {

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

                res = Arithmetic_Operation.plus(arry);

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

                res = Arithmetic_Operation.minus(arry);

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
                double res = 0;
                int now;
                int j = 0;

                res = Arithmetic_Operation.division(arry);

                while (j < cnt) {

                    now = arry[j];
                    if (j == cnt - 1) {

                        System.out.printf(now + " = " + (double)Math.floor(res * 1000)/1000);

                    } else {

                        System.out.printf(now + " / ");

                    }
                    j++;

                }

            } else if (Pattern.matches("[*]", str)) {
                int res = 0;
                int now;
                int j = 0;

                res = Arithmetic_Operation.multiply(arry);

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

                System.out.println("연산자가 잘못되었습니다.");

            }


        } catch (Exception e){

            System.out.println("입력값이 잘못되었습니다.");

        }
    }
}
