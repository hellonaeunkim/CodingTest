class Solution {
  public int solution(int n) {
      
      int answer = 0;
      
      if(n>=0 && n<=3000){
          for(int i = 1; i <= n; i++){
              
              if(n % i == 0)
                  answer = answer + i;
            
          }
      }
   return answer;   
  }
}

/* Learned

1. Using AND, OR operator in IF statement -> && (AND), || (OR)

*/