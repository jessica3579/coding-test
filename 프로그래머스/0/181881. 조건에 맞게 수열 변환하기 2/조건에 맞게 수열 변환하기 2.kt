class Solution {
    fun solution(arr: IntArray): Int {
    var count = 0 // 변환 횟수
    var prevArr = arr.copyOf() // 이전 배열 상태를 저장할 복사본
    
    while (true) {
        val nextArr = IntArray(arr.size) // 다음 배열 상태를 저장할 배열
        var changed = false // 이번 반복에서 변화가 있었는지 여부

        for (i in arr.indices) {
            val num = prevArr[i]
            var transformedNum = num

            if (num >= 50 && num % 2 == 0) {
                transformedNum = num / 2
            } else if (num < 50 && num % 2 != 0) {
                transformedNum = num * 2 + 1
            }
            
            nextArr[i] = transformedNum
            
            // 변화가 있었는지 확인
            if (transformedNum != num) {
                changed = true
            }
        }
        
        // 변화가 없었다면 반복 중단
        if (!changed) {
            break
        }
        
        prevArr = nextArr // 다음 반복을 위해 prevArr 업데이트
        count++ // 횟수 증가
    }
    
    return count
}

}