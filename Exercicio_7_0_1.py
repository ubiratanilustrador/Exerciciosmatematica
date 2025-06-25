'''
Se o capital de R$ 1 000,00 rende mensalmente 
R$ 25,00, qual é a taxa anual de juros no 
sistema de juros simples?

'''
def caculo_juros(capital,juros):
   print('taxa mensal: ', (juros/capital)*100,'%') 
   print('taxa anual: ', (((juros/capital)*100)*12),'%') 

caculo_juros(1000,25)
