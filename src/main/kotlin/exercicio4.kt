fun main(){

    println("Informe um número para a operação")
    val v1: Int ?= readLine()?.toInt()

    println("Informe um número para a operação")
    val v2: Int ?= readLine()?.toInt()

    println("Informe a operação que deseja realizar com os valores informados: ")
    println("(+) (-) (*) (/)")
    val op = readLine()

  when {
      op == "+" -> print(soma(v1,v2))
      op == "-" -> print(subtracao(v1,v2))
      op == "*" -> print(multiplicacao(v1,v2))
      op == "/" -> print(divisao(v1,v2))
  }
}
fun soma(v1: Int ?, v2:Int ?): Int? {

    return (v1!! + v2!!)
}

//Jeito simplificado
fun subtracao (v1: Int?, v2:Int?) = v1!! - v2!!

fun multiplicacao (v1: Int?, v2:Int?) = v1!! * v2!!

fun divisao (v1: Int?, v2:Int?) = v1!! / v2!!




