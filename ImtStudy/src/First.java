import java.util.Scanner;

public class First {

    public void first() {
        Scanner sc = new Scanner(System.in);

        int[] arry = new int[2];

        try {

            arry[0] = sc.nextInt();
            arry[1] = sc.nextInt();

            System.out.println(arry[0] + " + " + arry[1] + " = " + Arithmetic_Operation.plus(arry));
            System.out.println(arry[0] + " - " + arry[1] + " = " + Arithmetic_Operation.minus(arry));
            System.out.println(arry[0] + " / " + arry[1] + " = " + (int)Arithmetic_Operation.division(arry));
            System.out.println(arry[0] + " * " + arry[1] + " = " + Arithmetic_Operation.multiply(arry));


        } catch (Exception e){

            System.out.println("입력값이 잘못되었습니다.");

        }
    }

}
