fun main(args: Array<String>) {

    fun exercicio_um() {
        print("Digite o primeiro número inteiro: ")
        val num1 = readLine()!!.toInt()
        print("Digite o segundo número inteiro: ")
        val num2 = readLine()!!.toInt()

        when {
            num1 > num2 -> println("O primeiro valor é o maior")
            num2 > num1 -> println("O segundo valor é o maior")
            else -> println("Não existe valor maior, os dois são iguais")
        }
    }

    fun exercicio_dois() {
        print("Digite a primeira nota: ")
        val nota1 = readLine()!!.toDouble()
        print("Digite a segunda nota: ")
        val nota2 = readLine()!!.toDouble()
        val media = (nota1 + nota2) / 2

        println("Média: %.2f".format(media))
        when {
            media < 5 -> println("REPROVADO")
            media in 5.0..6.9 -> println("RECUPERAÇÃO")
            else -> println("APROVADO")
        }
    }

    fun exercicio_tres() {
        print("Digite a largura do terreno (m): ")
        val largura = readLine()!!.toDouble()
        print("Digite o comprimento do terreno (m): ")
        val comprimento = readLine()!!.toDouble()
        val area = largura * comprimento

        println("Área do terreno: $area m²")
        when {
            area < 100 -> println("TERRENO POPULAR")
            area in 100.0..500.0 -> println("TERRENO MASTER")
            else -> println("TERRENO VIP")
        }
    }

    fun exercicio_quatro() {
        print("Digite o nome do funcionário: ")
        val nome = readLine()!!
        print("Digite o salário atual: ")
        val salario = readLine()!!.toDouble()
        print("Digite os anos trabalhados: ")
        val anos = readLine()!!.toInt()

        val novoSalario = when {
            anos < 3 -> salario * 1.03
            anos in 3..9 -> salario * 1.125
            else -> salario * 1.2
        }

        println("$nome, seu novo salário é: R$ %.2f".format(novoSalario))
    }

    fun exercicio_cinco() {
        print("Digite o valor da casa: ")
        val valorCasa = readLine()!!.toDouble()
        print("Digite o salário do comprador: ")
        val salario = readLine()!!.toDouble()
        print("Digite em quantos anos será pago: ")
        val anos = readLine()!!.toInt()

        val prestacao = valorCasa / (anos * 12)

        if (prestacao > salario * 0.3) {
            println("Empréstimo NEGADO. Parcela de R$ %.2f excede 30%% do salário.".format(prestacao))
        } else {
            println("Empréstimo APROVADO. Parcela mensal: R$ %.2f".format(prestacao))
        }
    }

    fun exercicio_seis() {
        print("Digite seu peso (kg): ")
        val peso = readLine()!!.toDouble()
        print("Digite sua altura (m): ")
        val altura = readLine()!!.toDouble()

        val imc = peso / (altura * altura)

        println("Seu IMC é %.2f".format(imc))
        when {
            imc < 18.5 -> println("Abaixo do peso")
            imc in 18.5..24.9 -> println("Peso ideal")
            imc in 25.0..29.9 -> println("Sobrepeso")
            imc in 30.0..39.9 -> println("Obesidade")
            else -> println("Obesidade mórbida")
        }
    }

    fun exercicio_sete() {
        print("Digite o tipo de carro (popular/luxo): ")
        val tipo = readLine()!!.lowercase()
        print("Digite a quantidade de dias alugados: ")
        val dias = readLine()!!.toInt()
        print("Digite a quantidade de Km rodados: ")
        val km = readLine()!!.toDouble()

        val precoDia = if (tipo == "popular") 90 else 150
        val precoKm = when {
            tipo == "popular" && km <= 100 -> 0.20
            tipo == "popular" -> 0.10
            tipo == "luxo" && km <= 200 -> 0.30
            else -> 0.25
        }

        val precoFinal = (dias * precoDia) + (km * precoKm)
        println("O valor total a pagar é R$ %.2f".format(precoFinal))
    }

    fun exercicio_oito() {
        print("Digite as horas de atividade no mês: ")
        val horas = readLine()!!.toInt()

        val pontos = when {
            horas <= 10 -> horas * 2
            horas <= 20 -> horas * 5
            else -> horas * 10
        }

        val dinheiro = pontos * 0.05
        println("Você ganhou $pontos pontos e R$ %.2f".format(dinheiro))
    }

    fun exercicio_nove() {
        print("Digite o salário atual: ")
        val salario = readLine()!!.toDouble()
        print("Digite o gênero do funcionário (M/F): ")
        val genero = readLine()!!.uppercase()
        print("Digite os anos de empresa: ")
        val anos = readLine()!!.toInt()

        val aumento = when {
            genero == "F" && anos < 15 -> 0.05
            genero == "F" && anos in 15..20 -> 0.12
            genero == "F" -> 0.23
            genero == "M" && anos < 20 -> 0.03
            genero == "M" && anos in 20..30 -> 0.13
            else -> 0.25
        }

        val novoSalario = salario * (1 + aumento)
        println("O novo salário é R$ %.2f".format(novoSalario))
    }

}