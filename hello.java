//Prog to calculate cumulative sum of numbers 
//Eg- 1 2 3 4 5; Output 1,3,6,10,15
import java.util.*;

class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] arr = new int[5];
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[5];
        ans[0] = arr[0];
        for (i = 1; i < arr.length; i++) {
            ans[i] = ans[i - 1] + arr[i];
        }

        for (i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}