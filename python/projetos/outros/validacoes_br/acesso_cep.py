import requests

class buscaEndereco:
    def __init__(self, cep):
        if self.cep_eh_valido(cep):
            self.cepv = str(cep)
        else:
            raise ValueError("CEP inválido")
    
    def __str__(self):
        return self.format_cep()
    
    def cep_eh_valido(self, cep):
        if len(cep) == 8:
            return True
        else:
            return False
    
    def format_cep(self):
        return f"{self.cepv[:5]}-{self.cepv[5:]}"

    def retorna_endereco(cepv):
        url = 'https://viacep.com.br/ws/{}/json'.format(cepv)
        r = requests.get(url)
        dados = r.json()
        
        bairro = dados.get('bairro')
        cidade = dados.get('localidade')
        uf = dados.get('uf')
        
        return bairro, cidade, uf