class Solution {
    fun solution(seoul: Array<String>): String {
        for(i in seoul.indices){
            if(seoul[i] == "Kim") return "김서방은 ${i}에 있다"
        }
        return ""
    }
}