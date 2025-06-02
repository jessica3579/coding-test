// class Solution {
//     fun solution(numbers: String): Long {
//         var answer = ""
//         val list = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
//         var tmp = ""
//         for(i in 0 .. numbers.length){
//             if(tmp != "" && list.contains(tmp)){
//                 when(tmp){
//                     "zero" -> answer += "0"
//                     "one" -> answer += "1"
//                     "two" -> answer += "2"
//                     "three" -> answer += "3"
//                     "four" -> answer += "4"
//                     "five" -> answer += "5"
//                     "six" -> answer += "6"
//                     "seven" -> answer += "7"
//                     "eight" -> answer += "8"
//                     else -> answer += "9"
//                 }
//                 if(i != numbers.length) tmp = "${numbers[i]}"
//             }else {
//                 if(i != numbers.length) tmp += numbers[i]
//             }
//         }
//         return answer.toLong()
//     }
// }

class Solution {
    fun solution(numbers: String): Long {
        var answer = numbers
        val sample = mapOf(
            "0" to "zero",
            "1" to "one",
            "2" to "two",
            "3" to "three",
            "4" to "four", 
            "5" to "five",
            "6" to "six",
            "7" to "seven",
            "8" to "eight",
            "9" to "nine"
        )
        
        sample.forEach{
            answer = answer.replace(it.value, it.key)
        }
        
        return answer.toLong()
    }
}