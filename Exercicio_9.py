'''
Em uma fábrica de brinquedos, 5 máquinas produzem 60 peças em 4 horas. Durante o período de Natal,
a fábrica decidiu aumentar a produção para atender à demanda, colocando 8 máquinas para funcionar.
Quantas peças serão produzidas em 4 horas com esse aumento?

'''

#SOLUÇÃO 1, regra de tês:
def solucao_1():
    maquinas = 5
    maquinas_ex = 8
    qt_pecas = 60
    sub_total = maquinas_ex * qt_pecas
    total = sub_total / maquinas
    print('SOLUÇÃO_1, serão produzidas em 4 horas:',total)

#SOLUÇÃO 2:
def solucao_2():
    maquinas = 5
    maquinas_ex = 8
    qt_pecas = 60
    subtotal = qt_pecas / maquinas
    total = subtotal*maquinas_ex
    print('SOLUÇÃO_2, serão produzidas em 4 horas:', total)

solucao_1()
solucao_2()
