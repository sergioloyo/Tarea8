package umg;

public class producto {
    private int Id;
    private String nombreProducto;
    private double Precio;

    public producto() {
    }

    public producto(int Id, String nombreProducto, double Precio) {
        this.Id = Id;
        this.nombreProducto = nombreProducto;
        this.Precio = Precio;    }


    public boolean menorQue(Object q) {
        producto p = (producto)q;
        return this.Precio < p.Precio;
    }


    public boolean mayorQue(Object q) {
        producto p = (producto)q;
        return this.Precio > p.Precio;
    }

    public boolean menorIgualQue(Object q) {
        producto p = (producto)q;
        return this.Precio <= p.Precio;
    }


    public boolean mayorIgualQue(Object q) {
        producto p = (producto)q;
        return this.Precio >= p.Precio;
    }

    public boolean igualque(Object q) {
        producto p = (producto)q;
        return this.Precio == p.Precio;
    }




}
