import org.junit.Assert;
import org.junit.Test;

public class TestFiguras {

    //Definimos los valores de los atributos de las figuras
    double radio = 6;
    double lado1 = 2;
    double lado2 = 3;
    double base = 4;
    double altura = 5;
    //Figura[] vectorFiguras = null;

    @Test
    public void setUp() {
        //Creamos las figuras
        Figura c = new Circulo(this.radio);
        Figura r = new Rectangulo(this.lado1, this.lado2);
        Figura t = new Triangulo(this.base, this.altura);
        Figura k = new Cuadrado(lado1);

        //Creamos un vector de  figuras y lo rellenamos
        Figura[] vectorFiguras = new Figura[4];
        vectorFiguras[0] = c;
        vectorFiguras[1] = r;
        vectorFiguras[2] = t;
        vectorFiguras[3] = k;

        //Printamos en consola el resultado de las areas
        System.out.println("Area del círculo: " + vectorFiguras[0].getAreaFigura());
        System.out.println("Area del rectángulo: " + vectorFiguras[1].getAreaFigura());
        System.out.println("Area del triángulo: " + vectorFiguras[2].getAreaFigura());
        System.out.println("Area del cuadrado: " + vectorFiguras[3].getAreaFigura());

        GestorFiguras.sumaAreas(vectorFiguras);
        GestorFiguras.sort(vectorFiguras);
    }
}
