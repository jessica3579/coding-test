class Solution {
    fun solution(l: Int, r: Int): IntArray {
        val a = (l .. r).filter {
            it.toString().all { char -> char == '0' || char == '5' }
        }

        return if (a.isEmpty()) {
            intArrayOf(-1)
        } else {
            a.toIntArray()
        }
    }
}