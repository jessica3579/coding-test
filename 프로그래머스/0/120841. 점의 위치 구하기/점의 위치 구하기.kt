class Solution {
    fun solution(dot: IntArray) = if(dot[0] > 0 && dot[1] > 0) 1 else if(dot[0] < 0 && dot[1] > 0) 2 else if(dot[0] < 0 && dot[1] < 0) 3 else 4 
}