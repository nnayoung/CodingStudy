import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(prime(num1, num2));
    }

    public static int prime(int num1, int num2) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 2; i <= num1; i++) {
            list.add(i);
        }
        
        int temp = list.get(0);
        int count = 1;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % temp == 0) {
                    count++;
                    if (count == num2) {
                        return list.get(i);
                    }
                    list.remove(i);
                    i--;
                }
            }
    }
}
