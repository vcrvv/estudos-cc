let quantidadedechute = 0

function verificaSeOChutePossuiUmValorValido(chute) {
    const numero = +chute
    quantidadedechute += 1

    if (chuteForInvalido(numero)) {
        elementoChute.innerHTML += '<div>Número Inválido.</div>'
        return
    }

    if (numeroForMaiorOuMenorQueOValorPermitido(numero)) {
        elementoChute.innerHTML +=`<div>Fale um número entre ${menorValor} e ${maiorValor}</div>`
        return
    }

    if (numero === numeroSecreto) {
        document.body.innerHTML = `
            <h2>Voce Acertou!!!</h2>
            <h3>O Número secreto era ${numeroSecreto}</h3>

            <h4>Voce precisou de ${quantidadedechute} tentativas</h2>

            <button id="jogar-novamente" class="btn-jogar">Jogar Novamente</button>
        `
    } else if (numero > numeroSecreto) {
        elementoChute.innerHTML += `
        <div>O número secreto é menor <i class="fa-solid fa-angle-down"></i></div> 
        `
    } else {
        elementoChute.innerHTML += `
        <div>O número secreto é maior <i class="fa-solid fa-angle-up"></i></div> 
        `
    }

    
}

function chuteForInvalido(numero) {
    return Number.isNaN(numero);
}

function numeroForMaiorOuMenorQueOValorPermitido(numero) {
    return numero > maiorValor || numero < menorValor
}


document.addEventListener('click', e => {
    if (e.target.id == 'jogar-novamente') {
        window.location.reload()
    }
})

