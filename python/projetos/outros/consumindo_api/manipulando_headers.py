import requests

url = 'https://jsonplaceholder.typicode.com/posts'

headers = {
    'Authorization': 'Bearer <seu_token_aqui>',
    'Content-Type': 'application/json'
}

data = {
    'title': 'fufu',
    'body': 'bar',
    'userId': 1
}

response = requests.post(url, json=data, headers=headers)

if response.status_code == 201:
    print('Requisição bem-sucedida!')
    print(response.json())
else:
    print(f'Erro {response.status_code}')
