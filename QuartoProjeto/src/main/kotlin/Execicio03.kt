fun main () {

    var contMenos = 0
    var contMais = 0

    while (true) {
        print("Digite a sua idade: ")
        var idade = readln().toInt()

        if (idade in 1..21) {
            contMenos++
        } else if (idade > 50) {
            contMais++
        }
        if (idade == -99) {
            break
        }

    }

    println("Idades <21: $contMenos")
    println("Idades >50: $contMais")
}