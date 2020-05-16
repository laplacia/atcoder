import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final int n = scan.nextInt();
        ArrayList<int[]> points = new ArrayList<int[]>();
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int[] point = {x , y};
            points.add(point);
        }
        String result = longestLength(points);
        System.out.println(result);
        scan.nextLine();
    }

    private static double getSquaredLength(int[] a, int[] b){
        int diffX = a[0] - b[0];
        int diffY = a[1] - b[1];
        double lenX = 0;
        double lenY = 0;
        if (diffX != 0) {
            lenX = Math.pow(diffX,2);
        }
        if (diffY != 0) {
            lenY = Math.pow(diffY,2);
        }
        double squaredLength;
        if (diffX + diffY != 0) {
            squaredLength = lenX + lenY;
        } else {
            squaredLength = 0;
        }
        return squaredLength;
    }

    private static String longestLength(ArrayList<int[]> points) {
        double maxSquaredLength = 0;
        
        for (int i = 0; i < points.size() - 1; i++) {
            int[] nowP = points.get(i);
            int counta = points.size() - i;
            for (int j = 1; j < counta; j++) {
                double sqLen = getSquaredLength(nowP, points.get(i + j));
                if (sqLen > maxSquaredLength) {
                    maxSquaredLength = sqLen;
                }
            }
        }
        return String.valueOf(Math.sqrt(maxSquaredLength));
    }
}
