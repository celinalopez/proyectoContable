package utn.proyectoContable.model;

import jakarta.persistence.*;

@Entity
@Table(name = "plandecuentas")
public class PlanDeCuentas {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    @Column
    private String rubro;
    @Column
    private String nroCuenta;
    @Column
    private String descripcion;

    public PlanDeCuentas() {
    }
    public PlanDeCuentas(int id, String rubro, String nroCuenta, String descripcion) {
        this.id = id;
        this.rubro = rubro;
        this.nroCuenta = nroCuenta;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "PlanDeCuentas{" +
                "id=" + id +
                ", rubro='" + rubro + '\'' +
                ", nroCuenta='" + nroCuenta + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
