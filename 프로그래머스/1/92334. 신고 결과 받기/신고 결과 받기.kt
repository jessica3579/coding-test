// class Solution {
//     fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
//         var n = id_list.size
//         var answer: IntArray = IntArray(n)
//         var isReport = Array(n){ Array(n){0} }
//         var id_map = mutableMapOf<String, Int>()
//         var reportCnt = IntArray(n)
        
//         id_list.forEachIndexed{ index, name ->
//             id_map[name] = index    
//         }
//         // 신고 현황 2차원 배열 isReport에 값 넣기 
//         for(r in report){
//             val tmp = r.split(" ")
//             // a -> b
//             val a = id_map.getValue(tmp[0])
//             val b = id_map.getValue(tmp[1])
//             if(isReport[a][b] == 0){
//                 isReport[a][b] = 1
//                 reportCnt[b] = reportCnt[b] + 1
//             }
//         }
//         // 정지된 사용자의 경우는 2차원 배열에서 값을 2로 바꾸기 
//         for(i in reportCnt.indices){
//             if(reportCnt[i] >= k){
//                 for(a in 0..n-1){
//                     if(isReport[a][i] == 1) isReport[a][i] = 2
//                 }
//             }
//         }
//         // 2차원 배열을 탐색하면서 2인 값들을 reportCnt 배열에 넣기 
//         for(i in 0..n-1){
//             var tmp = 0
//             for(j in 0..n-1){
//                 if(isReport[i][j] == 2) tmp++
//             }
//             answer[i] = tmp
//         }
        
//         return answer
//     }
// }

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
        // 신고 현황 2차원 배열 isReport에 값 넣기 
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
        // 정지된 사용자의 경우는 2차원 배열에서 값을 2로 바꾸기 
        for(i in reportCnt.indices){
            if(reportCnt[i] >= k){
                for(a in 0 until n){
                    if(isReport[a][i] == 1) isReport[a][i] = 2
                }
            }
        }
        // 2차원 배열을 탐색하면서 2인 값들을 reportCnt 배열에 넣기 
        for(i in 0 until n){
            var tmp = 0
            for(j in 0 until n){
                if(isReport[i][j] == 2) tmp++
            }
            answer[i] = tmp
        }
        
        return answer
    }
}
