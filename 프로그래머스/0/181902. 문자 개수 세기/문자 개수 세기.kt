class Solution {
    fun solution(my_string: String): IntArray {
        val counts = IntArray(52)
        my_string.forEach{
            when {
                it.isUpperCase() -> counts[it - 'A']++
                it.isLowerCase() -> counts[it - 'a' + 26]++
            }
        }
        return counts
    }
}