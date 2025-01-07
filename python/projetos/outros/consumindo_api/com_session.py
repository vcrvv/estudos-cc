import requests

def fetch_data(url):
    with requests.Session() as session:
        response = session.get(url)
        return response.json()

url = 'https://api.exemplo.com/endpoint'
resultados = fetch_data(url)
print(resultados)
    