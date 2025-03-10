fun main(args: Array<String>) {

    fun exercicio_um() {
        println("Hellooooo World!")
    }

    fun exercicio_dois(){
        println("Digite seu nome: ")
        val nome = readLine()
        println("Olá $nome, é um prazer te conhecer!")
    }

    fun exercicio_tres(){
        println("Digite o nome do funcionario: ")
        val nome = readLine()
        println("Digite o valor do salario: ")
        var salario = readLine()
        println("O funcionário $nome do Carmo tem um salário de R\$ $salario em Março.")

    }

    fun exercicio_quatro(){
        var numero1 : Int
        var numero2 : Int

        while (true) {
            println("Digite o primeiro número para somar: ")
            val entrada1 = readLine()?.trim()?.takeIf { it.isNotEmpty() } //é necessario o takeIf.. para tranformar o valor de entrada vazio para nulo, sem ele o programa da erro>NullPointerException

            println("Digite o segundo número para somar: ")
            val entrada2 = readLine()?.trim()?.takeIf { it.isNotEmpty() }

            val num1 = entrada1?.toIntOrNull()
            val num2 = entrada2?.toIntOrNull()

            if (num1 != null && num2 != null) {
                numero1 = num1
                numero2 = num2
                break
            } else {
                println("Entrada inválida! Digite números inteiros válidos.")
            }
        }

        var soma = numero1!! + numero2!!
        return println("O resultado é: $soma")
    }

    fun exercicio_cinco(){
        var nota1 : Double
        var nota2 : Double

        while (true) {
            println("Digite a primeira nota: ")
            val entrada1 = readLine()?.trim()?.takeIf { it.isNotEmpty() } //é necessario o takeIf.. para tranformar o valor de entrada vazio para nulo, sem ele o programa da erro>NullPointerException

            println("Digite a segunda nota: ")
            val entrada2 = readLine()?.trim()?.takeIf { it.isNotEmpty() }

            val num1 = entrada1?.toDoubleOrNull()
            val num2 = entrada2?.toDoubleOrNull()

            if (num1 != null && num2 != null) {
                nota1 = num1
                nota2 = num2
                break
            } else {
                println("Entrada inválida! Digite números décimais válidos.")
            }
        }

        var media = (nota1 + nota2)/2
        return println("A media é: $media")
    }

    fun exercicio_seis(){
        var valor : Int

        while(true) {
            println("Digite o valor que gostaria de saber o sucessor e o antecessor: ")
            var entrada = readLine()?.trim()?.takeIf { it.isNotEmpty() }

            var num = entrada?.toIntOrNull()

            if (num != null){
                valor = num
                break
            }
            else{
                println("Entrada inválida! Digite um número inteiro. ")
            }
        }

        var antecessor = valor - 1
        var sucessor = valor + 1

        println("O antecessor: $antecessor, O sucessor: $sucessor")
    }

    fun exercicio_sete(){
        var valor : Double

        while (true){
            println("Digite o valor que deseja saber o dobro e a terça parte: ")
            var entrada = readLine()?.trim()?.takeIf { it.isNotEmpty() }
            var num = entrada?.toDoubleOrNull()

            if (num != null){
                valor = num
                break
            }
            else
                println("Entrada inválida! Digite um valor.")
        }

        var dobro = valor + valor
        var tercaParte = valor/3

        println("O dobro: $dobro, A terça parte: $tercaParte")
    }

    fun exercicio_oito(){
        print("Digite uma distância em metros: ")
        val metros = readLine()?.toDoubleOrNull()

        if (metros != null) {
            println("A distância de $metros m corresponde a:")
            println("${metros / 1000} Km")   // quilômetros
            println("${metros / 100} Hm")    // hectômetros
            println("${metros / 10} Dam")    // decâmetros
            println("${metros * 10} dm")     // decímetros
            println("${metros * 100} cm")    // centímetros
            println("${metros * 1000} mm")   // milímetros
        } else {
            println("Entrada inválida! Digite um número válido.")
        }
    }

    fun exercicio_nove(){
        var carteira : Double

        println("Digite o quanto tem na carteira para calcularmos o dólar: ")
        var entrada = readLine()?.trim()?.takeIf { it.isNotEmpty() }
        var num = entrada?.toDoubleOrNull()

        if ( num != null ){
            carteira = num
            var emDolar = carteira/3.45
            println("R$ $carteira em dólar é US$ %.2f".format( emDolar))
        }
        else{
            println("Entrada Inválida, tente novamente.")
        }

    }

    fun exercicio_dez() {
        print("Digite a largura da parede (m): ")
        val largura = readLine()!!.toDouble()

        print("Digite a altura da parede (m): ")
        val altura = readLine()!!.toDouble()

        val area = largura * altura
        val tinta = area / 2

        println("Área da parede: $area m²")
        println("Quantidade de tinta necessária: $tinta litros")
    }

    fun exercicio_onze(){
        print("Digite o valor de A: ")
        val a = readLine()!!.toDouble()

        print("Digite o valor de B: ")
        val b = readLine()!!.toDouble()

        print("Digite o valor de C: ")
        val c = readLine()!!.toDouble()

        val delta = (b * b) - (4 * a * c)

        println("O valor de Delta é: $delta")
    }

    fun exercicio_doze(){
        print("Digite o preço do produto: R$ ")
        val preco = readLine()!!.toDouble()

        val desconto = preco * 0.05
        val precoPromocional = preco - desconto

        println("O preço com 5% de desconto é: R$ %.2f".format(precoPromocional))
    }

    fun exercicio_treze(){
        print("Digite o salário atual: R$ ")
        val salario = readLine()!!.toDouble()

        val aumento = salario * 0.15
        val novoSalario = salario + aumento

        println("O novo salário com 15% de aumento é: R$ %.2f".format(novoSalario))
    }

    fun exercicio_quatorze(){
        print("Quantos Km foram percorridos? ")
        val km = readLine()!!.toDouble()

        print("Quantos dias o carro foi alugado? ")
        val dias = readLine()!!.toInt()

        val precoTotal = (dias * 90) + (km * 0.20)

        println("O total a pagar é: R$ %.2f".format(precoTotal))
    }

    fun exercicio_quinze(){
        print("Digite o número de dias trabalhados: ")
        val dias = readLine()!!.toInt()

        val horasPorDia = 8
        val valorPorHora = 25.0
        val salario = dias * horasPorDia * valorPorHora

        println("O salário do funcionário é: R$ %.2f".format(salario))
    }


}