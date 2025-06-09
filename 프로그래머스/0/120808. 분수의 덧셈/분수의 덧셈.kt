// 방법 1
// class Solution {
//     fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
//         var numer = numer1 * denom2 + numer2 * denom1
//         var denom = denom1 * denom2
        
//         for(x in 2..denom/2){
//             if(numer % x == 0 && denom % x == 0){
//                 while(numer % x == 0 && denom % x == 0){
//                     numer /= x
//                     denom /= x
//                 }
//             }
//         }
//         return intArrayOf(numer, denom)
//     }
// }

// 방법 2
// class Solution {
//     fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
//         var numer = numer1 * denom2 + numer2 * denom1
//         var denom = denom1 * denom2
        
//         for(x in 2..denom/2){
//             while(numer % x == 0 && denom % x == 0){
//                 numer /= x
//                 denom /= x
//             }
//         }
//         return intArrayOf(numer, denom)
//     }
// }

// 방법 3
class Solution {
    fun gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a % b)
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var numer = numer1 * denom2 + numer2 * denom1
        var denom = denom1 * denom2
        
        val gcdValue = gcd(numer, denom)
        
        return intArrayOf(numer / gcdValue, denom / gcdValue)
    }
}
