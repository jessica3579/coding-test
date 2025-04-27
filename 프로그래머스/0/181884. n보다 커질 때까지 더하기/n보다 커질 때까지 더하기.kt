class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer: Int = 0
        for(x in numbers){
            answer += x
            if(answer > n) break;
        }
        return answer
    }
}