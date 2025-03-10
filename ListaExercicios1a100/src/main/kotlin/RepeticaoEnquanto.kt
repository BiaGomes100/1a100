fun main(args: Array<String>) {

    fun exercicio_um() {
        var num = 6
        while (num <= 11) {
            print("$num ")
            num++
        }
        println("Acabou!")
    }

    fun exercicio_dois() {
        for (num in 10 downTo 3) {
            print("$num ")
        }
        println("Acabou!")
    }

    fun exercicio_tres() {
        for (num in 0..18 step 3) {
            print("$num ")
        }
        println("Acabou!")
    }

    fun exercicio_quatro() {
        var num = 100
        while (num >= 0) {
            print("$num ")
            num -= 5
        }
        println("Acabou!")
    }

    fun exercicio_cinco() {
        print("Digite um valor: ")
        val max = readLine()!!.toInt()
        for (num in 1..max) {
            print("$num ")
        }
        println("Acabou!")
    }

    fun exercicio_seis() {
        for (num in 30 downTo 1) {
            if (num % 4 == 0) print("[$num] ") else print("$num ")
        }
        println("Acabou!")
    }

    fun exercicio_sete() {
        print("Digite o primeiro valor: ")
        val inicio = readLine()!!.toInt()
        print("Digite o último valor: ")
        val fim = readLine()!!.toInt()
        print("Digite o incremento: ")
        val incremento = readLine()!!.toInt().coerceAtLeast(1)

        if (inicio < fim) {
            for (num in inicio..fim step incremento) print("$num ")
        } else {
            for (num in inicio downTo fim step incremento) print("$num ")
        }
        println("Acabou!")
    }

    fun exercicio_oito() {
        var soma = 0
        for (num in 6..100 step 2) {
            soma += num
        }
        println("Soma: $soma")
    }

    fun exercicio_nove() {
        var soma = 0
        for (num in 500 downTo 0 step 50) {
            soma += num
        }
        println("Soma: $soma")
    }

    fun exercicio_dez() {
        var soma = 0
        for (i in 1..7) {
            print("Digite um número: ")
            soma += readLine()!!.toInt()
        }
        println("Soma total: $soma")
    }

    fun exercicio_onze() {
        var pares = 0
        var impares = 0
        for (i in 1..6) {
            print("Digite um número: ")
            val num = readLine()!!.toInt()
            if (num % 2 == 0) pares++ else impares++
        }
        println("Pares: $pares | Ímpares: $impares")
    }

    fun exercicio_doze() {
        val numeros = List(20) { (0..10).random() }
        println("Números sorteados: $numeros")
        println("Acima de 5: ${numeros.count { it > 5 }}")
        println("Divisíveis por 3: ${numeros.count { it % 3 == 0 }}")
    }

    fun exercicio_treze() {
        var maior = Double.MIN_VALUE
        var menor = Double.MAX_VALUE
        for (i in 1..8) {
            print("Digite o preço do produto: ")
            val preco = readLine()!!.toDouble()
            if (preco > maior) maior = preco
            if (preco < menor) menor = preco
        }
        println("Maior preço: $maior | Menor preço: $menor")
    }

    fun exercicio_quatorze() {
        var somaIdade = 0
        var mais18 = 0
        var menos5 = 0
        var maiorIdade = 0
        for (i in 1..10) {
            print("Digite a idade: ")
            val idade = readLine()!!.toInt()
            somaIdade += idade
            if (idade > 18) mais18++
            if (idade < 5) menos5++
            if (idade > maiorIdade) maiorIdade = idade
        }
        println("Média: ${somaIdade / 10.0}, >18: $mais18, <5: $menos5, Maior idade: $maiorIdade")
    }

    fun exercicio_quinze() {
        var homens = 0
        var mulheres = 0
        var somaIdade = 0
        var somaIdadeHomens = 0
        var mulheres20 = 0
        for (i in 1..5) {
            print("Digite a idade: ")
            val idade = readLine()!!.toInt()
            print("Digite o sexo (M/F): ")
            val sexo = readLine()!!
            somaIdade += idade
            if (sexo.uppercase() == "M") {
                homens++
                somaIdadeHomens += idade
            } else {
                mulheres++
                if (idade > 20) mulheres20++
            }
        }
        println("Homens: $homens, Mulheres: $mulheres, Média idade grupo: ${somaIdade / 5.0}, Média idade homens: ${if (homens > 0) somaIdadeHomens / homens.toDouble() else 0.0}, Mulheres > 20: $mulheres20")
    }

    fun exercicio_dezesseis() {
        var somaAltura = 0.0
        var acima90 = 0
        var menos50menos160 = 0
        var mais190mais100 = 0
        for (i in 1..7) {
            print("Digite o peso: ")
            val peso = readLine()!!.toDouble()
            print("Digite a altura: ")
            val altura = readLine()!!.toDouble()
            somaAltura += altura
            if (peso > 90) acima90++
            if (peso < 50 && altura < 1.60) menos50menos160++
            if (altura > 1.90 && peso > 100) mais190mais100++
        }
        println("Média altura: ${somaAltura / 7}, >90Kg: $acima90, <50Kg e <1.60m: $menos50menos160, >1.90m e >100Kg: $mais190mais100")
    }
}

