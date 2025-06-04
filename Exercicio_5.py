'''

Em uma gincana de férias, 75 crianças se inscreveram para participar das atividades de recreação. 
De modo a organizarem os jogos e atividades, eles verificaram a faixa etária dos inscritos e 
constataram que 2/5 das crianças têm mais de doze anos. Quantos participantes tem menos que 12 anos?

'''

def idade_participantes(total_de_criancas):
    criancas_com_mais = ((2 * total_de_criancas)/5)
    criancas_com_menos = total_de_criancas - criancas_com_mais 
    print ('crianças com mais de 12 anos são:', criancas_com_mais, ' participantes.')
    print ('crianças com menos de 12 anos são:', criancas_com_menos, ' participantes.')
    
print (idade_participantes(75))


