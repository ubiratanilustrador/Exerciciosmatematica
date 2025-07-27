package main

/*1) Comprei 500 balas comi 305 e dei 120 para meu irmão. Quantas eu fiquei?*/

import "fmt"

func main (){

    //Declara e atribui valores a múltiplas variáveis
    var balas,comi,dei int = 500, 305,120
    
     /*crio a variável resultado que recebe 
      o retorno da função fiquei*/  
    resultado := fiquei(balas,comi,dei)
    
       /*chamo a função imprimir
    exibi o resultado na tela do usuário*/
    imprimir(resultado)
}

//passo como parâmetro três números inteiros
func fiquei (a int, b int, c int) int{
    return a-b-c //retorno o resultado da subtração
}

//passo como parâmetro o resultado da soma
func imprimir (valor int){
    fmt.Println ("Resultado:", valor)//retorno na tela do usuário
}
