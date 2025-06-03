'''

3) Elisa está a procura de uma televisão para colocar em sua sala. 
   Ela viu um anúncio de um modelo novo com as opções de pagamento
   à vista e a prazo.
   
   A vista = R$ 1350,00
   A prazo = 12 x 138,00
   
   Quanto Elisa pagará a mais se optar pelo pagamento a prazo?

'''
def operacao ():
    
    valor_prestacao = 138
    valor_avista = 1350
    prestacao = 12
    valor_total = prestacao * valor_prestacao
    a_mais = valor_total - valor_avista
    print ("valor total das prestações foi de: R$", valor_total)
    print ("se optar pelo pagamento a prazo, pagara a mais: R$", a_mais) 
    
operacao()
    
