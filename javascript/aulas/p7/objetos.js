let pessoa ={
    nome: 'Vinicius',
    idade: 21,
    altura: 177
}

//ponto
pessoa.idade = '100'

//colchete
let selecao = 'nome'
pessoa[selecao] = 'vini'

console.log(pessoa.idade)
console.log(pessoa)