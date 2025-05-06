import kotlin.math.sqrt
class Solution {
    fun solution(n: Int) = if(sqrt(n.toDouble()).toInt() * sqrt(n.toDouble()).toInt() == n ) 1 else 2
}