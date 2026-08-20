class Solution {
  public boolean consecutiveSetBits(int n) {
    String temp = Integer.toBinaryString(n);
    int count = 0;
    for (int i = 0; i < temp.length() - 1; i++) {
      if (temp.charAt(i) == '1' && temp.charAt(i + 1) == '1') {
        count++;
      }
    }

    return count == 1;
  }
}