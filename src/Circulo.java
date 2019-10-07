public class Circulo extends Figura {

    public double area;
    public double radio;
    public double pi = 3.1415;

    public Circulo(double r){
        super();
        this.radio = r;
        this.areaFigura = this.radio*this.radio*3.14;
        this.area = this.areaFigura;
    }

    public double getArea(){
        return this.area;
    }
}
