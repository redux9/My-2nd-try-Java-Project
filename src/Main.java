public class Main {
    public static void main(String[] args) {

        //Definimos los valores de los atributos de las figuras
        double radio = 6;
        double lado1 = 2;
        double lado2 = 3;
        double base = 4;
        double altura = 5;

        //Creamos las figuras
        Figura c = new Circulo(radio);
        Figura r = new Rectangulo(lado1, lado2);
        Figura t = new Triangulo(base, altura);
        Figura k = new Cuadrado(lado1);

        //Creamos un vector de  figuras y lo rellenamos
        Figura[] vectorFiguras = new Figura[10];
        vectorFiguras[0] = c;
        vectorFiguras[1] = r;
        vectorFiguras[2] = t;
        vectorFiguras[3] = k;

        //Printamos en consola el resultado de las areas
        System.out.println("Area del círculo: " + vectorFiguras[0].getAreaFigura());
        System.out.println("Area del rectángulo: " + vectorFiguras[1].getAreaFigura());
        System.out.println("Area del triángulo: " + vectorFiguras[2].getAreaFigura());
        System.out.println("Area del cuadrado: " + vectorFiguras[3].getAreaFigura());
    }
}
