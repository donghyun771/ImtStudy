import java.util.Scanner;

public class First {

    public void first() {
        Scanner sc = new Scanner(System.in);
        Arithmetic_Operation AritOper = new Arithmetic_Operation();

        int[] arry = new int[2];

        try {

            arry[0] = sc.nextInt();
            arry[1] = sc.nextInt();

            System.out.println(arry[0] + " + " + arry[1] + " = " + AritOper.plus(arry));
            System.out.println(arry[0] + " - " + arry[1] + " = " + AritOper.minus(arry));
            System.out.println(arry[0] + " / " + arry[1] + " = " + (int) AritOper.division(arry));
            System.out.println(arry[0] + " * " + arry[1] + " = " + AritOper.multiply(arry));


        } catch (Exception e){

            System.out.println("입력값이 잘못되었습니다.");

        }
    }

}
