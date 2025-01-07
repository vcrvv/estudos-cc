import concurrent.futures, requests


def fetch(url):
    response = requests.get(url)
    return response.json()

urls = ["https://api.exemplo.com/endpoint1", "https://api.exemplo.com/endpoint2"]

with concurrent.futures.ThreadPoolExecutor(max_workers=5) as executor:
    results = list(executor.map(fetch, urls))

print(results)