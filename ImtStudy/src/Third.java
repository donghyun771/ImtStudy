import java.util.Scanner;

public class Third implements Arithmetic_Operation{
    String str;
    int[] arry;
    int cnt;


    @Override
    public void arit_oper() {
        int res = 0;
        int now = 0;
        int i = 0;
        switch (str) {
            case "+":
                while (i < cnt) {

                    res += arry[i];
                    now = arry[i];
                    if (i == cnt - 1) {

                        System.out.printf(now + " = " + res);

                    } else {

                        System.out.printf(now + " + ");

                    }
                    i++;

                }
                break;

            case "-":

                while (i < cnt) {
                    if (i == 0) {
                        res = arry[i];
                    }
                    else {
                        res -= arry[i];
                    }
                    now = arry[i];
                    if (i == cnt - 1) {

                        System.out.printf(now + " = " + res);

                    } else {

                        System.out.printf(now + " - ");

                    }
                    i++;

                }
                break;


            case "/":

                while (i < cnt) {
                    if (i == 0) {
                        res = arry[i];
                    }
                    else {
                        res /= arry[i];
                    }
                    now = arry[i];
                    if (i == cnt - 1) {

                        System.out.printf(now + " = " + res);

                    } else {

                        System.out.printf(now + " / ");

                    }
                    i++;

                }
                break;

            case "*":

                while (i < cnt) {

                    if (i == 0) {
                        res = arry[i];
                    }
                    else {
                        res *= arry[i];
                    }
                    now = arry[i];
                    if (i == cnt - 1) {

                        System.out.printf(now + " = " + res);

                    } else {

                        System.out.printf(now + " * ");

                    }
                    i++;

                }
                break;

            default:

                System.out.println("잘못된 입력입니다.");
                break;

        }
    }

    public void third() {

        Scanner sc = new Scanner(System.in);

        try {
            str = sc.next();
            cnt = sc.nextInt();
            int i = 0;
            arry = new int[cnt];


            while (i < cnt) {

                arry[i] = sc.nextInt();
                i++;

            }

            arit_oper();

        } catch (Exception e){

            System.out.println("입력값이 잘못되었습니다.");

        }
    }
}
