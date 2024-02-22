import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        String str = "10 20 30";
        Scanner scan = new Scanner(str);

        long seed = System.currentTimeMillis();
        Random rand = new Random(seed);

        int temp1 = scan.nextInt();

        Scanner scankeybord = new Scanner(System.in);

        System.out.print("Введіть значення temp2: ");
        int temp2 = scankeybord.nextInt();

        int temp3 = rand.nextInt(101);
        System.out.println("Темп сума = "+ (temp1+temp2+temp3));
    }
}