import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(toGCD(num1, num2));
        System.out.println(toLCM(num1, num2));
    }

    public static int toGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int toLCM(int num1, int num2) {
        return (num1 * num2) / toGCD(num1, num2);
    }
}
