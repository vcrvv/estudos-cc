import mysql.connector

# conectando ao banco de dados
conexao = mysql.connector.connect(
     host='localhost',
     user='root',
     password='admin',
     database='bdcrud',
)

cursor = conexao.cursor()
# CRUD

# CREATE
nome_produto = 'beijinho'
valor = 2
comando = f'INSERT INTO vendas (nome_produto, valor) VALUES ("{nome_produto}", "{valor}")'
cursor.execute(comando)
conexao.commit() # edita o banco de dados

# READ
comando = f'SELECT * FROM vendas'
cursor.execute(comando)
resultado = cursor.fetchall() # ler o banco de dados
print(resultado)

# UPDATE
nome_produto = 'beijinho'
valor = 1
comando = f'UPDATE vendas SET valor = {valor} WHERE nome_produto = "{nome_produto}"'
cursor.execute(comando)
conexao.commit()

# DELETE
nome_produto = 'beijinho'
comando = f'DELETE FROM vendas WHERE nome_produto = "{nome_produto}"'
cursor.execute(comando)
conexao.commit()


print('ok')
cursor.close()
conexao.close()