import java.util.Scanner;

public class Second {

    public void second() {

        Arithmetic_Operation AritOper = new Arithmetic_Operation();
        Scanner sc = new Scanner(System.in);
        String str;
        int num1 = 0;
        int num2 = 0;
        int[] arry = new int[2];

        try {

            str = sc.next();
            arry[0] = sc.nextInt();
            arry[1] = sc.nextInt();

            switch (str) {
                case "+":

                    System.out.println(arry[0] + " + " + arry[1] + " = " + AritOper.plus(arry));
                    break;

                case "-":

                    System.out.println(arry[0] + " - " + arry[1] + " = " + AritOper.minus(arry));
                    break;

                case "/":

                    System.out.println(arry[0] + " / " + arry[1] + " = " + (int) AritOper.division(arry));
                    break;

                case "*":

                    System.out.println(arry[0] + " * " + arry[1] + " = " + AritOper.multiply(arry));
                    break;

                default:

                    System.out.println("연산자가 잘못되었습니다.");
                    break;
            }

        } catch (Exception e){

            System.out.println("입력값이 잘못되었습니다.");

        }
    }
}
