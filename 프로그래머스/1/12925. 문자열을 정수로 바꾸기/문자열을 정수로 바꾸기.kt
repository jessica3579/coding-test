class Solution {
    fun solution(s: String) = if(s[0].isDigit()) s.toInt() else if(s[0] == '+') s.slice(1..s.length-1).toInt() else 0 - s.slice(1..s.length-1).toInt()
}