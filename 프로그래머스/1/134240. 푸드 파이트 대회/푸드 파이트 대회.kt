class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        for(i in 1..food.lastIndex){
            for(j in 1..food[i]/2){
                answer += i
            }
        }
        answer += '0'
        for(i in food.lastIndex downTo 1){
            for(j in 1..food[i]/2){
                answer += i
            }
        }
        return answer
    }
}