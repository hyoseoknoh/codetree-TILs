import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int bmi = (10000 * w)/(h*h);
        System.out.printf("%d\n",bmi);
        if(bmi >= 25){
            System.out.printf("Obesity");
        }
    }
}