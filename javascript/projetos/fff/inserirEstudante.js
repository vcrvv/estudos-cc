//recuperando o tbody, ele receberá o novo Estudante
const tbody = document.querySelector('#estudantes');
// adicionando o escutador para evento submit
document.querySelector('form').addEventListener('submit', function(e) {
    
    //cancelando o evento submit
    e.preventDefault();   
    //agora ele irá executar o bloco da função
    //recuperando os campos do formulário - Teremos um Nodelist 
    const formEstudante = document.querySelectorAll('input');
    //declarando um novo objeto ele rececerá o Nodelist
    const novoEstudante = {};
    
    //passando os valores do formulário para o objeto
    //será usado o atributo name dos campos para nome das propriedades
    formEstudante.forEach((campo) => {
        novoEstudante[campo.name] = campo.value;
    });
    // será adicionada a propriedade XP, ela chamara a função CalcularXP()
    novoEstudante.media = calcularMedia(novoEstudante.nota1, novoEstudante.nota2, 
                        novoEstudante.nota3).toFixed(1);
    
    // criando a tr 
    const tr = document.createElement('tr');
    //atribuindo duas classes CSS para as linhas criadas
    tr.classList.add('bg-secondary', 'text-light');
    //percorrendo o objeto para escrever na tela
    for(let dado in novoEstudante) {
        // criando a td
        const td = document.createElement('td');
        
        //colocando o conteúdo na td 
        td.textContent = novoEstudante[dado];
        //colocando a td na tr
        tr.appendChild(td);
    }
    //colocando a tr no tbody
    tbody.appendChild(tr);
    //limpando o form
    this.reset(); 
})
