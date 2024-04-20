public class teléfono extends artículos_comunes implements Obtener_precio,Descripción{


    private int camaraMegaPixceles;
    private int cantidadDeLentesDeCamara;
    public teléfono(String name, int precio, String modelo,String descripcion,int camaraMegaPixceles,int cantidadDeLentesDeCamara)
    {
        super(name, modelo, precio, descripcion);
        setCamaraMegaPixceles(camaraMegaPixceles);
        setCantidadDeLentesDeCamara(cantidadDeLentesDeCamara);
    }
    public void descripcion(String descripcion)
    {
        System.out.println(descripcion);
    }
    public double precio(double precio)
    {
        return precio;
    }

    public int getCamaraMegaPixceles() {
        return camaraMegaPixceles;
    }

    public void setCamaraMegaPixceles(int camaraMegaPixceles) {
        this.camaraMegaPixceles = camaraMegaPixceles;
    }

    public int getCantidadDeLentesDeCamara() {
        return cantidadDeLentesDeCamara;
    }

    public void setCantidadDeLentesDeCamara(int cantidadDeLentesDeCamara) {
        this.cantidadDeLentesDeCamara = cantidadDeLentesDeCamara;
    }
}
