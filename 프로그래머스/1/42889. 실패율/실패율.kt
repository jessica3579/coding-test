class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var sNum: MutableMap<Int, Int> = mutableMapOf()
        var fPct: MutableMap<Int, Double> = mutableMapOf()

        for(x in stages){
            sNum.put(x, sNum.getOrDefault(x, 0) + 1)
        }
        var players = stages.size
        for(i in 1..N){
            val notClearP = sNum.getOrDefault(i, 0)
            if(players != 0){
                fPct.put(i, notClearP / players.toDouble())
            }else {
                fPct.put(i, 0.0)
            }
            players -= notClearP
        }
        return fPct.entries.sortedByDescending{ it.value }.map{ it.key }.toIntArray()
    }
}