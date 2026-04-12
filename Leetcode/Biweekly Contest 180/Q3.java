public class Q3 {
  // 
class Solution {
    
  public int minOperations(int[] nums) {
  int totalcount = 0;
  
  for (int i = 0; i < nums.length; i++) {
      
      if (i % 2 == 0) { // even index → PRIME chahiye
          
          int count1 = 0;
          
          while (!isPrime(nums[i])) {
              nums[i]++;
              count1++;
          }
          
          totalcount += count1;
      }
      
      else { // odd index → NON-PRIME chahiye
          
          int count2 = 0;
          
          while (isPrime(nums[i])) {
              nums[i]++;
              count2++;
          }
          
          totalcount += count2;
      }
  }
  
  return totalcount;
    }
    
    
    // Prime check
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
}
}
