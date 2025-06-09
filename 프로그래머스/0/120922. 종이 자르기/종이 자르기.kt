// class Solution {
//     fun solution(M: Int, N: Int) = if(M == 1 && N == 1) 0 else minOf(M, N) - 1 + minOf(M,N) * ( maxOf(M, N) - 1 )
// }
class Solution {
    fun solution(M: Int, N: Int) = M * N - 1
}