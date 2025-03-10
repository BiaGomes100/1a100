fun main(args: Array<String>) {
    fun exercicio_um() {
        var soma = 0
        var numero: Int

        while (true) {
            print("Digite um número (1111 para parar): ")
            numero = readLine()!!.toInt()
            if (numero == 1111) break
            soma += numero
        }
        println("A soma dos números é: $soma")
    }

    fun exercicio_dois() {
        var totalHomens = 0.0
        var totalMulheres = 0.0
        var contadorHomens = 0
        var contadorMulheres = 0
        var continuar: String

        while (true) {
            print("Digite o salário: ")
            val salario = readLine()!!.toDouble()
            print("Digite o sexo (M/F): ")
            val sexo = readLine()!!.toUpperCase()

            if (sexo == "M") {
                totalHomens += salario
                contadorHomens++
            } else if (sexo == "F") {
                totalMulheres += salario
                contadorMulheres++
            }

            print("Deseja continuar? (S/N): ")
            continuar = readLine()!!.toUpperCase()
            if (continuar != "S") break
        }

        println("Total de salários pagos aos homens: $totalHomens")
        println("Total de salários pagos às mulheres: $totalMulheres")
    }

    fun exercicio_tres() {
        var idade: Int
        var contador = 0
        var somaIdade = 0

        while (true) {
            print("Digite a idade do aluno (999 para parar): ")
            idade = readLine()!!.toInt()
            if (idade == 999) break
            somaIdade += idade
            contador++
        }

        val mediaIdade = if (contador > 0) somaIdade / contador else 0
        println("Número de alunos: $contador")
        println("Média de idade dos alunos: $mediaIdade")
    }

    fun exercicio_quatro() {
        var maiorIdade = 0
        var homens = 0
        var idadeMulherMaisJovem = Int.MAX_VALUE
        var somaIdadeHomens = 0
        var contadorHomens = 0
        var continuar: String

        while (true) {
            print("Digite o sexo (M/F): ")
            val sexo = readLine()!!.toUpperCase()
            print("Digite a idade: ")
            val idade = readLine()!!.toInt()

            if (idade > maiorIdade) maiorIdade = idade

            if (sexo == "M") {
                homens++
                somaIdadeHomens += idade
                contadorHomens++
            } else if (sexo == "F") {
                if (idade < idadeMulherMaisJovem) idadeMulherMaisJovem = idade
            }

            print("Deseja continuar? (S/N): ")
            continuar = readLine()!!.toUpperCase()
            if (continuar != "S") break
        }

        val mediaIdadeHomens = if (contadorHomens > 0) somaIdadeHomens / contadorHomens else 0

        println("Maior idade: $maiorIdade")
        println("Quantidade de homens cadastrados: $homens")
        println("Idade da mulher mais jovem: $idadeMulherMaisJovem")
        println("Média de idade entre os homens: $mediaIdadeHomens")
    }

    fun exercicio_cinco() {
        var nomeMaisVelho = ""
        var nomeMulherMaisJovem = ""
        var maiorIdade = 0
        var idadeMulherMaisJovem = Int.MAX_VALUE
        var somaIdades = 0
        var homensComMaisDe30 = 0
        var mulheresComMenosDe18 = 0
        var contador = 0
        var continuar: String

        while (true) {
            print("Digite o nome: ")
            val nome = readLine()!!
            print("Digite a idade: ")
            val idade = readLine()!!.toInt()
            print("Digite o sexo (M/F): ")
            val sexo = readLine()!!.toUpperCase()

            somaIdades += idade
            contador++

            if (idade > maiorIdade) {
                maiorIdade = idade
                nomeMaisVelho = nome
            }

            if (sexo == "M" && idade > 30) homensComMaisDe30++
            if (sexo == "F" && idade < 18) mulheresComMenosDe18++

            if (sexo == "F" && idade < idadeMulherMaisJovem) {
                idadeMulherMaisJovem = idade
                nomeMulherMaisJovem = nome
            }

            print("Deseja continuar? (S/N): ")
            continuar = readLine()!!.toUpperCase()
            if (continuar != "S") break
        }

        val mediaIdade = if (contador > 0) somaIdades / contador else 0

        println("Nome da pessoa mais velha: $nomeMaisVelho")
        println("Nome da mulher mais jovem: $nomeMulherMaisJovem")
        println("Média de idade do grupo: $mediaIdade")
        println("Homens com mais de 30 anos: $homensComMaisDe30")
        println("Mulheres com menos de 18 anos: $mulheresComMenosDe18")
    }

}