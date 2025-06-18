// class Solution {
//     fun solution(a: Int, b: Int, n: Int): Int {
//         var answer: Int = 0
//         var n = n
//         var restSum = 0
//         while(n != 0){
//             answer += ( n / a ) * b
//             restSum += n % a
//             n = ( n / a ) * b
//         }
//         restSum += n
//         // restSum이 a이상이면 그것도 나머지를 더해서 더 받을 수 있는지 확인해야함 
//         var restrestSum = 0 
//         while(restSum != 0){
//             answer += ( restSum / a ) * b
//             restrestSum += restSum % a
//             restSum = ( restSum / a ) * b
//         }
//         restrestSum += restSum
//         // var restrestrestSum = 0
//         // while(restrestSum != 0){
//         //     answer += ( restrestSum / a ) * b
//         //     restrestrestSum += restrestSum % a
//         //     restrestSum = ( restrestSum / a) * b
//         // }
//         // restrestrestSum += restrestSum 
//         answer += ( restrestSum / a ) * b

//         return answer
//     }
// }

class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var n = n
        while(n >= a){
            var remain = n % a
            n = n / a * b
            answer += n
            n += remain
        }
        return answer
    }
}