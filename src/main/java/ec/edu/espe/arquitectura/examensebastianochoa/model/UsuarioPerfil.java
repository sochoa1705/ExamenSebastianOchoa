package ec.edu.espe.arquitectura.examensebastianochoa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "USUARIO_PERFIL")
public class UsuarioPerfil {
    @EmbeddedId
    private UsuarioPerfilPK pk;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechaCreacion;
    @Column(name = "ES_ACTIVO", nullable = false)
    private Boolean esActivo;
    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    @ManyToOne
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "COD_PERFIL", referencedColumnName = "COD_PERFIL", insertable = false, updatable = false)
    private Perfil perfil;

    public UsuarioPerfil() {}

    public UsuarioPerfil(UsuarioPerfilPK pk) {
        this.pk = pk;
    }

    public UsuarioPerfilPK getPk() {
        return pk;
    }

    public void setPk(UsuarioPerfilPK pk) {
        this.pk = pk;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Boolean getEsActivo() {
        return esActivo;
    }

    public void setEsActivo(Boolean esActivo) {
        this.esActivo = esActivo;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioPerfil that)) return false;
        return Objects.equals(pk, that.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk);
    }

    @Override
    public String toString() {
        return "UsuarioPerfil{" +
                "pk=" + pk +
                ", fechaCreacion=" + fechaCreacion +
                ", esActivo=" + esActivo +
                ", version=" + version +
                ", usuario=" + usuario +
                ", perfil=" + perfil +
                '}';
    }
}
