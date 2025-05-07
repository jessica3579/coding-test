import java.util.*
fun main(){
    val queue = LinkedList<Int>() 
    val n = readln().toInt()
    for(x in 1..n) queue.offer(x)
    while(queue.size != 1){
        queue.remove()
        queue.offer(queue.remove())
    }
    println(queue.peek())
}