import java.util.Arrays;
public interface GestorFiguras {

    public static void sumaAreas(Figura[] l) {
        double areaTotal = 0;
        for (Figura f : l) { //"por cada f que hay en l"
            //double prueba = f.getAreaFigura();
            //System.out.println("esta es la prueba " +prueba);
            areaTotal += f.getAreaFigura();
        }
        System.out.println("La suma de todas las areas es: " + areaTotal);
    }

    public static void sort(Figura[] l) {
        Arrays.sort(l);//Metodo de una libreria de JAVA que ordena de mayor a menor
        System.out.println(Arrays.asList(l));
    }
}
