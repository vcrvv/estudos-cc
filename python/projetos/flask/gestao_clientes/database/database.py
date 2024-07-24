from peewee import SqliteDatabase

db = SqliteDatabase('customermanager.db')



# Connect to a MySQL database on network.
# mysql_db = MySQLDatabase('my_app', user='app', password='db_password',
#                          host='10.1.0.8', port=3306)

# Connect to a Postgres database.
# pg_db = PostgresqlDatabase('my_app', user='postgres', password='secret',
#                            host='10.1.0.9', port=5432)