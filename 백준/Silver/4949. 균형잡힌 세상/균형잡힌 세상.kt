import java.util.*
fun main(){
    while(true){
        val input = readln()
        if(input == ".") break
        
        val stack = Stack<Char>()
        var isValid = true
        for(x in input){
            when(x){
            '(', '[' -> stack.push(x)
            ')' ->{
                if(stack.isEmpty() || stack.peek() != '('){
                    isValid = false
                    break
                }
                stack.pop()
            }
            ']' ->{
                if(stack.isEmpty() || stack.peek() != '['){
                    isValid = false
                    break
                }
                stack.pop()
            }
            }
        }
        if(isValid && stack.isEmpty()) println("yes") else println("no")
    }
}