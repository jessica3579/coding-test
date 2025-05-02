class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var rank = mutableListOf<Int>()
        var answer = mutableListOf<Int>()
        for(x in score){
            if(rank.size < k) rank.add(x)
            else if(rank[0] < x) rank[0] = x
            
            rank.sort()
            answer.add(rank[0])
        }
        return answer.toIntArray()
    }
}