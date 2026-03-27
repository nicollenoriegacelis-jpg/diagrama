public class ciclista extends Atleta implements evaluable{

    private double kilometrosRecorridos;
    private double tiempoHoras;

    public ciclista (String nombre, int edad, int horasEntrenamiento,double KilometrosRecorridos, double tiempoHoras){
        super();

    }
    @Override
    public double calcularRendimiento() {
        return 0;
    }

    @Override
    public String clasificarNivel() {
        return "";
    }

    @Override
    public double calcularBono() {
        return 0;
    }
}
