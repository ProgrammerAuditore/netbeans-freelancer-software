package modelo.dto;

public class RequisitoDto {
    
    private int cmpID;
    private String cmpNombre;
    private double cmpCosto;

    public int getCmpID() {
        return cmpID;
    }

    public void setCmpID(int cmpID) {
        this.cmpID = cmpID;
    }

    public String getCmpNombre() {
        return cmpNombre;
    }

    public void setCmpNombre(String cmpNombre) {
        this.cmpNombre = cmpNombre;
    }

    public double getCmpCosto() {
        return cmpCosto;
    }

    public void setCmpCosto(double cmpPrecio) {
        this.cmpCosto = cmpPrecio;
    }
    
}
