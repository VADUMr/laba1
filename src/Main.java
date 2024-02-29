import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class Main {
    public static void main(String[] args) {
        int[] arr= new int[] {9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr);
        for (int s : arr){
            System.out.print(s + " ");
        }
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення для a: ");
        String a = scanner.nextLine();

        System.out.print("Введіть значення для b: ");
        String b = scanner.nextLine();

        System.out.print("Введіть значення для c: ");
        String c = scanner.nextLine();

        double result = (Double.parseDouble(a)*Double.parseDouble(b))/sqrt(pow(3,Double.parseDouble(c)));
        System.out.println("Результат обчислення: " + result);
    }
}