
package explorandomarte;


public class Planalto {
    private int xPlanalto;
    private int yPlanalto;  
   
    public int getxPlanalto() {
        return xPlanalto;
    }

    public void setxPlanalto(int xPlanalto) {
        this.xPlanalto = xPlanalto;
    }

    public int getyPlanalto() {
        return yPlanalto;
    }

    public void setyPlanalto(int yPlanalto) {
        this.yPlanalto = yPlanalto;
    }

    
    
    public void verificarPlanalto(){
        if (xPlanalto*yPlanalto<16){
            System.out.println("Esse planalto é muito pequeno, escolha um maior.");
        }else{
            System.out.println("Tudo certo.");
        }     
      
    }
    
}
