class Solution {
    fun solution(chicken: Int): Int {
        var answer: Int = 0
        var rest = 0
        var restrest = 0
        var chicken = chicken
        if(chicken < 10) return 0
        
        while(chicken / 10 > 0){
            answer += chicken / 10
            rest += chicken % 10
            chicken = chicken / 10
        }
        rest += chicken
        while(rest / 10 > 0){
            answer += rest / 10
            restrest += rest % 10
            rest = rest / 10
        }
        restrest += rest
        answer += restrest / 10
        return answer 
    }
}