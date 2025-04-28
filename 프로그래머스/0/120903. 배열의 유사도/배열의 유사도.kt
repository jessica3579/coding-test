class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        for(x in s1){
            if(s2.contains(x)) answer++
        }
        return answer
    }
}