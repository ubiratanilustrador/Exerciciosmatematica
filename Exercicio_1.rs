/******************************************************************************
1) Comprei 500 balas comi 305 e dei 120 para meu irmão. Quantas eu fiquei?
*******************************************************************************/
fn main() {

//atribuição de valore imutáveis as variaveis balas, comi e dei
let balas = 500;
let comi = 305;
let dei = 120;

//chamando a função soma
fiquei(balas,comi,dei);

}

//passo como parâmetro três números inteiros
fn fiquei(a: i32, b: i32,c: i32){
    // realizo a substração dos três numeros
    let resultado = a-b-c;
    //exibo a soma no console
    println!("{}",resultado);

}
