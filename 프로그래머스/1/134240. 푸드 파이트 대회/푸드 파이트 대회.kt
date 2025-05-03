class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        for(i in 1..food.lastIndex){
            for(j in 1..food[i]/2){
                answer += i
            }
        }
        val rev = answer.reversed()
        answer += '0'
        answer += rev
        // for(i in food.lastIndex downTo 1){
        //     for(j in 1..food[i]/2){
        //         answer += i
        //     }
        // }
        return answer
    }
}