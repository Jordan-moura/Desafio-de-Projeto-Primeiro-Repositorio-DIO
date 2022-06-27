/**
 *  O programa eh uma calculadora simples pedido pelo curso "Introducao ao Kotlin"
 *  No momento que estou aprendendo com o bootcamp Mobile Santander
 */
import java.util.*
import kotlin.math.*

fun main() {
	
	val choose = menu()
   
    val result = calculations(choose)
 	
    println(result)
}

fun menu():Int{
    println("------------Calculadora Simples ------------")
    println("")
    println("1-Soma")
    println("2-Subtracao")
    println("3-Divisao")
    println("4-Multiplicacao")
    println("5-Expontenciacao")
    println("6-Raiz:")
    
  	return 6  											// Insira a operacao desejada
}

fun calculations(choose:Int):Float{
    
    val a = 9.0f										// Insira os valores que serao calculados
    val b = 2.0f
    var result:Float
    
    result = when(choose){
        
        1 -> calculate(a, b){a, b -> a + b}
        
        2 ->  calculate(a, b){a, b -> a - b}
        
        3 ->  calculate(a, b){a, b -> a / b}
        
        4 -> calculate(a, b){a, b -> a * b}
        
        5 ->  calculate(a, b){a, b -> a.pow(b)}
        
        6 -> calculate(a, b){a, b -> a.toFloat().pow(1/b.toFloat())}
        
        else -> 0f
    }
    
   return result
}

fun calculate(n1:Float, n2:Float, operation:(Float, Float) -> Float):Float{
    val result = operation(n1, n2)
    return result
}
