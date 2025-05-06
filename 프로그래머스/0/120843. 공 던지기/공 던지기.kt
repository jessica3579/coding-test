class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        return (2 * (k-1)) % numbers.size + 1
    }
}