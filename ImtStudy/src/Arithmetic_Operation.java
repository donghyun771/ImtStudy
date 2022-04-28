public interface Arithmetic_Operation
{
    public static void Aithmetic_Operation(int num1, int num2) {

        System.out.println(num1 + " + " +num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " +num2 + " = " + (num1 - num2));
        System.out.println(num1 + " / " +num2 + " = " + (num1 / num2));
        System.out.println(num1 + " * " +num2 + " = " + (num1 * num2));

    }

    public static void Aithmetic_Operation(int num1, int num2, String str1) {
        int res = 0;
        switch (str1) {
            case "+" :

                res = num1 + num2;
                break;
//                return res;

            case "-" :

                res = num1 - num2;
                break;
//                return res;

            case "/" :

                res = num1 / num2;
                break;
//                return res;

            case "*" :

                res = num1 * num2;
                break;
//                return res;

            default:

                System.out.println("잘못된 입력입니다.");
                break;

        }

        System.out.println(res);
    }

}

