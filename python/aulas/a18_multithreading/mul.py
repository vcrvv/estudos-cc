# MULTITHREADING - usado para executar multiplas tarefas ao mesmo tempo (multitasking)

import threading
import time

def walk_dog(first):
    time.sleep(8)
    print(f"You finished walking {first}!")

def take_out_trash():
    time.sleep(2)
    print("You take out the trash!")
    
def get_mail():
    time.sleep(5)
    print("You get the mail")
    
# assim cada função sera executada na ordem que foi chamada. pois estão na mesma thread
#walk_dog() 
#take_out_trash()
#get_mail() 

# todas estão sendo executadas ao mesmo tempo. pois estão em threads diferentes
chore1 = threading.Thread(target=walk_dog, args=('Scooby', ))
chore1.start()

chore2 = threading.Thread(target=take_out_trash)
chore2.start()

chore3 = threading.Thread(target=get_mail)
chore3.start()


# join() evita a execução de outro bloco de comando antes que a thread termine de executar
chore1.join() 
chore2.join()
chore3.join()

# executado dps de chore1, 2 e 3.
print("All choices are complete!")

