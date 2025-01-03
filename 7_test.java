class Solution {
    public int solution(int num1, int num2) {
        double answer = (double)num1 / num2 * 1000;
        int intNumber;
        intNumber = (int) answer;
        if(0<num1 && num1<=100 && 0<num2 && num2<=100){
            return intNumber;
        }
        return 0;
    }
}