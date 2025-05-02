class Solution {
    fun solution(slice: Int, n: Int): Int {
        var answer: Int = 0
        while(answer < n){
            answer += slice
        }
        return answer / slice
    }
}