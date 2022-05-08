import java.util.Scanner;

public class Second {

    public void second() {

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

                    System.out.println(arry[0] + " + " + arry[1] + " = " + Arithmetic_Operation.plus(arry));
                    break;

                case "-":

                    System.out.println(arry[0] + " - " + arry[1] + " = " + Arithmetic_Operation.minus(arry));
                    break;

                case "/":

                    System.out.println(arry[0] + " / " + arry[1] + " = " + (int)Arithmetic_Operation.division(arry));
                    break;

                case "*":

                    System.out.println(arry[0] + " * " + arry[1] + " = " + Arithmetic_Operation.multiply(arry));
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
