class Solution {
    public boolean validDigit(int n, int x) {

        int temp = n ; // start check

        while ( temp >= 10) {
            temp = temp / 10;
        }

        if( temp == x) return false;


        boolean count = false;
    
        // String s = String.valueOf(n)
        // char [] ch = s.toCharArray();
        
        // for (int  i =0; i<ch.length; i++) {
        //     int count = 0;
        //     if(s.charAt(0) == x) {
        //         return false;
        //     }

        //     if (s.charAt(i)==x) {
        //         return true;
        //     }
            
        // }

        // return false;
        while ( n > 0) {
           int digit = n % 10;
           if(digit == x) count = true;
            n = n / 10 ;// backward
        }
        return count;
    }
}