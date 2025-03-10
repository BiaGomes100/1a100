fun main( args : Array<String>){
    fun exercicio_um() {
        var contador = 0

        do {
            print("$contador ")
            contador += 3
        } while (contador <= 30)

        println("Acabou!")
    }

    fun exercicio_dois() {
        var totalIdades = 0
        var contador = 0
        var pessoasCom21OuMais = 0
        var continuar: String

        do {
            print("Digite a idade: ")
            val idade = readLine()!!.toInt()

            totalIdades += idade
            contador++

            if (idade >= 21) pessoasCom21OuMais++

            print("Deseja continuar? (S/N): ")
            continuar = readLine()!!.toUpperCase()

        } while (continuar == "S")

        val mediaIdades = if (contador > 0) totalIdades / contador else 0

        println("Quantas idades foram digitadas: $contador")
        println("Média das idades: $mediaIdades")
        println("Quantas pessoas têm 21 anos ou mais: $pessoasCom21OuMais")
    }

    fun exercicio_tres() {
        var soma = 0
        var menorValor = Int.MAX_VALUE
        var total = 0
        var numerosPares = 0
        var continuar: String

        do {
            print("Digite um número: ")
            val numero = readLine()!!.toInt()

            soma += numero
            if (numero < menorValor) menorValor = numero
            total++

            if (numero % 2 == 0) numerosPares++

            print("Deseja continuar? (S/N): ")
            continuar = readLine()!!.toUpperCase()

        } while (continuar == "S")

        val media = if (total > 0) soma / total else 0

        println("Somatório de todos os valores: $soma")
        println("Menor valor digitado: $menorValor")
        println("Média dos valores: $media")
        println("Quantos valores são pares: $numerosPares")
    }

}