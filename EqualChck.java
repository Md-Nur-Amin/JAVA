package all;
import java.util.*;

public class EqualChck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x);
        System.out.println(y);
        if (x == y) {
            System.out.printf("%d and %d are equal", +x, +y);
        } else {
            if (x > y) {
                System.out.printf("%d is greater than %d", +x, +y);
            } else {
                System.out.printf("%d is less than %d", +x, +y);
            }
        }
    }
}
