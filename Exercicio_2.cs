/*2) Na fazenda Morro Alto são produzidas laranjas. Assim que começou o período da colheita, 
 *uma grande produção já foi contabilizada. 
 *A tabela abaixo mostra a produção nos três primeiros dias.
 *
 * SEGUNDA = 3.265 LARANJAS 
 * TERÇA   = 4.127 LARANJAS
 * QUARTA  = 2.987 LARANJAS
 * 
 * a) Qual a produção total nos três primeiros dias?
 * b) De quanto foi a queda na produção entre o dia de maior e menor produção?*/
using System;
class Exercicio_2
{
    static void Main()
    {
        
        //criar uma variavel que vai receber o total de laranjas 
        double total = 3265 + 4127 + 2987;
        //exibo no console o total de laranjas
        Console.WriteLine("O total foi de : "+total);
        
        //crio uma variavel que vai receber o valor da queda
        double queda = 4127 - 2987;
        //exibo no console o valor da queda de produção
        Console.WriteLine("O queda foi de : "+queda);
    }
}
