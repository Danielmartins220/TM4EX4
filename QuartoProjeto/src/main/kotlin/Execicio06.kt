fun main (){

    var soma = 0
    var cont = 0

    do {
        println(" Digite um numero: ")
        var n = readln().toInt()

        if(n % 3 == 0 && n != 0)
            soma+=n
        cont++

    } while (n != 0)
    var m = soma / cont
    println(" media dos numeros e: $m")
}