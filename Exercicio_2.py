'''
2) Na fazenda Morro Alto são produzidas laranjas. Assim que começou o período da colheita, 
 *uma grande produção já foi contabilizada. 
 *A tabela abaixo mostra a produção nos três primeiros dias.
 *
 * SEGUNDA = 3.265 LARANJAS 
 * TERÇA   = 4.127 LARANJAS
 * QUARTA  = 2.987 LARANJAS
 * 
 * a) Qual a produção total nos três primeiros dias?
 * b) De quanto foi a queda na produção entre o dia de maior e menor produção?
'''
def producao():
     
     segunda = 3265
     terca = 4127
     quarta = 2987
     
     total = segunda + terca + quarta
     queda = terca - quarta
     
     print('O total nos três primeiros dias foi: ',total,' laranjas.')
     print('A queda entre o dia de maior e menor produção foi: ',queda,' laranjas.')
    
producao()
