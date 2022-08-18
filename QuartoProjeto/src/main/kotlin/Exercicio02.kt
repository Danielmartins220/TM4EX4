fun main(){

var conPar = 0
var conImpar = 0

for(i in 1 .. 10){
    print(" Digite um número ")
    val n = readln().toInt()

    if (n % 2 == 0){
        conPar ++
        println(" número $n par")
    }
    else{
        conImpar ++
        println(" número $n ímpar")
    }
}

println("Pares: $conPar")

println("Ímpares: $conImpar")
}