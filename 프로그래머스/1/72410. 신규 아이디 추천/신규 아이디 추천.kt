// 내가 처음 푼 방식 
// class Solution {
//     fun process(id: String): String{
//         // step 1
//         var id = id.toLowerCase()
        
//         // step 2
//         id = id.map{ it }.filter{ it.isLowerCase() || it.isDigit() || it == '-' || it ==  '_' || it == '.' }.joinToString("")
        
//         // step 3
//         if(id.contains('.')){
//             for(i in id.length downTo 2){
//                 var tmp = ""
//                 repeat(i){ tmp += "." }
//                 if(id.contains(tmp)) id = id.replace(tmp, ".")
                
//             }
//         }
        
//         // step 4
//         if(id != "" && id[0] == '.') id = id.drop(1)
//         if(id != "" && id[id.lastIndex] == '.') id = id.dropLast(1)
        
//         // step 5
//         if(id == "") id += "a"
        
//         // step 6
//         if(id.length >= 16) id = id.substring(0, 15)
//         if(id[id.lastIndex] == '.') id = id.dropLast(1)
        
//         // step 7
//         // if(id.length<= 2){
//         //     if(id.length == 1) repeat(2){ id += id[0] }
//         //     else id += id[1]
//         // }
//         when(id.length){
//             1 -> repeat(2){ id += id[0] }
//             2 -> id += id[1]
//         }

//         return id
//     }
    
//     fun solution(new_id: String): String {
//         return process(new_id)
//     }
// }

// 내가 수정한 방식 
// class Solution {
//     fun process(id: String): String{
//         // step 1
//         var id = id.toLowerCase()
        
//         // step 2
//         id = id.map{ it }.filter{ it.isLowerCase() || it.isDigit() || it == '-' || it ==  '_' || it == '.' }.joinToString("")
        
//         // step 3
//         // .을 계속 생성하는거 말고
//         // 처음에 .을 길이만큼 생성해두고 하나씩 drop으로 수정 
//         if(id.contains('.')){
//             var tmp = ""
//             repeat(id.length){ tmp += "." }
//             for(i in id.length downTo 2){
//                 if(id.contains(tmp)) id = id.replace(tmp, ".")
//                 tmp = tmp.drop(1)
//             }
//         }
        
//         // step 4
//         if(id != "" && id[0] == '.') id = id.drop(1)
//         if(id != "" && id[id.lastIndex] == '.') id = id.dropLast(1)
        
//         // step 5
//         if(id == "") id += "a"
        
//         // step 6
//         if(id.length >= 16) id = id.substring(0, 15)
//         if(id[id.lastIndex] == '.') id = id.dropLast(1)
        
//         // step 7
//         when(id.length){
//             1 -> repeat(2){ id += id[0] }
//             2 -> id += id[1]
//         }

//         return id
//     }
    
//     fun solution(new_id: String): String {
//         return process(new_id)
//     }
// }

// gpt 수정 버전 
class Solution {
    fun process(id: String): String{
        // step 1 - toLowerCase()는 옛날 버전, lowercase()로 수정 
        var id = id.lowercase()
        
        // step 2 - 굳이 map하지 않아도 문자열 filter 가능 
        id = id.filter{ it.isLowerCase() || it.isDigit() || it == '-' || it ==  '_' || it == '.' }
        
        // step 3 - 
        if(id.contains('.')){
            var tmp = ""
            repeat(id.length){ tmp += "." }
            for(i in id.length downTo 2){
                if(id.contains(tmp)) id = id.replace(tmp, ".")
                tmp = tmp.drop(1)
            }
        }
        
        // step 4
        if(id != "" && id[0] == '.') id = id.drop(1)
        if(id != "" && id[id.lastIndex] == '.') id = id.dropLast(1)
        
        // step 5
        if(id == "") id = "a"
        
        // step 6
        if(id.length >= 16) id = id.substring(0, 15)
        if(id[id.lastIndex] == '.') id = id.dropLast(1)
        
        // step 7 - while문으로 더 간단하게 가능 
        while(id.length <= 2){
            id += id.last()
        }

        return id
    }
    
    fun solution(new_id: String): String {
        return process(new_id)
    }
}
