import requests, json

url = 'https://jsonplaceholder.typicode.com/posts'

data = {
    'title': 'fufu',
    'body': 'bar',
    'userId': 14
}

response = requests.post(url, json=data)

if response.status_code == 201: 
    print('Dado criado com sucesso!')
    print(response.json())
else:
    print(f"Erro {response.status_code}")
