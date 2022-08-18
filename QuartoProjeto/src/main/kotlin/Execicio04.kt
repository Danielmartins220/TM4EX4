
fun main(){

    var pessoasC = 0
    var mulheresN = 0
    var homensAgr = 0
    var outrosC = 0
    var pNMaior40 = 0
    var pCMenor18 = 0
    var idade = 0
    var sexo = 0
    var opc = 0
    var cont = 0

    while (cont < 5){

        println("Pessoa: ${cont+1}\n")

        print("Digite a sua idade: ")
        idade = readln().toInt()

        print("Digite o seu sexo (1-feminino / 2-masculino / 3-Outros): ")
        sexo = readln().toInt()

        print("Digite a opções (1, se a pessoa era calma; 2, se a pessoa era " +
                "nervosa e 3, se a pessoa era agressiva): ")
        opc = readln().toInt()

        if(opc == 1){
            pessoasC++
        }

        if(sexo == 1 && opc == 2){
            mulheresN++
        }

        if(sexo == 2 && opc == 3){
            homensAgr++
        }

        if(sexo == 3 && opc == 1){
            outrosC++
        }

        if(idade > 40 && opc == 2){
            pNMaior40++
        }

        if(idade < 18 && opc == 1){
            pCMenor18++
        }

        cont++

    }

    println("o número de pessoas calmas: $pessoasC")
    println("o número de mulheres nervosas: $mulheresN")
    println("o número de homens agressivos: $homensAgr")
    println("o número de outros calmos: $outrosC")
    println("o número de pessoas nervosas com mais de 40 anos: $pNMaior40")
    println("o número de pessoas calmas com menos de 18 anos: $pCMenor18")

}
