class Solution {
    fun solution(babbling: Array<String>): Int = babbling.filter {
        !it.contains("ayaaya|yeye|woowoo|mama".toRegex())
    }.map{
        it.replace("aya|ye|woo|ma".toRegex(), "")
    }.filter { it.isEmpty() }.size
}