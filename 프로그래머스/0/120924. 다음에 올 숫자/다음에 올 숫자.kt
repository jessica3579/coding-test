class Solution {
    fun solution(common: IntArray): Int {
        val check1 = common[1] - common[0]
        val check2 = common[2] - common[1]
        var answer = 0
        answer = if (check1 == check2) {
            common[common.size - 1] + check1
        } else {
            common[common.size - 1] * (check2 / check1)
        }
        return answer
    }
}