import java.util.*;

public class prog{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] arr = new int[4];
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = new int[4];
      Arrays.fill(ans,1);
        int result[] = new int[4];
    
        for (i = 0; i < arr.length; i++)
        {
            for(int p=0;p<arr.length;p++)
            {
                if(i!=p)
                {
                   ans[i]=ans[i]*arr[p] ;
                }}
               result[i]=ans[i]; 
        }

        for (i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}