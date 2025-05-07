fun main(){
    val n = readln().toInt()
    val list = mutableListOf<Int>()
    repeat(n){
        val input = readln().split(" ").map { it.toInt() }
        list.addAll(input)
    }
    list.sort()
    println(list[list.size - n])
}