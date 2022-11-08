package pipipilas;

public class Caja {

    private double altura, ancho, largo;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public Caja(double altura, double ancho, double largo) {
        this.altura = altura;
        this.ancho = ancho;
        this.largo = largo;
    }

    public Caja() {
        this.altura = 1;
        this.ancho = 1;
        this.largo = 1;
    }

    public Caja(Caja cajita) {
        cajita.altura = this.altura;
        cajita.ancho = this.ancho;
    }

    public double volumen() {
        double volumen = getLargo() * getAncho() * getAltura();
        return volumen;
    }

    public double areaTotal() {
        double areaTotal = (getLargo() * getAltura()) + (getAncho() * getLargo());
        return areaTotal;
    }

    public double perTotal() {
        double perTotal = (getAncho() + getAncho() + getAltura() + getAltura()) + (getAncho() + getAncho() + getLargo() + getLargo());
        return perTotal;
    }

    @Override
    public boolean equals(Object objetito) {
        if (this == objetito) {
            return true;
        }
        if (objetito == null) {
            return false;
        }
        if (getClass() != objetito.getClass()) {
            return false;
        }
        final Caja o = (Caja) objetito;
        return (Double.doubleToLongBits(this.altura) == Double.doubleToLongBits(o.altura) && Double.doubleToLongBits(this.ancho) == Double.doubleToLongBits(o.ancho) && Double.doubleToLongBits(this.largo) == Double.doubleToLongBits(o.largo)) ? true : false;

    }

    @Override
    public String toString() {
        return "Altura: " + this.altura + ", Ancho: " + this.ancho + ", Largo: " + this.largo ;
    }   
}
