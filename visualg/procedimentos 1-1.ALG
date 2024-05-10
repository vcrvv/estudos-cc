Algoritmo "semnome"
Var
   n: inteiro
procedimento ParOuImpar(v: inteiro)
inicio
   se (v%2 = 0) entao
      escreval("O Número ", v, " é par")
   senao
      escreval("O Número ", v, " é impar")
   fimse
fimprocedimento
Inicio
   escreva("digite um numero: ")
   leia(n)
   ParOuImpar(n)
Fimalgoritmo