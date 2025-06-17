// class Solution {
//     fun canMove(key: String, board: IntArray, location: IntArray): Boolean{
//         val horizon = board[0] / 2 
//         val verti = board[1] / 2 
//         var value = false
//         when(key){
//             "left" -> if( location[0] > 0 - horizon ) value = true
//             "right" -> if( location[0] < horizon ) value = true
//             "up" -> if( location[1] < verti ) value = true
//             "down" -> if( location[1] > 0 - verti ) value = true
//         }
//         return value
//     }
//     fun solution(keyinput: Array<String>, board: IntArray): IntArray {
//         var location = intArrayOf(0, 0)
//         keyinput.forEach{ key ->
//             val cM = canMove(key, board, location)
//             when(key){
//                 "left" -> if(cM) location[0] -= 1
//                 "right" -> if(cM) location[0] += 1
//                 "up" -> if(cM) location[1] += 1
//                 "down" -> if(cM) location[1] -= 1
//             }
//         }
//         return location
//     }
// }

class Solution {
    fun move(key: String, board: IntArray, location: IntArray): IntArray{
        val horizon = board[0] / 2 
        val verti = board[1] / 2 
        var location = location
        when(key){
            "left" -> if( location[0] > 0 - horizon ) location[0] -= 1
            "right" -> if( location[0] < horizon ) location[0] += 1
            "up" -> if( location[1] < verti ) location[1] += 1
            "down" -> if( location[1] > 0 - verti ) location[1] -= 1
        }
        return location
    }
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var location = intArrayOf(0, 0)
        keyinput.forEach{ key ->
            location = move(key, board, location)
        }
        return location
    }
}