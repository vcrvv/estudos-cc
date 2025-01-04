from tkinter import *

def olamundo():
    textv['text'] = 'OLA MUNDOO!!!! :))))'

def notolamundo():
    textv['text'] = 'ola mundo... :('    



janela = Tk()
janela.title('Olá, Mundo!')
janela.geometry('200x150')

texto1 = Label(janela, text='Olá, Mundo!?')
texto1.grid(column=0, row=0, pady=10, padx=10)


botaos = Button(janela, text='sim', command=olamundo)
botaos.grid(column=0, row=1, pady=10)
botaon = Button(janela, text='nao', command=notolamundo)
botaon.grid(column=1, row=1, pady=10)

textv = Label(janela, text='')
textv.grid(column=0, row=2, pady=5)


janela.mainloop()