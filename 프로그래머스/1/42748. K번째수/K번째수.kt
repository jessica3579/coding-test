class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size)
        
        for(i in commands.indices){
            var answerArray = array.sliceArray(IntRange(commands[i][0] - 1 , commands[i][1] - 1)).sortedArray()
            answer[i] = answerArray[commands[i][2]-1]
        }
        return answer
    }
}