// class Solution {
//     fun solution(strArr: Array<String>): Int {
//         val arr = strArr.map { it.length }
//         val list = Array(arr.maxOrNull()!! + 1) { 0 }
//         for(x in arr){
//             list[x]++
//         }
//         return list.maxOrNull()!!
//     }
// }
class Solution {
    fun solution(strArr: Array<String>) = strArr.groupBy(String::length).values.maxOf(List<String>::size)
}
