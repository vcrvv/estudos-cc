function inserir(num) {
    document.getElementById('visor').innerHTML += num;
}

function limpar() {
    document.getElementById('visor').innerHTML = '';
}

function apagar() {
    document.getElementById('visor').innerHTML = document.getElementById('visor').innerHTML.substring(0, document.getElementById('visor').innerHTML.length, -1);
}

function calcular() {
    var resultado = document.getElementById('visor').innerHTML;
    if(resultado) {
        document.getElementById('visor').innerHTML = eval(resultado);
    }
} 