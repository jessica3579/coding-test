class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        val result = rank.mapIndexed { i, value -> i to value }
            .filter { attendance[it.first] }
            .sortedBy { it.second }
        return result[0].first * 10000 + result[1].first * 100 + result[2].first
    }
}