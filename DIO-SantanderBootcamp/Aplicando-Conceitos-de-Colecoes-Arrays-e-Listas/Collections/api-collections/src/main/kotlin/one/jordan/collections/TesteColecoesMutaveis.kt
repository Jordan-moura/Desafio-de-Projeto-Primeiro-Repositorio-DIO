package one.jordan.collections

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContracao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, tipoContracao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContracao = "CLT")

    println("------------ LIST ------------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("--------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("--------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("------------ SET --------------")
    val funcionarioSet = mutableSetOf(joao)
   // funcionarioSet.forEach { println(it) }

    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("--------------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}