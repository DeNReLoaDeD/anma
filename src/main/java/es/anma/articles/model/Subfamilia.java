package es.anma.articles.model;

import javax.persistence.*;

@Entity
@Table(name = "subfamilia")
public class Subfamilia {

    @Id
    @Column(name="id_subfamilia")
    private Long idSubfamilia;

    @Column(name="nombre")
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idFamilia")
    private Familia familia;

    public Long getIdSubfamilia() {
        return idSubfamilia;
    }

    public void setIdSubfamilia(Long idSubfamilia) {
        this.idSubfamilia = idSubfamilia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }
}
