import java.util.Scanner;

public class Third {
    public void third() {
        Scanner sc = new Scanner(System.in);

        try {

            String str = sc.next();
            int cnt = sc.nextInt();
            int i = 0;
            int[] arry = new int[cnt];


            while (i < cnt) {

                arry[i] = sc.nextInt();
                i++;

            }

            Arithmetic_Operation.Aithmetic_Operation(arry, str, cnt);

        } catch (Exception e){

            System.out.println("입력값이 잘못되었습니다.");

        }
    }
}
