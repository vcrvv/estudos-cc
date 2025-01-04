import psycopg2

conn = psycopg2.connect(
    database = "postgres",
    host = "localhost",
    user = "postgres",
    password = "postgres",
    port = 5432)


if conn:
    print("OK!")
    
cursor = conn.cursor()

#COMANDOS CRUDS

cursor.close()
conn.close()
print("FIM!")