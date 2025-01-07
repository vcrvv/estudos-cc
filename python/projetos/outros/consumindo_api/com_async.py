import aiohttp, asyncio


async def fetch(session, url):
    async with session.get(url) as response:
        return await response.json()


async def fetch_all(urls):
    async with aiohttp.ClientSession() as session:
        tasks = [fetch(session, url) for url in urls]
        results = await asyncio.gather(*tasks)
        return results
                

urls = ['https://api.exemplo.com/endpoint1', 'https://api.exemplo.com/endpoint2']
resultados = asyncio.run(fetch_all(urls))
print(resultados)