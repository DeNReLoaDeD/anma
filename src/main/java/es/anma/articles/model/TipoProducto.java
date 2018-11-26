package es.anma.articles.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_producto")
public class TipoProducto {


    @Id
    @Column(name="id_subfamilia")
    private Long idSubfamilia;

    @Column(name="nombre")
    private String nombre;

    @OneToMany(mappedBy = "subfamilia", cascade = CascadeType.ALL)
    private List<Familia> familias;

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

    public List<Familia> getFamilias() {
        return familias;
    }

    public void setFamilias(List<Familia> familias) {
        this.familias = familias;
    }
}
