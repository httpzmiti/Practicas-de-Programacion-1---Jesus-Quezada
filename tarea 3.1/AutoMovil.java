public class AutoMovil {
    private String marca;
    private String modelo;
    private int anio;
    private String color;

    public AutoMovil() {
        System.out.println("Constructor de AutoMovil");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void encender() {
        System.out.println("El automovil esta encendiendo...");
    }

    public void apagar() {
        System.out.println("El automovil esta apagando...");
    }

    public void acelerar() {
        System.out.println("El automovil esta acelerando...");
    }

    public void frenar() {
        System.out.println("El automovil esta frenando...");
    }
}
