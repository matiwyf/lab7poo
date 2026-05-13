public class Sismos {
    private String Region;
    private String Epicentro;
    private float Magnitud;

    public  Sismos(String Region, String Epicentro,  float Magnitud) throws  SismoInvalidoException {
        if (!Region.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            throw new SismoInvalidoException("La región no puede contener números.");
        }
        if (!Epicentro.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            throw new SismoInvalidoException("El epicentro no puede contener números.");
        }
        this.Region = Region;
        this.Epicentro = Epicentro;
        this.Magnitud = Magnitud;
    }
    public String getRegion() {
        return Region;
    }
    public void setRegion(String Region) {
        this.Region = Region;
    }
    public String getEpicentro() {
        return Epicentro;
    }
    public void setEpicentro(String Epicentro) {
        this.Epicentro = Epicentro;
    }
    public float getMagnitud() {
        return Magnitud;
    }
    public void setMagnitud(float magnitud) {
        Magnitud = magnitud;
    }

    @Override
    public String toString() {
        return "Sismos{" +
                "Region='" + Region + '\'' +
                ", Epicentro='" + Epicentro + '\'' +
                ", Magnitud=" + Magnitud +
                '}';
    }
}
