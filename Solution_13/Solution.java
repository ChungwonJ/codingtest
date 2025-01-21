package Solution_13;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sumObj;
        double sumArr = 0;

        for(int i = 0; i < arr.length; i++) {
            sumObj = arr[i];
            sumArr += sumObj;
        }
        answer = sumArr / arr.length;
        return answer;
    }
}
