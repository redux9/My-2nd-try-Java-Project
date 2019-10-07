import java.util.Arrays;

public interface GestorFiguras {

    public static void sumaAreas(Figura[] l) {
        double areaTotal = 0;
        for (Figura f : l) { //"por cada f que hay en l"
            areaTotal += f.getAreaFigura();
        }
        System.out.println("La suma de todas las areas es: " + areaTotal);
    }

    public static void sort(Figura[] l) {
        Arrays.sort(l);//Metodo de una libreria de JAVA que ordena de menor a mayor
        System.out.println(Arrays.asList(l));
    }
}
