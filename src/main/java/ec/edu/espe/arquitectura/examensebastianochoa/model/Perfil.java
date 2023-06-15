package ec.edu.espe.arquitectura.examensebastianochoa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

import java.util.Objects;

@Entity
@Table(name = "PERFIL")
public class Perfil {
    @Id
    @Column(name = "COD_PERFIL", length = 8, nullable = false)
    private String codigo;
    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;
    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    public Perfil() {}

    public Perfil(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Perfil perfil)) return false;
        return Objects.equals(codigo, perfil.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", version=" + version +
                '}';
    }
}
