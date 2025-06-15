class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        var answer: Int = 2
        
        dic.forEach{ word ->
            if(spell.size == word.length){
                var cnt = 0
                for(s in spell){
                    if(word.contains(s)) cnt++
                    if(cnt == spell.size) return 1
                }
            }
        }
        return answer
    }
}