Algoritmo "semnome"

Var
   c, n, contdiv: inteiro
Inicio
   c <- 1
   contdiv <- 0
   escreva("digite um numero: ")
   leia(n)
   repita
       se (n % c = 0) entao
          contdiv <- contdiv + 1
       fimse
       c <- c + 1
   ate (c > n)
   escreval( "resultado: ", contdiv)
   se (contdiv = 2) entao
       escreval("numero é primo")
   senao
       escreval("numero nao é primo")
   fimse
Fimalgoritmo