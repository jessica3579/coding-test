class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        var cnt = 0
        for(x in left..right){
            for(i in 1..x){
                if(x % i == 0) cnt++
            }
            if(cnt % 2 == 0) answer += x else answer -= x
            cnt = 0
        }
        return answer
    }
}