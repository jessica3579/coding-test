class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        for(x in 0..9){
            if(!numbers.contains(x)) answer += x
        }
        return answer
    }
}