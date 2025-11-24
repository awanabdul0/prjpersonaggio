/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abdul.awan
 */
public class Personaggio {
    private String nome;
    private int hp;
    private int atk;
    private int def;
    private double range;
    private int[]pos;

    public Personaggio(String nome, int hp, int atk, int def, double range, int[] pos) {
        this.nome = nome;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.range = range;
        for(int i=0;i< pos.length;i++){
            this.pos[i]=pos[i];
        }
    }
    
    public int  attacco(Personaggio nemico){
       int danno;
       danno= atk*3-def*2;
       
       if(danno <=0){
           danno=1;
       }
       return danno;
     
    }
  
    public boolean isVivo(){
        boolean stato=true;
        if(hp<=0){
            stato=false;
        }
        return stato;
    }
    public boolean subisciDanno(int danno){
    hp -=danno;
    return isVivo();
}
    /*public void movimento(int x,int y,Stanza stanza)){
        
    }
    */

    @Override
    public String toString() {
        return "Personaggio{" + "nome=" + nome + ", hp=" + hp + ", atk=" + atk + ", def=" + def + ", range=" + range + ", pos=" + pos + '}';
    }
           
}
