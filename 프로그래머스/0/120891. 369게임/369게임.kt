class Solution {
    fun solution(order: Int) =  order.toString().toList().count{ it == '3' || it == '6' || it == '9' }
}