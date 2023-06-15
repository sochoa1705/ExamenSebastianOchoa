package ec.edu.espe.arquitectura.examensebastianochoa.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Column;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsuarioPerfilPK implements Serializable {
    @Column(name = "COD_USUARIO", nullable = false)
    private Integer codigoUsuario;
    @Column(name = "COD_PERFIL", nullable = false)
    private String codigoPerfil;

    public UsuarioPerfilPK() {}

    public UsuarioPerfilPK(Integer codigoUsuario, String codigoPerfil) {
        this.codigoUsuario = codigoUsuario;
        this.codigoPerfil = codigoPerfil;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getCodigoPerfil() {
        return codigoPerfil;
    }

    public void setCodigoPerfil(String codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioPerfilPK that)) return false;
        return Objects.equals(codigoUsuario, that.codigoUsuario) && Objects.equals(codigoPerfil, that.codigoPerfil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoUsuario, codigoPerfil);
    }

    @Override
    public String toString() {
        return "UsuarioPerfilPK{" +
                "codigoUsuario=" + codigoUsuario +
                ", codigoPerfil='" + codigoPerfil + '\'' +
                '}';
    }
}
