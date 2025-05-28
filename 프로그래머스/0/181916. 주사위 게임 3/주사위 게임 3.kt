class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var str: String = (a.toString() + b.toString() + c.toString() + d.toString()).map{ it }.sorted().joinToString("")
        var cnt = 0
        if(a == b) cnt++
        if(a == c) cnt++
        if(a == d) cnt++
        if(b == c) cnt++
        if(b == d) cnt++
        if(c == d) cnt++
        
        val s1 = str[0].digitToInt()
        val s2 = str[1].digitToInt()
        val s3 = str[2].digitToInt()
        val s4 = str[3].digitToInt()
        
        if(cnt == 6){ // pppp
            return a * 1111
        }else if(cnt == 3){ // pppq
            return if(s1 == s2) ((10 * s3) + s4) * ((10 * s3) + s4) else ((10 * s2) + s1) * ((10 * s2) + s1)
        }else if(cnt == 2){ // ppqq
            return (s2 + s3) * (s3 - s2)
        }else if(cnt == 1){ // ppqr
            return if(s1 == s2) s3 * s4 else if(s2 == s3) s1 * s4 else s1 * s2
        }else { // pqrs 
            return s1
        }
    }
}