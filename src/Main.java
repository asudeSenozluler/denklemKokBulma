import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("x^2'nin katsayısını giriniz:");
        double a=scanner.nextInt();
        System.out.println("x'in katsayısını giriniz:");
        double b = scanner.nextInt();
        System.out.println("sabit sayıyı giriniz:");
        double c = scanner.nextInt();

        double delta = b*b-4*a*c;
        double kok1 = -b + Math.sqrt(delta) / 2 * a;
        double kok2 = -b - Math.sqrt(delta) / 2 * a;

        if (delta==0)
        {
            System.out.println("iki kök birbirine eşittir. kök="+kok1);
        }
        else if (delta>1)
        {
            System.out.println("kök1= "+kok1+" kök2= "+kok2);
        }
        else
        {
            System.out.println("Lineer kök değildir");
        }
	// write your code here
    }
}
