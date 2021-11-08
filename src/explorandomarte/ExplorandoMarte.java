
package explorandomarte;

import java.util.Scanner;


public class ExplorandoMarte {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Vamos Começar a exploração de marte. \nPrimeiro digite as coordenadas do planalto a ser explorado.");      
        
        //Dados do planalto
        Planalto planalto = new Planalto();        
        System.out.println("Digite a coordenada x:");
        planalto.setxPlanalto(ler.nextInt());
        System.out.println("Digite a coordenada y:");
        planalto.setyPlanalto(ler.nextInt());
        
        planalto.verificarPlanalto();
        
        //Dados da sonda
        Sonda sonda = new Sonda ();
        System.out.println("Digite a coordenada x da sonda:");
        sonda.setXSonda(ler.nextInt());
        System.out.println("Digite a coordenada y da sonda:");
        sonda.setYSonda(ler.nextInt());
        sonda.verificarSonda(planalto);      
        
        System.out.println("Digite a direção para qual a sonda está apontada:");        
        char d = ler.next().toUpperCase().charAt(0);        
        sonda.setDirecao(d);
        
        //exploração
        Comando exploracao = new Comando();
        System.out.println("Chegou a hora de movimentar a sonda.\nDigite os comandos, sendo L para virar a esquerda, R para virar a direita e M para andar para frente. ");           
        
        String comando = ler.next().toUpperCase();
        for (int i = 0; i < comando.length(); i++) {
              if (comando.charAt(i) == 'L') {
                  exploracao.virarEsquerda(sonda);
              } else if (comando.charAt(i) == 'R') {
                 exploracao.virarDireita(sonda);
              } else {
                exploracao.mover(sonda, planalto);
              }   
    
 
        System.out.println(sonda.toString());
         
        
        
        
                
    }
    
}
}
