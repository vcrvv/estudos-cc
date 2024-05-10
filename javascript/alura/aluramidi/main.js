function TocaSom(seletorAudio) {
    const elemento = document.querySelector(seletorAudio);

    if (elemento && elemento.localName === 'audio') {
        elemento.play()
    }
    else {
        console.log('Elemento não encontrado ou seletor inválido')
    }
}

// document.querySelector('.tecla_pom').onclick = TocaSomPom
const ListaTeclas = document.querySelectorAll('.tecla');

for (let contador = 0; contador < ListaTeclas.length; contador++) {

    const tecla = ListaTeclas[contador];
    const instrumento = tecla.classList[1];
    const idAudio = `#som_${instrumento}`;//template string

    tecla.onclick = function () {
        TocaSom(idAudio);
    }

    tecla.onkeydown = function (evento) {

        if (evento.code == 'Space' || evento.coce == 'Enter') {
            tecla.classList.add('ativa');
        }
    }

    tecla.onkeyup = function () {
        tecla.classList.remove('ativa');
    }
}
