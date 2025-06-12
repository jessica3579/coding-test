class Solution {
    var scores: MutableMap<Char, Int> = mutableMapOf()
    
    fun decision(c1: Char, c2: Char): Char{
        val c1Score = scores.getOrDefault(c1, 0)
        val c2Score = scores.getOrDefault(c2, 0)
        
        if(c1Score > c2Score) return c1
        else if(c1Score < c2Score) return c2
        else return if(c1.toInt() > c2.toInt()) c2 else c1
    }
    
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""
        for(i in 0..survey.lastIndex){
            var score: Int = choices[i]
            if(score != 4){
                val type = if(score < 4) survey[i][0] else survey[i][1]
                score = if(score > 4) score - 4 else 4 - score
                scores.put(type, scores.getOrDefault(type, 0) + score)
            }
        }
        answer += decision('R', 'T')
        answer += decision('C', 'F')
        answer += decision('J', 'M')
        answer += decision('A', 'N')
        return answer
    }
}