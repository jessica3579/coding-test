class Solution {
    fun solution(s: String): String {
        var list = s.split(" ").map { it.toInt() }
        var min = list.minOrNull()
        var max = list.maxOrNull()
        return "$min $max"
    }
}