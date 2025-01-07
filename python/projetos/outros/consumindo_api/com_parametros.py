import requests

# URL da API
url="https://jsonplaceholder.typicode.com/posts"

# Parametros para o request GET
params = {
    'id': 1
}

# Fazendo o request GET com parametros
response = requests.get(url, params=params)

if response.status_code == 200:
    print('Requisição bem-sucedida!')
    data = response.json()
    print(data)
else:
    print(f"Erro: {response.status_code}")