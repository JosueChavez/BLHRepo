/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Chavez Vigil
 */
public class Historia {

    private int G;
    private int P1;
    private int P2;
    private int A;
    private int V;
    private int M;
    private int periodo;
    private int amenorrea;
    private String controlPrenatal;
    private String lugarControl;
    private int numero;
    private String fechaRegla;
    private String servicioProc;
    private String partoHospital;
    private String dondeParto;
    private String patologiaEmbarazo;
    private String cualPatologia;
    private String medicamentos;
    private String descripcion;
    private String toxicos;
    private String cualToxicos;
    private String patologiaEntrevista;
    private String motivo;
    private String obs;

    public Historia() {

        this.G = 0;
        this.P1 = 0;
        this.P2 = 0;
        this.A = 0;
        this.V = 0;
        this.M = 0;
        this.periodo = 0;
        this.amenorrea = 0;
        this.controlPrenatal = "";
        this.lugarControl = "";
        this.numero = 0;
        this.fechaRegla = "";
        this.servicioProc = "";
        this.partoHospital = "";
        this.dondeParto = "";
        this.patologiaEmbarazo = "";
        this.cualPatologia = "";
        this.medicamentos = "";
        this.descripcion = "";
        this.toxicos = "";
        this.cualToxicos = "";
        this.patologiaEntrevista = "";
        this.motivo = "";
        this.obs = "";
    }

    public Historia(int G, int P1, int P2, int A, int V, int M, int periodo, int amenorrea, String controlPrenatal, String lugarControl, int numero, String fechaRegla, String servicioProc, String partoHospital, String dondeParto, String patologiaEmbarazo, String cualPatologia, String medicamentos, String descripcion, String toxicos, String cualToxicos, String patologiaEntrevista, String motivo, String obs) {
        this.G = G;
        this.P1 = P1;
        this.P2 = P2;
        this.A = A;
        this.V = V;
        this.M = M;
        this.periodo = periodo;
        this.amenorrea = amenorrea;
        this.controlPrenatal = controlPrenatal;
        this.lugarControl = lugarControl;
        this.numero = numero;
        this.fechaRegla = fechaRegla;
        this.servicioProc = servicioProc;
        this.partoHospital = partoHospital;
        this.dondeParto = dondeParto;
        this.patologiaEmbarazo = patologiaEmbarazo;
        this.cualPatologia = cualPatologia;
        this.medicamentos = medicamentos;
        this.descripcion = descripcion;
        this.toxicos = toxicos;
        this.cualToxicos = cualToxicos;
        this.patologiaEntrevista = patologiaEntrevista;
        this.motivo = motivo;
        this.obs = obs;
    }

    /**
     * @return the G
     */
    public int getG() {
        return G;
    }

    /**
     * @param G the G to set
     */
    public void setG(int G) {
        this.G = G;
    }

    /**
     * @return the P1
     */
    public int getP1() {
        return P1;
    }

    /**
     * @param P1 the P1 to set
     */
    public void setP1(int P1) {
        this.P1 = P1;
    }

    /**
     * @return the P2
     */
    public int getP2() {
        return P2;
    }

    /**
     * @param P2 the P2 to set
     */
    public void setP2(int P2) {
        this.P2 = P2;
    }

    /**
     * @return the A
     */
    public int getA() {
        return A;
    }

    /**
     * @param A the A to set
     */
    public void setA(int A) {
        this.A = A;
    }

    /**
     * @return the V
     */
    public int getV() {
        return V;
    }

    /**
     * @param V the V to set
     */
    public void setV(int V) {
        this.V = V;
    }

    /**
     * @return the M
     */
    public int getM() {
        return M;
    }

    /**
     * @param M the M to set
     */
    public void setM(int M) {
        this.M = M;
    }

    /**
     * @return the periodo
     */
    public int getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the amenorrea
     */
    public int getAmenorrea() {
        return amenorrea;
    }

    /**
     * @param amenorrea the amenorrea to set
     */
    public void setAmenorrea(int amenorrea) {
        this.amenorrea = amenorrea;
    }

    /**
     * @return the controlPrenatal
     */
    public String getControlPrenatal() {
        return controlPrenatal;
    }

    /**
     * @param controlPrenatal the controlPrenatal to set
     */
    public void setControlPrenatal(String controlPrenatal) {
        this.controlPrenatal = controlPrenatal;
    }

    /**
     * @return the lugarControl
     */
    public String getLugarControl() {
        return lugarControl;
    }

    /**
     * @param lugarControl the lugarControl to set
     */
    public void setLugarControl(String lugarControl) {
        this.lugarControl = lugarControl;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the fechaRegla
     */
    public String getFechaRegla() {
        return fechaRegla;
    }

    /**
     * @param fechaRegla the fechaRegla to set
     */
    public void setFechaRegla(String fechaRegla) {
        this.fechaRegla = fechaRegla;
    }

    /**
     * @return the servicioProc
     */
    public String getServicioProc() {
        return servicioProc;
    }

    /**
     * @param servicioProc the servicioProc to set
     */
    public void setServicioProc(String servicioProc) {
        this.servicioProc = servicioProc;
    }

    /**
     * @return the partoHospital
     */
    public String getPartoHospital() {
        return partoHospital;
    }

    /**
     * @param partoHospital the partoHospital to set
     */
    public void setPartoHospital(String partoHospital) {
        this.partoHospital = partoHospital;
    }

    /**
     * @return the dondeParto
     */
    public String getDondeParto() {
        return dondeParto;
    }

    /**
     * @param dondeParto the dondeParto to set
     */
    public void setDondeParto(String dondeParto) {
        this.dondeParto = dondeParto;
    }

    /**
     * @return the patologiaEmbarazo
     */
    public String getPatologiaEmbarazo() {
        return patologiaEmbarazo;
    }

    /**
     * @param patologiaEmbarazo the patologiaEmbarazo to set
     */
    public void setPatologiaEmbarazo(String patologiaEmbarazo) {
        this.patologiaEmbarazo = patologiaEmbarazo;
    }

    /**
     * @return the cualPatologia
     */
    public String getCualPatologia() {
        return cualPatologia;
    }

    /**
     * @param cualPatologia the cualPatologia to set
     */
    public void setCualPatologia(String cualPatologia) {
        this.cualPatologia = cualPatologia;
    }

    /**
     * @return the medicamentos
     */
    public String getMedicamentos() {
        return medicamentos;
    }

    /**
     * @param medicamentos the medicamentos to set
     */
    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the toxicos
     */
    public String getToxicos() {
        return toxicos;
    }

    /**
     * @param toxicos the toxicos to set
     */
    public void setToxicos(String toxicos) {
        this.toxicos = toxicos;
    }

    /**
     * @return the cualToxicos
     */
    public String getCualToxicos() {
        return cualToxicos;
    }

    /**
     * @param cualToxicos the cualToxicos to set
     */
    public void setCualToxicos(String cualToxicos) {
        this.cualToxicos = cualToxicos;
    }

    /**
     * @return the patologiaEntrevista
     */
    public String getPatologiaEntrevista() {
        return patologiaEntrevista;
    }

    /**
     * @param patologiaEntrevista the patologiaEntrevista to set
     */
    public void setPatologiaEntrevista(String patologiaEntrevista) {
        this.patologiaEntrevista = patologiaEntrevista;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * @return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param obs the obs to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }
    
}
