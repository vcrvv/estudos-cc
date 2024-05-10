Algoritmo "semnome"

Var
    c, n, f: inteiro
    r: caractere

Inicio
repita
    escreva("digite um numero: ")
    leia(n)
    c <- n
    f <- 1
    repita
          f <- f * c
          c <- c - 1
    ate (c < 2)
    escreval("o valor de fatorial de", n, " é igual a", f)
    escreval("quer continuar? [S/N]")
    leia(r)
    limpatela
ate( r = "N")
Fimalgoritmo