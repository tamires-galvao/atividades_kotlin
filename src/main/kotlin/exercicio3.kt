fun  main(){
    val result = funcaoParametroDefault(arg1 = "Tamires", arg2 = "Galvão")
    println(result)
}

fun funcaoParametroDefault(arg1: String = "Valor default,", arg2: String,): String{
    return "Argumento1: $arg1 e Arqumento2: ${arg2}"

}