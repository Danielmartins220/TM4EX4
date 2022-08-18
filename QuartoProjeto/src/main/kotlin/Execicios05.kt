fun main (){

    var soma = 0
    var cont = 0

    do{
        println(" Digite um número: ")
        var n = readln().toInt()
        if (n != 0)
            cont++
        soma+=n

    } while (n > 0)
    println(" soma dos numeros digitados é: $soma")



}