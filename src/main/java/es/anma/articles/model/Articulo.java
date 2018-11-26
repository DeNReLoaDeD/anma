package es.anma.articles.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "articulo")
public class Articulo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_articulo")
    private Long idArticulo;

    @Column(name = "codigo_anma")
    private String title;

    @Column(name = "nombre")
    private String category;

    @Column(name = "descripcion")
    private String descripcion;

    public Long geto() {
        return idArticulo;
    }

    public void setIdArticulo(Long idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}