class Solution {
    fun solution(n: Int): Int {
        // var answer: Int = 0
        // for(x in 1..n){
        //     if(n % x == 0) answer ++
        // }
        // return answer
        return (1..n).count{ n % it == 0}
    }
}