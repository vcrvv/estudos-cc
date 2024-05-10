Algoritmo "semnome"

Var
   n, c, totn: inteiro
Inicio
   c <- 1
   totn <- 0
   repita
      escreva("digite um numero: ")
      leia(n)
      se (n<0) entao
         totn <- totn + 1
      fimse
      c <- c + 1
   ate (c > 5)
   escreva("foram digitados ", totn, " valores negativos ")
Fimalgoritmo