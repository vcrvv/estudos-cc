const data = new Date();
const mes = data.getMonth() + 1;

const semestre = (mes <= 6 ? 'primeiro semestre' : 'segundo semestre');

console.log(`Estamos no mes ${mes}`);
console.log(`Estamos no ${semestre} do ano de ${data.getFullYear()}`);
