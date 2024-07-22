from validacoes import *
from telefonesbr import *
from datasbr import *
from acesso_cep import buscaEndereco

cpf = "05350945238"
documento1 = Documento.cria_documento(cpf)
print("CPF:", documento1)

cnpj = "46717399000127"
documento = Documento.cria_documento(cnpj)
print("CNPJ:", documento)

numero = "5500567891234"
telefone = TelefonesBr(numero)
print("Número:", telefone)

cadastro = DatasBr()
print("Data e Hora:", cadastro.format_data())

cep = "76907618"
objeto_cep = buscaEndereco(cep)
print("CEP:", objeto_cep.format_cep())
bairro, cidade, uf = objeto_cep.retorna_endereco()
print(bairro, cidade, uf)
