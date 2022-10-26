package no.hvl.dat108.oblig3.model;

public class Vare {
    private String navn;

    public Vare(String navn){
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
