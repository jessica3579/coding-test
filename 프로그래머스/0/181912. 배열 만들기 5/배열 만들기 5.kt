class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer = mutableListOf<Int>()
        for(str in intStrs){
            val tmp = str.substring(s, s+l).toInt()
            if(tmp > k) answer.add(tmp)
        }
        return answer.toIntArray()
    }
}