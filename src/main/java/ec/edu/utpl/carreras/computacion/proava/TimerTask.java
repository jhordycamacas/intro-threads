package ec.edu.utpl.carreras.computacion.proava;
//Cambio 1 - La clase extiende Thread
public class TimerTask extends Thread {
    private final String name;
    private int seconds;

    public TimerTask(String name, int seconds) {
        super(name); // Se agrega super(name);
        this.name = name;
        this.seconds = seconds;
    }

    @Override // Se agrega Override
    public void run() {
        while(seconds > 0) {
            System.out.printf("%s: %d segundos restantes%n", name, seconds);
            seconds --;
        }
    }
}