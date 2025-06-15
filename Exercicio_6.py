'''

Equação do segundo Grau  é uma equação polinomial onde o termo de maior
grau da variável é o quadrado. A sua forma geral é ax² + bx + c = 0,
onde 'a', 'b' e 'c' são coeficientes (com 'a' ≠ 0) e 'x' é a variável.
Para resolver uma equação do 2º grau, utiliza-se a fórmula de Bhaskara
(fórmula resolvente) para encontrar as raízes da equação.

'''
import math

def formula_baskara (a,b,c):
    resultado = (pow(b, 2)) - (4*a*c)
    print('delta = ', resultado)
    x1 =  ((-b + math.sqrt(resultado))/2 *a)
    x2 =  ((-b - math.sqrt(resultado))/2 *a)
    print('Raiz 1= ',x1,' Raiz 2 = ', x2)

print ('informe o coeficentes', formula_baskara(1,3,0))
