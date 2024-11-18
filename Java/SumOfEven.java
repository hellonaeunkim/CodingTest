class Solution {


int answer = 0;

public int solution(int n) {
    if (n > 0 && n <= 1000) {
        for(int i = 2; i <= n; i+=2) {
            if (i % 2 == 0) {
                answer = answer + i;
            }
        }
    }

    return answer;
}



}

/*

- Code description
This code calculates the sum of all even numbers from 2 to a given number
n if n is between 1 and 1000.

- Remind
  -for loop
    -Example
    
    
    for (initialization; condition; update) {
      // Code to execute in each loop iteration
    
    
    
    }
    
    1. Initialization : set up a starting value for a variable.
    2. Condition
    a. checked before every iteration(반복).
    b. If the condition is true, the loop runs; if false,
    the loop stops.
    3. Update : executed after each iteration.

- Link
  [Programmers Coding Test]
  (https://school.programmers.co.kr/learn/courses/30/lessons/120831)
*/

