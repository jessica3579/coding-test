class Solution {
    fun solution(start: Int, end: Int): IntArray {
        // var answer: IntArray = IntArray(end - start + 1, {0})
        // var x = start
        // for(i in 0..answer.size-1){
        //     answer[i] = x++
        // }
        // return answer
        
        var list = mutableListOf<Int>()
        for(i in start..end)
            list.add(i)
        return list.toIntArray()
    }
}