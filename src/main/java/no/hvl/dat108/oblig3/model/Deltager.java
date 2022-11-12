package no.hvl.dat108.oblig3.model;

import javax.persistence.*;


@Entity
@Table(schema = "dat108oblig4", name = "deltager")
public class Deltager {
    private String fornavn;
    private String etternavn;
    private String kjonn;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String mobil;
    private String passordHash;
    private String passordSalt;

    public Deltager() {

    }


    /**
     * @return the passordSalt
     */
    public String getPassordSalt() {
        return passordSalt;
    }
    /**
     * @param passordSalt the pass to set
     */
    public void setPassordSalt(String passordSalt) {
        this.passordSalt = passordSalt;
    }
    /**
     * @return the passordHash
     */
    public String getPassordHash() {
        return passordHash;
    }
    /**
     * @param passordHash the pass to set
     */
    public void setPassordHash(String passordHash) {
        this.passordHash = passordHash;
    }
    /**
     * @return the kjonn
     */
    public String getKjonn() {
        return kjonn;
    }
    /**
     * @param kjonn the kjonn to set
     */
    public void setKjonn(String kjonn) {
        this.kjonn = kjonn;
    }

    /**
     * @return the fornavn
     */
    public String getFornavn() {
        return fornavn;
    }

    /**
     * @param fornavn
     * @param etternavn
     * @param kjonn
     * @param mobil
     * @param passordHash
     * @param passordSalt
     */
    public Deltager(String fornavn, String etternavn, String kjonn, String mobil, String passordHash, String passordSalt) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.kjonn = kjonn;
        this.mobil = mobil;
        this.passordHash = passordHash;
        this.passordSalt = passordSalt;
    }
    /**
     * @param fornavn the fornavn to set
     */
    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }
    /**
     * @return the etternavn
     */
    public String getEtternavn() {
        return etternavn;
    }
    /**
     * @param etternavn the etternavn to set
     */
    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }
    /**
     * @return the mobil
     */
    public String getMobil() {
        return mobil;
    }
    /**
     * @param mobil the mobil to set
     */
    public void setMobil(String mobil) {
        this.mobil = mobil;
    }


}