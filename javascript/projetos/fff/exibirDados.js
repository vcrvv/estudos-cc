function exibirNota() {
    //recuperando os elementos que têm a classe estudante
    const estudantes = document.querySelectorAll('.estudante');
    // usando um for para percorrer o array - usaremos o forEach()
    estudantes.forEach(estudante => {
        //recuperando o valor da força e convertendo em um número
        const nota1 = estudante.querySelector('.nota1').textContent;
        //recuperando o valor da agilidade e convertendo em um número
        const nota2 = estudante.querySelector('.nota2').textContent;
        //recuperando o valor da velocidade e convertendo em um número
        const nota3 = estudante.querySelector('.nota3').textContent;
        //calculando os xp de cada estudante
        const resultadoMedia = calcularMedia(nota1, nota2, nota3);
        //Exibindo na página o xp correspondente
        estudante.querySelector('.nota-Final').textContent = resultadoMedia.toFixed(1);
    })
}
//chamando as funções
formataData();
exibirNota();