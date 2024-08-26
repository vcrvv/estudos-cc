document.getElementById('cep-form').addEventListener('submit', function(event) {
    event.preventDefault();
    
    // Obtém o valor do CEP
    var cep = document.getElementById('cep').value;
    
    // Simula a obtenção de dados do CEP
    var fakeData = {
        "00000-000": {
            "logradouro": "Rua Exemplo",
            "bairro": "Bairro Exemplo",
            "cidade": "Cidade Exemplo",
            "estado": "Estado Exemplo"
        }
    };
    
    var info = fakeData[cep];
    
    if (info) {
        // Preenche os dados na página
        document.getElementById('info-cep').textContent = cep;
        document.getElementById('info-logradouro').textContent = info.logradouro;
        document.getElementById('info-bairro').textContent = info.bairro;
        document.getElementById('info-cidade').textContent = info.cidade;
        document.getElementById('info-estado').textContent = info.estado;
        
        // Exibe a seção de informações
        document.getElementById('cep-info').classList.remove('d-none');
    } else {
        // Oculta a seção de informações se o CEP não for encontrado
        document.getElementById('cep-info').classList.add('d-none');
        alert('CEP não encontrado.');
    }
});
