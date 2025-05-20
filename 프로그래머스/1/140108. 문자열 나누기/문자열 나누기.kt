class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var x = s[0]
        var xnum = 1
        var ynum = 0
        var idx = 1
        if(s.length == 1) return 1
        while(idx < s.length){
            if(x == s[idx]) xnum++
            else ynum++
            
            if(xnum == ynum && idx == s.length-2){
                answer += 2
                idx++
            }else if(xnum == ynum && idx != s.length-1){
                println("if문 안 $idx, $xnum, $ynum")
                answer++
                x = s[idx+1]
                xnum = 1
                ynum = 0
                idx++
            }else if(idx == s.length-1) {
                println("else문 안 $idx")
                answer++
            }
            idx++
        }
        return answer
    }
}
