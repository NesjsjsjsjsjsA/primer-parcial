public abstract class artículos_comunes
{
    private String name;
    private String modelo;
    private double precio;

    private  String descripcion;

    //Creacion de un constructor

    public artículos_comunes (String name, String modelo, int precio, String descripcion)
    {
        setPrecio(precio);
        setName(name);
        setModelo(modelo);
        setDescripcion(descripcion);
    };


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
