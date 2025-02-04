import java.util.Scanner;

// Autor: David García Antón
public class Vendedor {
    private String idVendedor;
    private boolean esJefe;
    private String salario;
    private String jornadaLaboral;


    public Vendedor(String idVendedor, boolean esJefe, String salario, String jornadaLaboral) {
        setIdVendedor(idVendedor);
        setEsJefe(esJefe);
        setSalario(salario);
        setJornadaLaboral(jornadaLaboral);
    }


    public String getIdVendedor() {
        return idVendedor;
    }

    public boolean getEsJefe() {
        return esJefe;
    }

    public String getSalario() {
        return salario;
    }

    public String getJornadaLaboral() {
        return jornadaLaboral;
    }


    public void setIdVendedor(String idVendedor) {
        if (idVendedor != null && idVendedor.length() <= 9) {
            this.idVendedor = idVendedor;
        } else {
            throw new IllegalArgumentException("ID de Vendedor inválido (máx 9 caracteres).");
        }
    }

    public void setEsJefe(boolean esJefe) {
        this.esJefe = esJefe;
    }

    public void setSalario(String salario) {
        try {
            Integer.parseInt(salario);
            if (salario.length() <= 10) {
                this.salario = salario;
            } else {
                throw new IllegalArgumentException("Salario inválido (máx 10 dígitos).");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Salario debe contener solo números.");
        }
    }

    public void setJornadaLaboral(String jornadaLaboral) {
        if (jornadaLaboral != null && jornadaLaboral.length() <= 10) {
            this.jornadaLaboral = jornadaLaboral;
        } else {
            throw new IllegalArgumentException("Jornada laboral inválida (máx 10 caracteres).");
        }
    }


    public void mostrarVendedor() {
        System.out.println("Vendedor :");
        System.out.println("IDVendedor: " + idVendedor);
        System.out.println("Es Jefe: " + esJefe);
        System.out.println("Salario: " + salario);
        System.out.println("Jornada Laboral: " + jornadaLaboral);
    }
}