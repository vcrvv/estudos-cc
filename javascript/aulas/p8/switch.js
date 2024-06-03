const codigo = Math.ceil(Math.random() * 5);
let produto;
switch (codigo) {
    case 1:
        produto = 'Notebook';
        break;
    case 2:
        produto = 'Tablet';
        break;
    case 3:
        produto = 'Videogame';
        break;
    case 4:
        produto = 'Smartphone';
        break;
    default:
    produto ='Drone';
} 
console.log(`Código do produto: ${codigo}`);
console.log(`Tipo do produto: ${produto}`);

