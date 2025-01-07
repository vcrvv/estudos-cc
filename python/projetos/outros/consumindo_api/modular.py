import requests

def get_user_posts(user_id: int):
    url = f'https://jsonplaceholder.typicode.com/posts?userId={user_id}'
    response = requests.get(url)
    response.raise_for_status()
    return response.json()

def criar_post(data: dict):
    url = 'https://jsonplaceholder.typicode.com/posts'
    response = requests.post(url, json=data)
    response.raise_for_status()
    return response.json

data = {
    'title': 'Novo post',
    'body': 'Corpo de post',
    'userId': 1
}

novo_post = criar_post(data)
posts = get_user_posts(1)
print(posts, novo_post)    