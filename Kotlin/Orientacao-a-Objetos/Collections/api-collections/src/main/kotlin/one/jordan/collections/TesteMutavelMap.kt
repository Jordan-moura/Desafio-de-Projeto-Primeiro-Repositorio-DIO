package one.jordan.collections

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContracao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, tipoContracao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContracao = "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("------------------------------------")
    repositorio.findAll().forEach{ println(it) }

    println("------------------------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{ println(it) }
}