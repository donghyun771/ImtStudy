public interface Arithmetic_Operation
{
    public static void Aithmetic_Operation(int num1, int num2) {

        System.out.println(num1 + " + " +num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " +num2 + " = " + (num1 - num2));
        System.out.println(num1 + " / " +num2 + " = " + (num1 / num2));
        System.out.println(num1 + " * " +num2 + " = " + (num1 * num2));

    }

    public static int Aithmetic_Operation(int num1, int num2, String str1) {
        if (str1.equals("+")) {

            int res = num1 + num2;
            return res;

        } else if (str1.equals("-")) {

            int res = num1 - num2;
            return res;

        } else if (str1.equals("*")) {

            int res = num1 * num2;
            return res;

        } else if (str1.equals("/")) {

            int res = num1 / num2;
            return res;

        }else {
            System.out.println("잘못된 입력입니다.");
        }
        return 0;
    }

}

