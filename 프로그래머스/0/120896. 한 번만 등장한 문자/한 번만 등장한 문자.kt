class Solution {
    fun solution(s: String): String = s.toList().sorted().filter { s.indexOf(it) == s.lastIndexOf(it) }.joinToString("")
}