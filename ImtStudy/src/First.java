import java.util.Scanner;

public class First implements Arithmetic_Operation {
    int num1;
    int num2;
    @Override
    public void arit_oper() {
        System.out.println(num1 + " + " +num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " +num2 + " = " + (num1 - num2));
        System.out.println(num1 + " / " +num2 + " = " + (num1 / num2));
        System.out.println(num1 + " * " +num2 + " = " + (num1 * num2));
    }


    public void first() {
        Scanner sc = new Scanner(System.in);

        try {

            num1 = sc.nextInt();
            num2 = sc.nextInt();

            arit_oper();

        } catch (Exception e){

            System.out.println("입력값이 잘못되었습니다.");

        }
    }

}
