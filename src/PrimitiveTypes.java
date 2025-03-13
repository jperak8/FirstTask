public class PrimitiveTypes {

    public static int calculateSum(int a, long b, long c) {
        int sum = 0;
//        int a = 3647;
//        long b = 361245345;
//        long c = 3487238;

        sum = (int) (a + b + c);

        return sum;
    }

    public static double calculatePower(float number, double power) {
//        double number = 3;
//        double power = 2;

        double result = Math.pow(number, power);

        return result;
    }

}