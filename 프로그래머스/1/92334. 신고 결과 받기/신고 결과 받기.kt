class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var n = id_list.size
        var answer: IntArray = IntArray(n)
        var isReport = Array(n){ Array(n){0} }
        var id_map = mutableMapOf<String, Int>()
        var reportCnt = IntArray(n)
        
        id_list.forEachIndexed{ index, name ->
            id_map[name] = index    
        }
        for(r in report){
            val tmp = r.split(" ")
            // a -> b
            val a = id_map.getValue(tmp[0])
            val b = id_map.getValue(tmp[1])
            if(isReport[a][b] == 0){
                isReport[a][b] = 1
                reportCnt[b] = reportCnt[b] + 1
            }
        }
        for(i in reportCnt.indices){
            if(reportCnt[i] >= k){
                for(a in 0..n-1){
                    if(isReport[a][i] == 1) isReport[a][i] = 2
                }
            }
        }
        for(i in 0..n-1){
            var tmp = 0
            for(j in 0..n-1){
                //print("${isReport[i][j]} ")
                if(isReport[i][j] == 2) tmp++
            }
            //println( )
            answer[i] = tmp
        }
        
        return answer
    }
}