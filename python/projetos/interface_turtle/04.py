import turtle

# Configurações da tela
tela = turtle.Screen()
tela.setup(width=600, height=600)
tela.bgcolor("black")
tela.title("Estrela vermelha completa")

# Configurando a tartaruga
tartaruga = turtle.Turtle()
tartaruga.speed(0)
tartaruga.pensize(3)
tartaruga.color("red")

# Desenhando a estrela
for i in range(5):
    tartaruga.forward(300)
    tartaruga.right(144)

# Mantendo a tela aberta
tela.mainloop()