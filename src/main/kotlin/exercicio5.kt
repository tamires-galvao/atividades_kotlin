fun main(){
    println("Informe um número: ")
    val num: Int ?= readLine()?.toInt()

    if (num != null) {
        if (num % 2 == 0 && num % 5 ==0) {
            println("FACEC")
        }else if (num % 5 == 0){
            println("CEC")
        }else if (num % 3 == 0){
            println("FA")
        }else {
            print(num)
        }
    }

}