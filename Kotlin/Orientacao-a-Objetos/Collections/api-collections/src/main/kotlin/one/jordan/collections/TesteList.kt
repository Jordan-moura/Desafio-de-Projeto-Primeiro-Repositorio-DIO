package one.jordan.collections

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContracao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, tipoContracao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContracao = "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach {
        println(it)
    }

    println("-------------------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("-------------------------------")
    funcionarios.sortedBy{it.salario}.forEach{println(it)}

    println("-------------------------------")
    funcionarios.groupBy{it.tipoContracao}.forEach{println(it)}
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContracao: String
    ){
    override fun toString(): String =
       """
           Nome:    $nome
           Salario: $salario
       """.trimIndent()
}