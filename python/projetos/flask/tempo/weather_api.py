import requests

chave_api = 'bdd707314394e2fe946d88b5ee6ef29a'


def saber_coordenadas(cidade):
    url = f'http://api.openweathermap.org/geo/1.0/direct?q={cidade}&appid={chave_api}&lang=pt_br'
    response = requests.get(url)
    if response.status_code == 200:
        dados = response.json()[0]
        lat = dados['lat']
        lon = dados['lon']
        cidd = dados['name']
        return lat, lon, cidd
    else:        
        return f"Erro: {response.status_code}"
        
def saber_tempo(coordenadas):
    url = f'https://api.openweathermap.org/data/2.5/weather?lat={coordenadas[0]}&lon={coordenadas[1]}&appid={chave_api}&units=metric&lang=pt_br'
    response = requests.get(url)
    if response.status_code == 200:
        dados = response.json()
        tempo_atual = dados['weather'][0]
        principal = dados['main']
        return coordenadas[2], tempo_atual['description'], principal['temp'], principal['humidity']
    else:
        return f"Erro: {response.status_code}"
