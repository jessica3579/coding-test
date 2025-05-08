class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = numbers[0]*numbers[1]
        for(i in 0..numbers.lastIndex){
            for(j in i+1.. numbers.lastIndex){
                if(answer < numbers[i]*numbers[j]) answer = numbers[i]*numbers[j]
            }
        }
        return answer
    }
}