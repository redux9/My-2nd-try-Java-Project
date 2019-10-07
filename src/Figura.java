public abstract class Figura implements Comparable<Figura> { //Al implementar el comparable aquí, todas las figuras serán comparables


    public double areaFigura;

    public Figura() {
    }

    public double getAreaFigura() {
        return this.areaFigura;
    }

    public int compareTo(Figura f) { //El método compareTo es de JAVA
        return ((int)(this.areaFigura-f.getAreaFigura()));
    }

    public String toString() { //Nos da el nombre de la del objeto y el area
        return this.getClass().getSimpleName()+" "+getAreaFigura();
    }
}
