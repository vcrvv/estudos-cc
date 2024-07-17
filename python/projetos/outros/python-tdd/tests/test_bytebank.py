import pytest
from codigo.bytebank import Funcionario
from pytest import mark


class TestClass:
    def test_quando_idade_recebe_13_03_2000_deve_retornar_24(self):
       entrada = '13/03/2000'  # Given-contexto
       esperado = 24
       
       funcionario_teste = Funcionario('Teste', entrada, 1111)
       resultado = funcionario_teste.idade() # When-ação
       
       assert resultado == esperado # Then-desfecho
       
       
    def test_quando_sobrenome_recebe_Lucas_Carvalho_deve_retornar_apenas_carvalho(self):
        entrada = ' Lucas Carvalho ' # given
        esperado = 'Carvalho'
        
        lucas = Funcionario(entrada, '11/11/2000', 2000)
        resultado = lucas.sobrenome() # when
        
        assert resultado == esperado

    
    def test_quando_decrescimo_salario_recebe_100000_deve_retornar_90000(self):
        entrada_salario = 100000
        entrada_nome = 'Paulo Bragança'
        esperado = 90000
        
        funcionario_teste = Funcionario(entrada_nome, '11/11/2000', entrada_salario)
        funcionario_teste.decrescimo_salario()
        resultado = funcionario_teste.salario
        
        assert resultado == esperado
        
        
    @mark.calcular_bonus
    def test_quando_calcular_bonus_recebe_1000_deve_retornar_100(self):
        entrada = 1000
        esperado = 100
        
        funcionario_teste = Funcionario('teste', '11/11/2000', entrada)
        resultado = funcionario_teste.calcular_bonus()
        
        assert resultado == esperado
        
        
    @mark.calcular_bonus   
    def teste_quando_calcular_bonus_recebe_1000000_deve_retornar_exception(self):
       with pytest.raises(Exception):
            entrada = 1000000
        
            funcionario_teste = Funcionario('teste', '11/11/2000', entrada)
            resultado = funcionario_teste.calcular_bonus()
        
            assert resultado
            