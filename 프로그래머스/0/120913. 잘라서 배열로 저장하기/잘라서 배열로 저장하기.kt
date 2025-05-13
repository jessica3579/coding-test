// class Solution {
//     fun solution(my_str: String, n: Int): Array<String> {
//         var answer = mutableListOf<String>()
//         var tmp: String = ""
//         var cnt: Int = 1
//         for(i in my_str.indices){
//             if(cnt <= n){
//                 tmp += my_str[i]
//                 cnt++
//                 if(i == my_str.length-1) answer.add(tmp)
//             }else if(cnt == n+1){
//                 answer.add(tmp)
//                 cnt = 1
//                 tmp = ""
//                 tmp += my_str[i]
//                 cnt++
//             }
//         }
//         return answer.toTypedArray()
//     }
// }
class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        val answer = mutableListOf<String>()
        var i = 0
        while (i < my_str.length) {
            val end = minOf(i + n, my_str.length)
            answer.add(my_str.substring(i, end))
            i += n
        }
        return answer.toTypedArray()
    }
}