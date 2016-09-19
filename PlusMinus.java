import java.util.Scanner;

public class PlusMinus {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        float n = Integer.parseInt(sc.nextLine());
        String[] nums = sc.nextLine().split(" ");
        int numPos = 0;
        int numNeg = 0;
        int numZero = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(nums[i]);
            if (num > 0) numPos++;
            if (num < 0) numNeg++;
            if (num == 0) numZero++;
        }
        System.out.println( (numPos/n) +"\n" + (numNeg/n) + "\n" + (numZero/n));
    }


}
