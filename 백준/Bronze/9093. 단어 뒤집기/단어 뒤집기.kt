fun main(){
    val n = readln().toInt()
    repeat(n) {
        val input = readln()
        val reversed = input.split(" ").map{ it.reversed() }.joinToString(" ")
        println(reversed)
    }
}