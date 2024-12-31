class Solution {
    public int solution(int num1, int num2) {
        int a = num1;
        int b = num2;
        if (-50000 <= a && a <= 50000 && -50000 <= b && b <= 50000) {
            return a - b; 
        }
        return 0; 
    }
}