class Solution {
    fun solution(angle: Int) = 
    // if(angle > 0 && angle < 90) 1 else if(angle == 90) 2 else if(angle == 180) 4 else 3
    when{
        (angle in 1..89) -> 1
        (angle == 90) -> 2
        (angle in 91..179) -> 3
        else -> 4
    }
}