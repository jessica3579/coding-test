// 시간 초과 
// class Solution {
//     fun solution(ingredient: IntArray): Int {
//         var answer: Int = 0
//         var str = "0000"
//         for(i in ingredient){
//             str += i.toString()
//             //println(str)
//             if(str.takeLast(4) == "1231"){
//                 str = str.dropLast(4)
//                 //println("if문 안 str $str")
//                 answer++
//             }
//         }
//         return answer
//     }
// }

class Solution {
    fun solution(ingredient: IntArray): Int {
        var stack = ArrayDeque<Int>()
        var answer = 0
        for(item in ingredient){
            stack.add(item)
            
            if(stack.size >= 4 && stack.slice(stack.size-4 until stack.size) == listOf(1, 2, 3, 1)){
                answer++
                repeat(4) { stack.removeLast() }
            }
        }
        return answer
    }
}