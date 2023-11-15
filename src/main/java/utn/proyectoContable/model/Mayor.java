package utn.proyectoContable.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Mayor {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    @Column
    private int anio;
    @Column
    private int mes;
    @Column
    private String nroCuenta;
    @Column
    private double totalDebe;
    @Column
    private double totalHaber;
    @Column
    private double saldo;

    public Mayor() {
    }

    public Mayor(int id, int anio, int mes, String nroCuenta, double totalDebe, double totalHaber, double saldo) {
        this.id = id;
        this.anio = anio;
        this.mes = mes;
        this.nroCuenta = nroCuenta;
        this.totalDebe = totalDebe;
        this.totalHaber = totalHaber;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getTotalDebe() {
        return totalDebe;
    }

    public void setTotalDebe(double totalDebe) {
        this.totalDebe = totalDebe;
    }

    public double getTotalHaber() {
        return totalHaber;
    }

    public void setTotalHaber(double totalHaber) {
        this.totalHaber = totalHaber;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
