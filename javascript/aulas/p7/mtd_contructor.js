//criando um objeto
function Usuario(nome, id, idade, profissao, email) {
    this.nome = nome;
    this.id = id;
    this.idade = idade;
    this.profissao = profissao;
    this.email = email;
}

const usuario1 = new Usuario('Bruce Wayne', 78945, 40, 
'Empresário', 'bruce@gotham.com');
const usuario2 = new Usuario('Diana Prince', 36985, 35, 
'Enfermeira', 'diana@temiscira.com');
const usuario3 = new Usuario('Peter Parker', 741233, 22, 
'Fotógrafo', 'parker@photo.com');
const usuario4 = new Usuario('Barry Allen', 56975, 24,
'Investigador Forense', 'barry@forense.com');

//exibindo os objetos
console.log(usuario1);
console.log(usuario2);
console.log(usuario3);
