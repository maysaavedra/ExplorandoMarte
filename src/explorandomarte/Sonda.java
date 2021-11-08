/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorandomarte;

/**
 *
 * @author Mayara
 */
public class Sonda {
    private int xSonda;
    private int ySonda;
    private char direcao;
    

    public int getXSonda() {
        return xSonda;
    }

    public void setXSonda(int xSonda) {
        this.xSonda = xSonda;
    }

    public int getYSonda() {
        return ySonda;
    }

    public void setYSonda(int ySonda) {
        this.ySonda = ySonda;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    @Override
    public String toString() {
        return "Posição da Sonda(" + xSonda + ", " + ySonda + ", " + direcao + ')';
    }
    
  
   
    public void verificarSonda(Planalto planalto){
      if(planalto.getxPlanalto() < xSonda || planalto.getyPlanalto() < ySonda){
         System.out.println("A sonda está fora dos limites permitidos");
         System.exit(0);
      }else{
          System.out.println("Tudo certo");
      }  
    
    }
    
   
}
