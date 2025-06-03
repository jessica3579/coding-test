// class Solution {
//     fun solution(myString: String, pat: String): String {
//         var lastIdx = 0
//         val mlen = myString.length
//         val plen = pat.length
//         for(i in 0..mlen - plen){
//             if(myString.substring(i, i + plen) == pat) lastIdx = i
//         }
//         return myString.substring(0, lastIdx + plen)
//     }
// }

class Solution {
    fun solution(myString: String, pat: String) = myString.substring(0, myString.lastIndexOf(pat) + pat.length)
}