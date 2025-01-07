import requests

#URL da API
url = 'https://jsonplaceholder.typicode.com/todos/1'

# Fazendo o request GET
response = requests.get(url)


# Verificando o status do response
if response.status_code == 200:
    print("Requisição bem-sucedida!")
    data = response.json() # Converte a response em JSON
    print(data)
    for c, v in data.items():
        print(f"{c}:{v}")
else:
    print(f"Erro ao fazer o request: {response.status_code}")
    