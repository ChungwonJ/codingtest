class Solution {
    public int solution(int num1, int num2) {
        int answer = num1+num2;
        if(-50000<=num1 && num1<=50000 && -50000<=num2 && num2<=50000){
            return answer;
        }
        return 0;
    }
}