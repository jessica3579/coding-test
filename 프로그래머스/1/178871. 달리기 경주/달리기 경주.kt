// 시간 초과 
// class Solution {
//     fun solution(players: Array<String>, callings: Array<String>): Array<String> {
//         var answer = players.toMutableList()
//         for(c in callings){
//             for(i in answer.indices){
//                 if(c == answer[i]){
//                     val tmp = answer[i]
//                     answer[i] = answer[i-1]
//                     answer[i-1] = tmp 
//                     break
//                 }
                
//             }
//         }
//         return answer.toTypedArray()
//     }
// }

class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var nameToIndex = mutableMapOf<String, Int>()
        var playerList = players.toMutableList()
        
        players.forEachIndexed { index, name ->
            nameToIndex[name] = index
        }
        
        for(c in callings){
            val index = nameToIndex.getValue(c)
            val frontIndex = index -1
            
            val frontName = playerList[frontIndex]
            playerList[index] = frontName
            playerList[frontIndex] = c
            
            nameToIndex[c] = frontIndex
            nameToIndex[frontName] = index
        }
        return playerList.toTypedArray()
    }
}