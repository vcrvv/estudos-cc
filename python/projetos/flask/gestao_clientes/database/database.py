from peewee import SqliteDatabase, MySQLDatabase

sqlitedb = SqliteDatabase('customermanager.db')

db = MySQLDatabase(user='root', 
                   password='root', 
                   host='localhost', 
                   port=3306,
                   database='mydb7')

# Connect to a MySQL database on network.
# mysql_db = MySQLDatabase('my_app', user='app', password='db_password',
#                          host='10.1.0.8', port=3306)

# Connect to a Postgres database.
# pg_db = PostgresqlDatabase('my_app', user='postgres', password='secret',
#                            host='10.1.0.9', port=5432)