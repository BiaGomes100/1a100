import kotlin.random.Random

fun main() {
    println("Escolha uma opção:")
    println("1. Cálculo do tempo de vida perdido pelo fumo")
    println("2. Tipo de triângulo")
    println("3. Jogo Pedra-Papel-Tesoura")
    println("4. Jogo de adivinhação (1 a 5)")
    println("5. Jogo de adivinhação (1 a 10, 4 tentativas)")
    println("6. Progressão Aritmética")
    println("7. Sequência de Fibonacci (10 termos)")
    println("8. Vetor de 20 números aleatórios")
    println("9. Função Fibonacci personalizada")
    print("Digite a opção desejada: ")
    when (readLine()?.toIntOrNull()) {
        1 -> calcularVidaPerdida()
        2 -> tipoTriangulo()
        3 -> jogoJokenpo()
        4 -> jogoAdivinhacao()
        5 -> jogoAdivinhacaoMelhorado()
        6 -> progressaoAritmetica()
        7 -> fibonacci10Termos()
        8 -> vetorOrdenado()
        9 -> fibonacciPersonalizado()
        else -> println("Opção inválida.")
    }
}

fun calcularVidaPerdida() {
    print("Quantos cigarros fuma por dia? ")
    val cigarrosPorDia = readLine()?.toIntOrNull() ?: return
    print("Quantos anos já fumou? ")
    val anosFumando = readLine()?.toIntOrNull() ?: return
    val minutosPerdidos = cigarrosPorDia * anosFumando * 365 * 10
    val diasPerdidos = minutosPerdidos / 1440
    println("Você perdeu aproximadamente $diasPerdidos dias de vida.")
}

fun tipoTriangulo() {
    print("Digite o primeiro lado: ")
    val a = readLine()?.toIntOrNull() ?: return
    print("Digite o segundo lado: ")
    val b = readLine()?.toIntOrNull() ?: return
    print("Digite o terceiro lado: ")
    val c = readLine()?.toIntOrNull() ?: return
    if (a == b && b == c) println("Triângulo Equilátero")
    else if (a == b || b == c || a == c) println("Triângulo Isósceles")
    else println("Triângulo Escaleno")
}

fun jogoJokenpo() {
    val opcoes = listOf("Pedra", "Papel", "Tesoura")
    print("Escolha (Pedra, Papel ou Tesoura): ")
    val escolha = readLine()?.capitalize() ?: return
    if (escolha !in opcoes) {
        println("Escolha inválida.")
        return
    }
    val computador = opcoes.random()
    println("Computador escolheu: $computador")
    if (escolha == computador) println("Empate!")
    else if ((escolha == "Pedra" && computador == "Tesoura") ||
        (escolha == "Papel" && computador == "Pedra") ||
        (escolha == "Tesoura" && computador == "Papel")) {
        println("Você venceu!")
    } else println("Você perdeu!")
}

fun jogoAdivinhacao() {
    val numeroSorteado = Random.nextInt(1, 6)
    print("Adivinhe um número entre 1 e 5: ")
    val palpite = readLine()?.toIntOrNull() ?: return
    if (palpite == numeroSorteado) println("Parabéns! Você acertou!")
    else println("Errou! O número era $numeroSorteado")
}

fun jogoAdivinhacaoMelhorado() {
    val numeroSorteado = Random.nextInt(1, 11)
    var tentativas = 4
    while (tentativas > 0) {
        print("Tente adivinhar o número entre 1 e 10: ")
        val palpite = readLine()?.toIntOrNull() ?: return
        if (palpite == numeroSorteado) {
            println("Parabéns! Você acertou!")
            return
        }
        tentativas--
        println("Errado! Restam $tentativas tentativas.")
    }
    println("O número era $numeroSorteado. Fim de jogo!")
}

fun progressaoAritmetica() {
    print("Digite o primeiro termo da PA: ")
    val primeiro = readLine()?.toIntOrNull() ?: return
    print("Digite a razão da PA: ")
    val razao = readLine()?.toIntOrNull() ?: return
    val pa = List(10) { primeiro + it * razao }
    println("Os 10 primeiros termos da PA: ${pa.joinToString()}")
    println("Soma: ${pa.sum()}")
}

fun fibonacci10Termos() {
    val fibonacci = mutableListOf(1, 1)
    for (i in 2 until 10) fibonacci.add(fibonacci[i - 1] + fibonacci[i - 2])
    println("Os 10 primeiros termos da sequência de Fibonacci: ${fibonacci.joinToString()}")
}

fun vetorOrdenado() {
    val vetor = List(20) { Random.nextInt(0, 100) }
    println("Números gerados: ${vetor.joinToString()}")
    println("Números ordenados: ${vetor.sorted().joinToString()}")
}

fun fibonacciPersonalizado() {
    print("Quantos termos deseja ver? ")
    val termos = readLine()?.toIntOrNull() ?: return
    val fibonacci = mutableListOf(1, 1)
    for (i in 2 until termos) fibonacci.add(fibonacci[i - 1] + fibonacci[i - 2])
    println("Sequência: ${fibonacci.joinToString(" >> ")} >> FIM")
}
