class Solution {
    public int solution(int num1, int num2) {
        int a = num1;
        int b = num2;
        if(0<=a && a<=100 && 0<=b && b<=100){
            return a*b;
        }
        return 0;
    }
}