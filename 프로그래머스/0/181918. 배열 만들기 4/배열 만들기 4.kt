class Solution {
    fun solution(arr: IntArray): IntArray {
        val tmp = ArrayList<Int>()
        var i = 0
        while (i < arr.size) {
            if (tmp.size == 0) {
                tmp.add(arr[i])
                i += 1
            } else {
                val last = tmp[tmp.size - 1]
                if (tmp.size != 0 && last < arr[i]) {
                    tmp.add(arr[i])
                    i += 1
                } else if (tmp.size != 0 && last >= arr[i]) {
                    tmp.removeAt(tmp.size - 1)
                }
            }
        }
        val stk = IntArray(tmp.size)
        for (k in tmp.indices) {
            stk[k] = tmp[k]
        }
        return stk
    }
}