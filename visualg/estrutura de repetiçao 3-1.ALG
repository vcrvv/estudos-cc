Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 05/03/2024
Var
// Seção de Declarações das variáveis 
   c, v, tot, simp: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   tot <- 0
   simp <- 1
   para c <- 1 ate 6 faca
        escreva("digite um valor: ")
        leia(v)
        se (v>=0) e (v<=10) entao
           tot <- tot + 1
           se (v%2=1) entao
              simp <- simp + v
           fimse
        fimse
   fimpara
   escreval("ao todo foram ", tot, " valores entre 0 e 10")
   escreval("a soma dos impares foi ", simp)

Fimalgoritmo