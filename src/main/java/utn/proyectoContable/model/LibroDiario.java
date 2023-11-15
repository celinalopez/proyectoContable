package utn.proyectoContable.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "librosdiarios")
public class LibroDiario {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    @Column
    private int nroAsiento;
    @Column
    private Date fecha;
    @Column
    private String nroCuenta;
    @Column
    private double haber;
    @Column
    private double debe;
    public LibroDiario() {
    }

    public LibroDiario(int id, int nroAsiento, Date fecha, String nroCuenta, double haber, double debe) {
        this.id = id;
        this.nroAsiento = nroAsiento;
        this.fecha = fecha;
        this.nroCuenta = nroCuenta;
        this.haber = haber;
        this.debe = debe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getHaber() {
        return haber;
    }

    public void setHaber(double haber) {
        this.haber = haber;
    }

    public double getDebe() {
        return debe;
    }

    public void setDebe(double debe) {
        this.debe = debe;
    }
}
