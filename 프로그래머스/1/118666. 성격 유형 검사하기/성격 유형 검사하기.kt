// class Solution {
//     var scores: MutableMap<Char, Int> = mutableMapOf()
    
//     fun decision(c1: Char, c2: Char): Char{
//         val c1Score = scores.getOrDefault(c1, 0)
//         val c2Score = scores.getOrDefault(c2, 0)
        
//         if(c1Score > c2Score) return c1
//         else if(c1Score < c2Score) return c2
//         else return if(c1.toInt() > c2.toInt()) c2 else c1
//     }
    
//     fun solution(survey: Array<String>, choices: IntArray): String {
//         var answer: String = ""
//         for(i in 0..survey.lastIndex){
//             var score: Int = choices[i]
//             if(score != 4){
//                 val type = if(score < 4) survey[i][0] else survey[i][1]
//                 score = if(score > 4) score - 4 else 4 - score
//                 scores.put(type, scores.getOrDefault(type, 0) + score)
//             }
//         }
//         answer += decision('R', 'T')
//         answer += decision('C', 'F')
//         answer += decision('J', 'M')
//         answer += decision('A', 'N')
//         return answer
//     }
// }

class Solution {
    
    fun decision(scores: Map<Char, Int>, c1: Char, c2: Char): Char{
        val c1Score = scores.getOrDefault(c1, 0)
        val c2Score = scores.getOrDefault(c2, 0)
        
        return when{
            c1Score > c2Score -> c1
            c1Score < c2Score -> c2
            else -> if(c1 < c2) c1 else c2   
        }
    }
    
    fun solution(survey: Array<String>, choices: IntArray): String {
        var scores: MutableMap<Char, Int> = mutableMapOf()
        var answer: String = ""
        
        for(i in survey.indices){
            var choice: Int = choices[i]
            if(choice != 4){
                val type = if(choice < 4) survey[i][0] else survey[i][1]
                val actualScore = kotlin.math.abs(choice-4)
                scores[type] = scores.getOrDefault(type, 0) + actualScore
            }
        }
        
        answer += decision(scores, 'R', 'T')
        answer += decision(scores, 'C', 'F')
        answer += decision(scores, 'J', 'M')
        answer += decision(scores, 'A', 'N')
        
        return answer
    }
}