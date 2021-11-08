
package explorandomarte;


public class Comando {

    
    public void mover(Sonda sonda, Planalto planalto){
       char direcaoAtual = sonda.getDirecao();
       int x, y;
       switch(direcaoAtual){
           case 'N':
              y = sonda.getYSonda() + 1;              
              sonda.setYSonda(y);
              sonda.verificarSonda(planalto);
              break;
           case 'S':
              y = sonda.getYSonda() - 1;
              sonda.setYSonda(y);
              sonda.verificarSonda(planalto);
              break;
           case 'E':
              x = sonda.getXSonda() + 1;
              sonda.setXSonda(x);
              sonda.verificarSonda(planalto);
              break;
           case 'W':
              x = sonda.getXSonda() - 1;
              sonda.setXSonda(x);
              sonda.verificarSonda(planalto);
              break;    
            default:
                 throw new RuntimeException("Comando invalido, pois a sonda sairá do planalto." );
       }    
    }
    public void virarEsquerda(Sonda sonda) {
        char direcaoAtual = sonda.getDirecao();
        char novaDirecao;
        switch(direcaoAtual){
           case 'N':
               novaDirecao = 'W';
              sonda.setDirecao(novaDirecao);
              break;
           case 'S':
              novaDirecao = 'E';
              sonda.setDirecao(novaDirecao);
              break;
           case 'E':
              novaDirecao = 'N';
              sonda.setDirecao(novaDirecao);
              break;
           case 'W':
              novaDirecao = 'S';
              sonda.setDirecao(novaDirecao);
              break;  
              default:
                  throw new RuntimeException("Comando invalido" );
       }    
    }
    public void virarDireita(Sonda sonda) {
        char direcaoAtual = sonda.getDirecao();
        char novaDirecao;
        switch(direcaoAtual){
           case 'N':
               novaDirecao = 'E';
              sonda.setDirecao(novaDirecao);
              break;
           case 'S':
              novaDirecao = 'W';
              sonda.setDirecao(novaDirecao);
              break;
           case 'E':
              novaDirecao = 'S';
              sonda.setDirecao(novaDirecao);
              break;
           case 'W':
              novaDirecao = 'N';
              sonda.setDirecao(novaDirecao);
              break; 
            default:
                throw new RuntimeException("Comando invalido" );
       }    
    }

    
   
   
}
             
