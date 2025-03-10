fun main( args : Array<String>) {

    fun exercicio_um() {
        for (i in 0..40 step 5) {
            print("$i ")
        }
        println("Acabou!")
    }

    fun exercicio_dois() {
        for (i in 100 downTo 0 step 10) {
            print("$i ")
        }
        println("Acabou!")
    }

    fun exercicio_tres() {
        print("Digite um valor: ")
        val numero = readLine()!!.toInt()

        for (i in 1..10) {
            println("$numero x $i = ${numero * i}")
        }
    }

    fun exercicio_quatro() {
        print("Digite um valor: ")
        val numero = readLine()!!.toInt()

        print("Contagem: ")
        for (i in 0..numero) {
            print("$i, ")
        }
        println("FIM!")
    }

    fun exercicio_cinco() {
        var mulheres = 0
        var homensAcimaDe100Kg = 0
        var somaPesoMulheres = 0.0
        var maiorPesoHomem = 0.0

        for (i in 1..8) {
            print("Digite o sexo (M/F) da pessoa $i: ")
            val sexo = readLine()!!.toUpperCase()
            print("Digite o peso da pessoa $i: ")
            val peso = readLine()!!.toDouble()

            if (sexo == "F") {
                mulheres++
                somaPesoMulheres += peso
            } else if (sexo == "M" && peso > 100) {
                homensAcimaDe100Kg++
            }

            if (sexo == "M" && peso > maiorPesoHomem) {
                maiorPesoHomem = peso
            }
        }

        val mediaPesoMulheres = if (mulheres > 0) somaPesoMulheres / mulheres else 0.0

        println("Quantas mulheres foram cadastradas: $mulheres")
        println("Quantos homens pesam mais de 100kg: $homensAcimaDe100Kg")
        println("Média de peso entre as mulheres: $mediaPesoMulheres")
        println("Maior peso entre os homens: $maiorPesoHomem")
    }

}