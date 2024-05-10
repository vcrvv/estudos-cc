from PySimpleGUI import PySimpleGUI as sg

# layout 
sg.theme('Reddit')
layout = [
    [sg.Text('Usuario'), sg.Input(key='usuario', size=(20, 1))],
    [sg.Text('Senha'), sg.Input(key='senha', password_char='*', size=(20, 1))],
    [sg.Checkbox('Salvar o login?')],
    [sg.Button('Entrar')]
]

# janela
janela = sg.Window('Tela de Login', layout)

#ler os eventos
while True:
    eventos, valores = janela.read()
    if eventos == sg.WINDOW_CLOSED:
        break
    if eventos == 'Entrar':
        if valores['usuario'] == 'vini' and valores['senha'] == 'vini123':
            print('Bem Vindo!!')