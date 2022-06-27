package one.jordan.collections

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContracao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, tipoContracao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContracao = "CLT")

    val funcionario1 = setOf(joao, pedro)
    val funcionario2 = setOf(maria)

    val resultUnion = funcionario1.union(funcionario2)

    resultUnion.forEach {
        println(it)
    }

    println("---------------------")
    val funcionario3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionario3.subtract(funcionario2)
    resultSubtract.forEach {
        println(it)
    }

    println("---------------------")
    val resulIntersect = funcionario3.intersect(funcionario2)
    resulIntersect.forEach {
        println(it)
    }
}