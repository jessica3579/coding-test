import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 2
        var a = a
        var b = b
        
        for(i in 2..b/2){
            if((a % i == 0) && (b % i == 0)){
                a /= i
                b /= i
            }
        }
        
        while(b % 2 == 0 || b % 5 == 0) {
            if(b % 2 == 0) b /= 2
            if(b % 5 == 0) b /= 5
        }
        
        return if(b == 1) 1 else 2
    }
}