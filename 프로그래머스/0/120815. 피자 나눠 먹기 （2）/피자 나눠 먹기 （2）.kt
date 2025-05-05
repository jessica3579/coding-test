class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var rest: Int = -1
        while(rest != 0){
            answer++
            rest = ( 6 * answer ) % n
        }
        return answer
    }
}