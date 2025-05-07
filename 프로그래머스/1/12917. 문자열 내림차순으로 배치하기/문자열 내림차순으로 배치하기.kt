class Solution {
    fun solution(s: String) = s.map{ it }.sortedDescending().joinToString("")
}