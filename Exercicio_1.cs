/******************************************************************************
1) Comprei 500 balas comi 305 e dei 120 para meu irmão. Quantas eu fiquei? 
*******************************************************************************/
using System;
class Balas {
  static void Main() {
      
        int balas = 500; //quantidade total de balas
	int comi = 305;  //quantidade de balas que come
	int dei = 120;   //quantidade de balas que dei para meu irmão

    // exibi no console a quantidade de balas que fiquei 
    Console.WriteLine("Fique com: " + (balas-comi-dei)+ " balas.");
  }
}
