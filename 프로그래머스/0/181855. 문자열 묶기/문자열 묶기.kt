class Solution {
    fun solution(strArr: Array<String>): Int {
        val arr = strArr.map { it.length }
        val list = Array(arr.maxOrNull()!! + 1) { 0 }
        for(x in arr){
            list[x]++
        }
        return list.maxOrNull()!!
    }
}
