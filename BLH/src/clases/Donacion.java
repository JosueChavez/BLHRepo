/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Usuario
 */
public class Donacion {

    private String fechaDon;
    private String tipo;
    private String racAceptada;
    private String racDescartada;
    private String documento;
    private String estatura;
    private String peso;
    private String frasco;
    private String fechaVen;

    public Donacion() {
        fechaDon = "";
        tipo = "";
        racAceptada = "";
        racDescartada = "";
        documento = "";
        estatura = "";
        peso = "";
        frasco = "";
        fechaVen = "";
    }

    public Donacion(String fechaDon, String tipo, String racAcep, String racDesc, String Documento, String estatura, String peso, String frasco, String fechaVen) {
        this.fechaDon = fechaDon;
        this.tipo = tipo;
        this.racAceptada = racAcep;
        this.racDescartada = racDesc;
        this.documento = Documento;
        this.estatura = estatura;
        this.peso = peso;
        this.frasco = frasco;
        this.fechaVen = fechaVen;
                 
                
    }

    /**
     * @return the fechaDon
     */
    public String getFechaDon() {
        return fechaDon;
    }

    /**
     * @param fechaDon the fechaDon to set
     */
    public void setFechaDon(String fechaDon) {
        this.fechaDon = fechaDon;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the racAceptada
     */
    public String getRacAceptada() {
        return racAceptada;
    }

    /**
     * @param racAceptada the racAceptada to set
     */
    public void setRacAceptada(String racAceptada) {
        this.racAceptada = racAceptada;
    }

    /**
     * @return the doc
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param doc the nit to set
     */
    public void setDocumento(String doc) {
        this.documento = doc;
    }

    /**
     * @return the estatura
     */
    public String getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the peso
     */
    public String getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }

    /**
     * @return the racDescartada
     */
    public String getRacDescartada() {
        return racDescartada;
    }

    /**
     * @param racDescartada the racDescartada to set
     */
    public void setRacDescartada(String racDescartada) {
        this.racDescartada = racDescartada;
    }

    /**
     * @return the frasco
     */
    public String getFrasco() {
        return frasco;
    }

    /**
     * @param frasco the frasco to set
     */
    public void setFrasco(String frasco) {
        this.frasco = frasco;
    }

    /**
     * @return the fechaVen
     */
    public String getFechaVen() {
        return fechaVen;
    }

    /**
     * @param fechaVen the fechaVen to set
     */
    public void setFechaVen(String fechaVen) {
        this.fechaVen = fechaVen;
    }
    
    
}
