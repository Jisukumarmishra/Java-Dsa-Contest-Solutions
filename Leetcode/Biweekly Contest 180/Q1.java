package Leetcode.Biweekly Contest 180;

public class Q1 {
  class Solution {
    public String trafficSignal(int timer) {
        if(timer == 0) {
            return "Green";
        }
        if(timer == 30) {
            return "Orange";
        }

        if(timer > 30 && timer <= 90) {
            return "Red";
        } else {
            return "Invalid";
        }
        
    }
}
}
