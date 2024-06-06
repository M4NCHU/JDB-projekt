package demo.dto;

import java.util.Date;

public class OcenaDTO {
    private Long id;
    private int ocena;
    private String tresc;
    private Date dataDodania;
    private double wartosc;
    private String autor;
    private Long filmId;

    // Gettery i settery
    // ...

    public OcenaDTO(Long id, int ocena, String tresc, Date dataDodania, double wartosc, String autor, Long filmId) {
        this.id = id;
        this.ocena = ocena;
        this.tresc = tresc;
        this.dataDodania = dataDodania;
        this.wartosc = wartosc;
        this.autor = autor;
        this.filmId = filmId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public Date getDataDodania() {
        return dataDodania;
    }

    public void setDataDodania(Date dataDodania) {
        this.dataDodania = dataDodania;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Long getFilmId() {
        return filmId;
    }

    public void setFilmId(Long filmId) {
        this.filmId = filmId;
    }

}
