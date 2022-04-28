import java.util.Scanner;

public class First {

    public void first() {
        Scanner sc = new Scanner(System.in);

        try {

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            Arithmetic_Operation.Aithmetic_Operation(num1, num2);

        } catch (Exception e){

            System.out.println("입력값이 잘못되었습니다.");

        }
    }

}
