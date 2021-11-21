package entidadPrueba;

import java.util.Date;

public class Prueba {
    private String nombre;
    private Integer edad;
    private long dni;
    private Date fechaNacimiento;

    public Prueba() {
    }

    public Prueba(String nombre, Integer edad, long dni, Date fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
