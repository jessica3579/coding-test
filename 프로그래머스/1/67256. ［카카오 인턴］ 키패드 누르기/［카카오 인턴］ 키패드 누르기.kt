import kotlin.math.* 
class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        val arr = numbers.map{ if(it == 0) 11 else it }
        var answer = ""
        var lh = 10
        var rh = 12
        for(x in arr){
            if(x % 3 == 1){
                lh = x
                answer += "L"
            }else if(x % 3 == 0){
                rh = x
                answer += "R"
            }else{
                val r = distance(rh, x)
                val l = distance(lh, x)
                if(r > l){
                    answer += "L"
                    lh = x
                }else if(r < l){
                    answer += "R"
                    rh = x
                }else {
                    if(hand=="right"){
                        answer += "R"
                        rh = x
                    }else{
                        answer += "L"
                        lh = x
                    }
                }
            }
        }
        return answer
    }
    private fun distance(from: Int, to: Int): Int{
        val diff = abs(from-to)
        return diff % 3 + diff / 3
    }
}