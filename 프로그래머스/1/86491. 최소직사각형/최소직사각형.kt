class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxWidth = 0
        var maxHeight = 0
        
        for (size in sizes) {
            maxWidth = maxOf(maxWidth, maxOf(size[0], size[1]))
            maxHeight = maxOf(maxHeight, minOf(size[0], size[1]))
        }
        
        return maxWidth * maxHeight
    }
}