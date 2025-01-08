#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    if(0<n && n<=1000){
        for (int i = 2; i <= n; i += 2) {
            answer += i;
        }
    }
    return answer;
}

int main() {
    int n = 10; 
    int result = solution(n);
    return 0;
}
