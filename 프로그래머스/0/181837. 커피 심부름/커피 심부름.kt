class Solution {
    // fun solution(order: Array<String>): Int {
    //     var answer: Int = 0
    //     for(x in order){
    //         if(x.contains("latte")){
    //             println("latte")
    //             answer += 5000
    //         }else {
    //             println("ame")
    //             answer += 4500
    //         }
    //     }
    //     return answer
    // }
    fun solution(order: Array<String>) = order.map{ if(it.contains("latte")) 5000 else 4500}.sum()
}