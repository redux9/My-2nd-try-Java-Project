public class Rectangulo extends Figura {
    public double lado1;
    public double lado2;
    public double area;

    public Rectangulo(double l1, double l2){
        super();
        this.lado1 = l1;
        this.lado2 = l2;
        this.areaFigura = this.lado1 * this.lado2;
        this.area = this.areaFigura;
    }

    public double getArea(){
        return this.area;
    }

}
