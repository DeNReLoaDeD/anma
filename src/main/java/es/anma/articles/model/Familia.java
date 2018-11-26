package es.anma.articles.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "familia")
public class Familia {

    @Id
    @Column(name = "idFamilia")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProducto")
    private TipoProducto tipoProducto;

    @OneToMany(mappedBy = "familia", cascade = CascadeType.ALL)
    private List<Subfamilia> subfamilias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public List<Subfamilia> getSubfamilias() {
        return subfamilias;
    }

    public void setSubfamilias(List<Subfamilia> subfamilias) {
        this.subfamilias = subfamilias;
    }
}
