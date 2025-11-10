'''
Uma livraria vendeu 125 livros de literatura por R$ 35 cada e 80 livros didáticos
por R$ 50 cada. Qual foi o total arrecadado pela livraria?

'''

def venda_do_dia():
    total = livros_didaticos() + livros_literarios()
    print('Total de livros de literatura: R$', livros_literarios())
    print('Total de livros de didaticos: R$', livros_didaticos())
    print('Total do dia : R$', total)


def livros_literarios():
    qt_literatura = 125
    preco_l = 35
    venda_literatura = qt_literatura * preco_l
    return venda_literatura


def livros_didaticos():
    qt_didaticos = 80
    preco_d = 50
    venda_didatico = qt_didaticos * preco_d
    return venda_didatico

livros_didaticos()
livros_literarios()
venda_do_dia()






