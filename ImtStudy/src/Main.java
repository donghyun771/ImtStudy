import java.util.Scanner;

public class Main implements Arithmetic_Operation{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            String str = sc.next();
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            Arithmetic_Operation.Aithmetic_Operation(num1, num2, str);

        } catch (Exception e){

            System.out.println("입력값이 잘못되었습니다.");

        }


    }
}