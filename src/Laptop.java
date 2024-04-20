public class Laptop extends artículos_comunes implements Descripción,Obtener_precio
{
    private String RGB;
    private int monitorFPS;

    public Laptop(String name, int precio, String modelo,String descripcion,String RGB,int monitorFPS)
    {
        super(name, modelo, precio, descripcion);
        setName(name);
        setPrecio(precio);
        setModelo(modelo);
        setDescripcion(descripcion);
        setRGB(RGB);
        setMonitorFPS(monitorFPS);

    };

    public void descripcion(String descripcion)
    {
    System.out.print(descripcion);
    }

    public double precio(double precio)
    {
        return precio;
    }

    public String getRGB() {
        return RGB;
    }

    public void setRGB(String RGB) {
        this.RGB = RGB;
    }

    public int getMonitorFPS() {
        return monitorFPS;
    }

    public void setMonitorFPS(int monitorFPS) {
        this.monitorFPS = monitorFPS;
    }
}
