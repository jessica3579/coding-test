// 시간 초과 뜸
// class Solution {
//     fun solution(X: String, Y: String): String {
//         var answer: String = ""
//         var list1 = X.map { it }.toMutableList()
//         var list2 = Y.map { it }.toMutableList()
//         for(x in list1){
//             if(list2.contains(x)) {
//                 answer += x
//                 list2.remove(x)
//             }
//         }
        
//         return if(answer.isEmpty()) "-1" else if(answer.all {it == '0'}) "0" else answer.map{it.digitToInt()}.sortedDescending().joinToString("")
//     }
// }

class Solution {
    fun solution(X: String, Y: String): String {
        var xL = IntArray(10)
        var yL = IntArray(10)
        
        for(x in X) xL[x-'0']++
        for(y in Y) yL[y-'0']++
        
        val sb = StringBuilder() 
        
        for(i in 9 downTo 0){
            val cnt = minOf(xL[i], yL[i])
            repeat(cnt) {
                sb.append(i)
            }
        }
        val result = sb.toString()
        return when{
            result.isEmpty() -> "-1"
            result.all {it == '0'} -> "0"
            else -> result
        }
    }
}
