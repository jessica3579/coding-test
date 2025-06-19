// class Solution {
//     fun solution(s: String, skip: String, index: Int): String {
//         var answer: String = ""
        
//         s.forEach{ char ->
//             var result: Char = char + index
            
//             skip.forEach{ c ->
                
//                 if(result > 'z'){
//                     if( char < c && c + 'z'.toInt() <= result) result++
//                 }else {
//                     if( char < c && c <= result) result++
//                 }
                
//             }
//             println(result)
//             answer += if(result > 'z') result - 'a' else result
//         }
//         return answer
//     }
// }

class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val alphabet = ('a'..'z').filter { it !in skip }  // skip 제외한 알파벳 리스트
        val map = alphabet.withIndex().associate { it.value to it.index }  // 문자 → 인덱스 매핑
        val size = alphabet.size

        return s.map { ch ->
            val pos = map[ch]!!  // 현재 문자의 인덱스
            alphabet[(pos + index) % size]  // index만큼 이동한 뒤, 순환
        }.joinToString("")
    }
}