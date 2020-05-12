import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        String s = scan.next();

        String sum = String.valueOf(a+b+c);
        System.out.println(sum + " " + s);
    }
}