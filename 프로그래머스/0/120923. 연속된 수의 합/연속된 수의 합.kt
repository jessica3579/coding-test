class Solution {
    fun solution(num: Int, total: Int): IntArray {
        var answer = mutableListOf<Int>()
        // if(num % 2 == 0){
        //     for(i in 0 until num){
        //         answer.add(total/num - num/2 + 1 + i)
        //     }
        // }else {
        //     for(i in 0 until num){
        //         answer.add(total/num - num/2 + i)
        //     }
        // }
        for(i in 1 .. num){
            answer.add(total/num - (num+1)/2 + i)
        }
        return answer.toIntArray()
    }
}