public class Triangulo extends Figura {

    public double base;
    public double altura;
    public double area;

    public Triangulo(double b, double a) {
        super();
        this.base = b;
        this.altura = a;
        this.areaFigura = this.base*this.altura/2;
        this.area = this.areaFigura;
    }

    public double getArea(){
        return this.area;
    }
}
