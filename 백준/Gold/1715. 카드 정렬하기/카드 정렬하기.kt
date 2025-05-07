import java.util.*
fun main(){
    val n = readln().toInt()
    val pq = PriorityQueue<Int>()
    var answer = 0
    
    repeat(n){ pq.add(readln().toInt()) }
    
    while(pq.size > 1){
        val sum = pq.poll() + pq.poll()
        answer += sum
        pq.add(sum)
    }
    println(answer)
}