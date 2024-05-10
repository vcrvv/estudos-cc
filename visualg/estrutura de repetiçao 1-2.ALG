Algoritmo "semnome"

Var
   cont, a, s, m, n: inteiro

Inicio
      cont <- 1
      s <- 0
      enquanto (cont <= 5) faca
               escreva("digite o ", cont, "o. valor: ")
               leia(a)
               se (a > m) entao
                  m <- a
               fimse
               s <- s + a
               cont <- cont + 1
      fimenquanto
      escreval("a soma de todos os valores foi ", s)
      escreval("o maior valor digitado é: ", m)
Fimalgoritmo