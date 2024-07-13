from rest_framework import serializers
from escola.models import Estudante, Curso

# SERIALIZER
# controla o output das respostas
# converte dados complexos(EX: objetos, banco de dados) em dados mais simples (EX: JSON, XML, YAML [BINARIOS]) para transmissão e armazenamento
# PODE SER REVERSO (desserialização)


class EstudanteSerializer(serializers.ModelSerializer):
    class Meta:
        model = Estudante
        fields = ['id', 'nome', 'email', 'cpf', 'data_nascimento', 'celular']

class CursoSerializer(serializers.ModelSerializer):
    class Meta:
        model = Curso
        fields = '__all__' #pegar todos
        

# >>> py manage.py shell
# >>> from escola.models import Estudante
# >>> from escola.serializers import EstudanteSerializer
# >>> queryset = Estudante.objects.all()
# >>> queryset
# <QuerySet [<Estudante: leticia>, <Estudante: eduarda>]>
# >>> serializador = EstudanteSerializer(queryset, many = True)
# >>> serializador.data
# >>>  [{'id': 1, 'nome': 'leticia', 'email': 'leticia@email.com', 'cpf': '11111111111', 'data_nascimento': '2004-04-14', 'celular': '11111111111111'}, 
# {'id': 2, 'nome': 'e111111'}, {'id': 2, 'nome': 'eduarda', 'email': 'eduarda@email.com', 'cpf': '22222222222', 'data_nascimento': '2000-08-14', 'celular': 
# '33333333333333'}]

# >>> from rest_framework.renderers import JSONRenderer
# >>> dados_json = JSONRenderer().render(serializador.data)
# >>> dados_json
# >>> b'[{"id":1,"nome":"leticia","email":"leticia@email.com","cpf":"11111111111","data_nascimento":"2004-04-14","celular":"11111111111111"},
# {"id":2,"nome":"eduarda","email":"eduarda@email.com","cpf":"22222222222","data_nascimento":"2000-08-14","celular":"33333333333333"}]'