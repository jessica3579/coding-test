import kotlin.math.sqrt
class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for(x in 1..n){
            var t = 0
            for(y in 1..sqrt(x.toDouble()).toInt()){
                if(x%y==0){
                    t += if(y*y==x) 1 else 2
                }
            }
            if(t >= 3) answer++
        }
        return answer
    }
}