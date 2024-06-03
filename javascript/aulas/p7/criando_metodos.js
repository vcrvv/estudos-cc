function criarHeroi(nome, velocidade, agilidade, forca) {
    return {
        nome,
        velocidade,
        agilidade,
        forca,        
        falar: function () {
            console.log(`Olá eu sou o ${nome} – 
            velocidade: ${velocidade} - agilidade: 
            ${agilidade} - força: ${forca}`);
        }
    };
}
const heroi1 = criarHeroi("Superman", 98, 92, 99);
const heroi2 = criarHeroi("Batman", 86, 82, 88);
const heroi3 = criarHeroi("Hulk", 92, 98, 94);

//exibindo os objetos
heroi1.falar();
heroi2.falar();
heroi3.falar();