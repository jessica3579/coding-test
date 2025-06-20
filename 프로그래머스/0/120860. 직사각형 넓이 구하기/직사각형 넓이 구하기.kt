class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var x1 = dots[0][0]
        var y1 = dots[0][1]
        
        var x2 = if(dots[1][1] == y1) dots[1][0] else if(dots[2][1] == x1) dots[2][0] else dots[3][0]
        var y2 = if(dots[1][0] == x1) dots[1][1] else if(dots[2][0] == x1) dots[2][1] else dots[3][1]
        
        val width = maxOf(x1, x2) - minOf(x1, x2) 
        val height = maxOf(y1, y2) - minOf(y1, y2) 
    
        return width * height
    }
}