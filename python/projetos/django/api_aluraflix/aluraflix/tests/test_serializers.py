from django.test import TestCase
from aluraflix.models import Programa
from aluraflix.serializers import ProgramaSerializer

class ProgramaSerializerTestCase(TestCase):
    def setUp(self):
        self.programa = Programa(
            titulo = 'Procurando ninguem em latim',
            data_lancamento = '2003-07-04',
            tipo='F',
            likes=2340,
            dislikes=40
        )
        self.serializer = ProgramaSerializer(instance=self.programa)
        
    def test_verifica_campos_serializados(self):
        data = self.serializer.data
        self.assertEqual(set(data.keys()), set(['titulo','data_lancamento', 'tipo', 'likes'] ))
    
    def test_verifica_conteudo_dos_campos_serializados(self):
        data = self.serializer.data
        self.assertEqual(data['titulo'], self.programa.titulo)