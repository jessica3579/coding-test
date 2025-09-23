class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        val rows = arr.size
        val cols = arr[0].size

        if (rows > cols) {
            for (i in 0 until rows) {
                arr[i] = arr[i] + IntArray(rows - cols)
            }
        } else if (cols > rows) {
            val newArr = Array(cols) { IntArray(cols) { 0 } }
            for (i in 0 until rows) {
                for (j in 0 until cols) {
                    newArr[i][j] = arr[i][j]
                }
            }
            return newArr
        }

        return arr
    }
}