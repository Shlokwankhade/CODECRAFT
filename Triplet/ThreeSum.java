import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Sort the array to allow using the two-pointer technique
        Arrays.sort(nums);
        
        // Iterate over the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i + 1;  // Start pointer after the current element
            int right = nums.length - 1;  // End pointer at the end of the array
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Move left pointer forward and right pointer backward
                    left++;
                    right--;
                    
                    // Skip duplicate elements for the second and third elements
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    // Sum is too small, move the left pointer to increase the sum
                    left++;
                } else {
                    // Sum is too large, move the right pointer to decrease the sum
                    right--;
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        ThreeSum solver = new ThreeSum();
        
        int[] nums = {-1, 0, 1, 2, -1, -4};
        
        List<List<Integer>> triplets = solver.threeSum(nums);
        
        // Print the result
        System.out.println("Unique triplets that sum to zero:");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}

