class Solution {
    fun solution(s: String) = s.split(" ").joinToString(" ") { 
        it.lowercase().replaceFirstChar { it.uppercase() }
    }
}