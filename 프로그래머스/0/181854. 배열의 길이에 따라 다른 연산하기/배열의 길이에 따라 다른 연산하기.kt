class Solution {
    fun solution(arr: IntArray, n: Int) = if(arr.size % 2 == 1){
        arr.mapIndexed{
            i, v -> if(i%2==0) v + n else v
        }
    }else{
        arr.mapIndexed{
            i, v -> if(i%2==1) v + n else v
        }
    }
}