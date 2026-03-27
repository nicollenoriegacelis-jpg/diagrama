public abstract class Atleta {
    protected String nombre;
    protected int edad;
    protected int horasEntrenamiento;


    public Atleta (String nombre, int edad, int horasEntrenamiento){
        this.nombre = nombre;
        this.edad = edad;
        this.horasEntrenamiento = horasEntrenamiento;
    }

    public void mostrarDatos(){
        System.out.println( " nombre  " + nombre);
        System.out.println( " edad " + edad);
        System.out.println( " horasEntrenamiento  " + horasEntrenamiento);
    }
    public abstract double calcularRendimiento();
}
