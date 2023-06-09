package model;

public class Alumno {
    private String nombre;
    private String apellidos;
    private double ad;
    private double sge;
    private double di;
    private double pmdm;
    private double psp;
    private double eie;
    private double hlc;

    public Alumno(String nombre, String apellidos, double ad, double sge, double di, double pmdm, double psp, double eie, double hlc) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ad = ad;
        this.sge = sge;
        this.di = di;
        this.pmdm = pmdm;
        this.psp = psp;
        this.eie = eie;
        this.hlc = hlc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getAd() {
        return ad;
    }

    public double getSge() {
        return sge;
    }

    public double getDi() {
        return di;
    }

    public double getPmdm() {
        return pmdm;
    }

    public double getPsp() {
        return psp;
    }

    public double getEie() {
        return eie;
    }

    public double getHlc() {
        return hlc;
    }

    public void setAd(double ad) {
        this.ad = ad;
    }

    public void setSge(double sge) {
        this.sge = sge;
    }

    public void setDi(double di) {
        this.di = di;
    }

    public void setPmdm(double pmdm) {
        this.pmdm = pmdm;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setEie(double eie) {
        this.eie = eie;
    }

    public void setHlc(double hlc) {
        this.hlc = hlc;
    }

    public double getNotaMedia() {
        double total = ad + sge + di + pmdm + psp + eie + hlc;
        return total / 7;
    }

    public int getNumModulosSuspensos() {
        int numSuspensos = 0;
        if (ad < 5) numSuspensos++;
        if (sge < 5) numSuspensos++;
        if (di < 5) numSuspensos++;
        if (pmdm < 5) numSuspensos++;
        if (psp < 5) numSuspensos++;
        if (eie < 5) numSuspensos++;
        if (hlc < 5) numSuspensos++;
        return numSuspensos;
    }
}
