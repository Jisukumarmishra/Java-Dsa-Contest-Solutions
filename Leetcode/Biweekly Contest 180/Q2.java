public class Q2 {

  // My Appraoch

// class Solution {
//     public int countDigitOccurrences(int[] nums, int digit) {
//         int count = 0;
//         for (int i=0; i<nums.length; i++) {
//             if(digit == nums[i]) {
//                 count++;
//             }
//             int temp = nums[i];
//             if(nums[i] / digit == digit) {
//                 count++;
//                 nums[i] = nums[i]-digit;
//             }
             
//         }
//         return count;
//     }
// }

class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
    int count = 0;

    for (int num : nums) {
        int temp = num;

        //if number is 0
        if (temp == 0 && digit == 0) {
            count++;
        }

        while (temp > 0) {
            int lastDigit = temp % 10;

            if (lastDigit == digit) {
                count++;
            }

            temp /= 10;
        }
    }

      return count;
    }
}
}
