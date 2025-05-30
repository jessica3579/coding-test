class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val d00: Double = dots[0][0].toDouble()
        val d01: Double = dots[0][1].toDouble()
        val d10: Double = dots[1][0].toDouble()
        val d11: Double = dots[1][1].toDouble()
        val d20: Double = dots[2][0].toDouble()
        val d21: Double = dots[2][1].toDouble()
        val d30: Double = dots[3][0].toDouble()
        val d31: Double = dots[3][1].toDouble()
        
        return if( ((d01-d11) / (d00-d10) == (d21-d31) / (d20-d30)) || ((d01-d21) / (d00-d20) == (d11-d31) / (d10-d30)) || ((d01-d31) / (d00-d30) == (d11-d21) / (d10-d20)) ) 1 else 0
    }
}