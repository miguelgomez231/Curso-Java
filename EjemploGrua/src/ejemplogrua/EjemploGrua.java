/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogrua;

/**
 *
 * @author Miguel Ángel
 */
public class EjemploGrua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grua miGrua = new Grua();
        miGrua.moverChasis("O");
        miGrua.girarGrua(45);
    }
     public void moverChasis(String sDirecc){
        switch(sDirecc){
            case "N":
                this.iPosicionY = this.iPosicionY + iPasoMinimo; 
                break;
            case "S":
                this.iPosicionY = this.iPosicionY - iPasoMinimo;                 
                break;
            case "O":
                this.iPosicionX = this.iPosicionX - iPasoMinimo;                 
                break;
            case "E":
                this.iPosicionX = this.iPosicionX - iPasoMinimo;                                 
                break;                

        }
    }
    
    public void girarGrua(int iGrados) {
        this.iGiroActualRespectoChasis += iGrados;
    }
}
