fun main(args: Array<String>) {

    fun exercicio_um() {
        print("Digite a velocidade do carro (Km/h): ")
        val velocidade = readLine()!!.toInt()

        if (velocidade > 80) {
            val multa = (velocidade - 80) * 5
            println("Você foi multado! O valor da multa é: R$ $multa")
        } else {
            println("Velocidade dentro do limite permitido.")
        }
    }

    fun exercicio_dois() {
        print("Digite o ano de nascimento: ")
        val anoNascimento = readLine()!!.toInt()

        val idade = 2024 - anoNascimento

        if (idade >= 16) {
            println("Você pode votar!")
        } else {
            println("Você ainda não pode votar.")
        }
    }

    fun exercicio_tres() {
        print("Digite o nome do aluno: ")
        val nome = readLine()!!

        print("Digite a primeira nota: ")
        val nota1 = readLine()!!.toDouble()

        print("Digite a segunda nota: ")
        val nota2 = readLine()!!.toDouble()

        val media = (nota1 + nota2) / 2

        println("$nome, sua média é: %.2f".format(media))
        if (media >= 7.0) {
            println("Parabéns! Você teve um bom aproveitamento.")
        } else {
            println("Estude mais! Você precisa melhorar.")
        }
    }

    fun exercicio_quatro() {
        print("Digite um número inteiro: ")
        val numero = readLine()!!.toInt()

        if (numero % 2 == 0) {
            println("O número $numero é PAR.")
        } else {
            println("O número $numero é ÍMPAR.")
        }
    }

    fun exercicio_cinco() {
        print("Digite um ano: ")
        val ano = readLine()!!.toInt()

        val bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)

        if (bissexto) {
            println("O ano $ano é BISSEXTO.")
        } else {
            println("O ano $ano NÃO é bissexto.")
        }
    }

    fun exercicio_seis() {
        print("Digite o ano de nascimento: ")
        val anoNascimento = readLine()!!.toInt()

        val idade = 2024 - anoNascimento
        val diferenca = 18 - idade

        when {
            idade < 18 -> println("Faltam $diferenca anos para o alistamento.")
            idade > 18 -> println("Já se passaram ${-diferenca} anos do alistamento.")
            else -> println("Você deve se alistar este ano!")
        }
    }

    fun exercicio_sete() {
        print("Digite seu nome: ")
        val nome = readLine()!!

        print("Digite seu sexo (M/F): ")
        val sexo = readLine()!!.uppercase()

        print("Digite o valor das compras: R$ ")
        val valorCompras = readLine()!!.toDouble()

        val desconto = if (sexo == "F") valorCompras * 0.13 else valorCompras * 0.05
        val precoFinal = valorCompras - desconto

        println("$nome, o valor final da compra é: R$ %.2f".format(precoFinal))
    }

    fun exercicio_oito() {
        print("Digite a distância da viagem (Km): ")
        val distancia = readLine()!!.toDouble()

        val preco = if (distancia <= 200) distancia * 0.50 else distancia * 0.45

        println("O preço da passagem é: R$ %.2f".format(preco))
    }

    fun exercicio_nove() {
        print("Digite o comprimento do primeiro lado: ")
        val lado1 = readLine()!!.toDouble()

        print("Digite o comprimento do segundo lado: ")
        val lado2 = readLine()!!.toDouble()

        print("Digite o comprimento do terceiro lado: ")
        val lado3 = readLine()!!.toDouble()

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            println("Os segmentos podem formar um triângulo.")
        } else {
            println("Os segmentos NÃO podem formar um triângulo.")
        }
    }

}