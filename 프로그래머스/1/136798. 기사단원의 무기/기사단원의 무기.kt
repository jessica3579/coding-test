import kotlin.math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        for(x in 1..number){
            var sum = 0
            var root = sqrt(x.toDouble()).toInt()
            for(y in 1..root){
                if(x % y == 0){
                    sum += if( x/y == y ) 1 else 2
                    if(sum > limit) break
                }
            }
            answer += if(sum > limit) power else sum
        }
        return answer
    }
}