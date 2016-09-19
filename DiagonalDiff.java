import java.util.Scanner;

public class DiagonalDiff {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int [][] numbers = new int[n][n];
        int diagSum1 = 0;
        int diagSum2 = 0;

        // populate array
        for (int i = 0; i < n; i++) {
            String [] nums = sc.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                numbers[i][j] = Integer.parseInt(nums[j]);
            }
        }


        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (r == c) diagSum1 += numbers[r][c];
                if (r+c == n-1) diagSum2 += numbers[r][c];
            }
        }
        System.out.print(Math.abs(diagSum1-diagSum2));

    }

}
