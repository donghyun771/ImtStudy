import java.util.Scanner;

public class Second implements Arithmetic_Operation {
    String str;
    int num1;
    int num2;
    @Override
    public void arit_oper() {
        int res = 0;
        switch (str) {
            case "+" :

                System.out.println(num1 + num2);
                break;


            case "-" :

                System.out.println(num1 - num2);
                break;

            case "/" :

                System.out.println(num1 / num2);
                break;

            case "*" :

                System.out.println(num1 * num2);
                break;

            default:

                System.out.println("잘못된 입력입니다.");
                break;

        }
    }


    public void second() {

        Scanner sc = new Scanner(System.in);

        try {

            str = sc.next();
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            arit_oper();

        } catch (Exception e){

            System.out.println("입력값이 잘못되었습니다.");

        }
    }
}
