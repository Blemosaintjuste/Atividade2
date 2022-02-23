fun main(args: Array<String>) {
   atividade3()


}

fun atividade(): Unit{
    println("Digite a primeira nota:")
    val nota1 = readLine()!!.toFloat()

    println("Digite a segunda nota:")
    val nota2 = readLine()!!.toFloat()

    val media = (nota1 + nota2) / 2
    println("A Media é: $media")

    if (media >= 9)
        println("Aprovado com Distinção!!!")
    else if(media >= 6)
        println("o Aluno foi aprovado!!!")

    else if(media >= 4)
        println("o Aluno está em  recuperação")

    else
        print("o aluno está reprovado!!!")


}

fun atividade2(): Unit{
    println("Digite o seu gênero com qual se identifica: \nM - Masculino\nF -Feminino\no - Outros")
    val genero = readLine()!!

    if (genero.equals("M", true))
        println("Bem-vindo senhor ...")
    else if (genero.equals("F",true))
        println("Bem-vinda sesnhora ...")
    else if (genero.equals("O",true))
            println("Bem-vindo ...")
    else
        println("Genero inválido!!!")

}

fun atividade3(): Unit{
    println("Digite o primeiro número:")
    val num1= readLine()!!.toFloat()
    println("Digite o segundo número:")
    val num2 = readLine()!!.toFloat()

    println("Escolha uma operação:\n1- Soma\n2- Substração\n3- Multiplicação\n4- Divisão")

    when(readLine()!!.toInt()){
        1-> println("A soma é ${num1+num2}")
        2-> println("A substração é ${num1-num2}")
        3-> println("A multiplicação é ${num1*num2}")
        4-> println("A divisão é ${num1/num2}")

    }


}
