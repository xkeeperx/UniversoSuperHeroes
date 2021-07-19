package universo;

public class SuperHeroe {

    private String nombre;
    private String identidad;
    private String mundoOrigen;
    private boolean universo; // true - Marvel    fasle - DC
    private String[] poderes = new String[2];

    public SuperHeroe() {

    }

    public SuperHeroe(String nombre, String identidad, String mundoOrigen, boolean universo) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.mundoOrigen = mundoOrigen;
        this.universo = universo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getMundoOrigen() {
        return mundoOrigen;
    }

    public void setMundoOrigen(String mundoOrigen) {
        this.mundoOrigen = mundoOrigen;
    }

    public boolean isUniverso() {
        return universo;
    }

    public void setUniverso(boolean universo) {
        this.universo = universo;
    }

    public String[] getPoderes() {
        return poderes;
    }

    public void setPoderes(String[] poderes) {
        this.poderes = poderes;
    }
}
