class Solution {
    fun process(id: String): String{
        // step 1
        var id = id.toLowerCase()
        
        // step 2
        id = id.map{ it }.filter{ it.isLowerCase() || it.isDigit() || it == '-' || it ==  '_' || it == '.' }.joinToString("")
        
        // step 3
        if(id.contains('.')){
            for(i in id.length downTo 2){
                var tmp = ""
                repeat(i){ tmp += "." }
                if(id.contains(tmp)) id = id.replace(tmp, ".")
                
            }
        }
        
        // step 4
        if(id != "" && id[0] == '.') id = id.drop(1)
        if(id != "" && id[id.lastIndex] == '.') id = id.dropLast(1)
        
        // step 5
        if(id == "") id += "a"
        
        // step 6
        if(id.length >= 16) id = id.substring(0, 15)
        if(id[id.lastIndex] == '.') id = id.dropLast(1)
        
        // step 7
        if(id.length<= 2){
            if(id.length == 1) repeat(2){ id += id[0] }
            else id += id[1]
        }
        // when(id.length <= 2){
        //     id.length == 1 -> repeat(2){ id += id[0] }
        //     id.length == 2 -> id += id[1]
        // }

        return id
    }
    fun solution(new_id: String): String {
        return process(new_id)
    }
}