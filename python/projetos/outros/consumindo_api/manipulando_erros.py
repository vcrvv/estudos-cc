import requests
from requests.exceptions import HTTPError, Timeout, RequestException

url = 'https://jsonplaceholder.typicode.com/posts'

try:
    response = requests.get(url, timeout=5)
    response.raise_for_status()
    
    data = response.json()
    print(data)
    
except Timeout:
    print('A requisição demorou demais para responder.')
except HTTPError as http_err:
    print(f'Erro HTTP ocorrido: {http_err}')
except RequestException as err:
    print(f'Erro na requisição: {err}')