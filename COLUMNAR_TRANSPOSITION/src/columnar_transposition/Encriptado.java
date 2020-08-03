/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package columnar_transposition;

public class Encriptado {

    private String frase;
    private String encriptada;
    private String desencriptada;

    public Encriptado(String frase, String encriptada, String desencriptada) {
        this.frase = frase;
        this.encriptada = encriptada;
        this.desencriptada = desencriptada;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getEncriptada() {
        return encriptada;
    }

    public void setEncriptada(String encriptada) {
        this.encriptada = encriptada;
    }

    public String getDesencriptada() {
        return desencriptada;
    }

    public void setDesencriptada(String desencriptada) {
        this.desencriptada = desencriptada;
    }

}
