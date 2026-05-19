package Arrays;
import java.util.*;

public class ProductExceptSelf {
    public static void main(String args[]) {

        int nums[] = {1,2,3,4};
        int n = nums.length;

        int answer[] = new int[n];

        // Left products
        answer[0] = 1;

        for(int i=1; i<n; i++) {
            answer[i] = answer[i-1] * nums[i-1];
        }

        // Right products
        int rightProduct = 1;

        for(int i=n-1; i>=0; i--) {
            answer[i] = answer[i] * rightProduct;
            rightProduct *= nums[i];
        }

        System.out.println(Arrays.toString(answer));
    }
}