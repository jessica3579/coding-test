class Solution {
    fun solution(number: Int, n: Int, m: Int): Int {
        val isN: Boolean = number % n == 0
        val isM: Boolean = number % m == 0
        if(isN && isM) return 1
        else return 0
    }
}