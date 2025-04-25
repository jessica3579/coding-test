fun main(args: Array<String>) {
    val s1 = readLine()!!
    val sb = StringBuilder()
    
    for(x in s1){
        if(x.isLowerCase()) sb.append(x.uppercaseChar())
        else sb.append(x.lowercaseChar())
    }
    println(sb)
}