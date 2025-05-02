class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = -1
        var cnt = 1
        for(x in num.toString()){
            if(x.digitToInt() == k) return cnt
            cnt++
        }
        return answer
    }
}