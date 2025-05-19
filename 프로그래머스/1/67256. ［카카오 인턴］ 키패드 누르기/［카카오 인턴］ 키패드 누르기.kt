import kotlin.math.* 
class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        val arr = numbers.map{ if(it == 0) 11 else it }
        var answer = ""
        var lh = 10
        var rh = 12
        for(x in arr){
            if(x == 1 || x== 4 || x == 7){
                lh = x
                answer += "L"
            }else if(x == 3 || x == 6 || x == 9){
                rh = x
                answer += "R"
            }else{
                val r = abs(rh-x)/3 + abs(rh-x)%3
                val l = abs(lh-x)/3 + abs(lh-x)%3
                if(r == l){
                    if(hand=="right"){
                        answer += "R"
                        rh = x
                    }else{
                        answer += "L"
                        lh = x
                    }
                }else if(r > l){
                    answer += "L"
                    lh = x
                }else {
                    answer += "R"
                    rh = x
                }
                
            }
        }
        return answer
    }
}