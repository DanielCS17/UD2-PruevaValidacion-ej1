import com.ejercicio1.resources.MediaNotas;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        final int NUM_CALIFICATIONS = 100000;

        List<Integer> califications = new ArrayList<>();

        for (int i = 0; i < NUM_CALIFICATIONS; i++) {
            int randomCalification = (int) (Math.random() * 10);
            califications.add(randomCalification);
        }

        MediaNotas hilo1 = new MediaNotas(1, 0, 9999, califications);
        MediaNotas hilo2 = new MediaNotas(2, 10000, 19999, califications);
        MediaNotas hilo3 = new MediaNotas(3, 20000, 29999, califications);
        MediaNotas hilo4 = new MediaNotas(4, 30000, 39999, califications);
        MediaNotas hilo5 = new MediaNotas(5, 40000, 49999, califications);
        MediaNotas hilo6 = new MediaNotas(6, 50000, 59999, califications);
        MediaNotas hilo7 = new MediaNotas(7, 60000, 69999, califications);
        MediaNotas hilo8 = new MediaNotas(8, 70000, 79999, califications);
        MediaNotas hilo9 = new MediaNotas(9, 80000, 89999, califications);
        MediaNotas hilo10 = new MediaNotas(10, 90000, 99999, califications);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();
        hilo8.start();
        hilo9.start();
        hilo10.start();

        hilo1.join();
        hilo2.join();
        hilo3.join();
        hilo4.join();
        hilo5.join();
        hilo6.join();
        hilo7.join();
        hilo8.join();
        hilo9.join();
        hilo10.join();

        System.out.println("El hilo " + hilo1.getNumeroHilo() + " que empezó en el índice " + hilo1.getIndiceInicial() +
                " y ha contado " + hilo1.getNotasSumadas() + ", ha sumado un total de: " + hilo1.getSumaNotas());

        System.out.println("El hilo " + hilo2.getNumeroHilo() + " que empezó en el índice " + hilo2.getIndiceInicial() +
                " y ha contado " + hilo2.getNotasSumadas() + ", ha sumado un total de: " + hilo2.getSumaNotas());

        System.out.println("El hilo " + hilo3.getNumeroHilo() + " que empezó en el índice " + hilo3.getIndiceInicial() +
                " y ha contado " + hilo3.getNotasSumadas() + ", ha sumado un total de: " + hilo3.getSumaNotas());

        System.out.println("El hilo " + hilo4.getNumeroHilo() + " que empezó en el índice " + hilo4.getIndiceInicial() +
                " y ha contado " + hilo4.getNotasSumadas() + ", ha sumado un total de: " + hilo4.getSumaNotas());

        System.out.println("El hilo " + hilo5.getNumeroHilo() + " que empezó en el índice " + hilo5.getIndiceInicial() +
                " y ha contado " + hilo5.getNotasSumadas() + ", ha sumado un total de: " + hilo5.getSumaNotas());

        System.out.println("El hilo " + hilo6.getNumeroHilo() + " que empezó en el índice " + hilo6.getIndiceInicial() +
                " y ha contado " + hilo6.getNotasSumadas() + ", ha sumado un total de: " + hilo6.getSumaNotas());

        System.out.println("El hilo " + hilo7.getNumeroHilo() + " que empezó en el índice " + hilo7.getIndiceInicial() +
                " y ha contado " + hilo7.getNotasSumadas() + ", ha sumado un total de: " + hilo7.getSumaNotas());

        System.out.println("El hilo " + hilo8.getNumeroHilo() + " que empezó en el índice " + hilo8.getIndiceInicial() +
                " y ha contado " + hilo8.getNotasSumadas() + ", ha sumado un total de: " + hilo8.getSumaNotas());

        System.out.println("El hilo " + hilo9.getNumeroHilo() + " que empezó en el índice " + hilo9.getIndiceInicial() +
                " y ha contado " + hilo9.getNotasSumadas() + ", ha sumado un total de: " + hilo9.getSumaNotas());

        System.out.println("El hilo " + hilo10.getNumeroHilo() + " que empezó en el índice " + hilo10.getIndiceInicial() +
                " y ha contado " + hilo10.getNotasSumadas() + ", ha sumado un total de: " + hilo10.getSumaNotas());

        float totalSumNotas = 0;

        totalSumNotas += hilo1.getSumaNotas();
        totalSumNotas += hilo2.getSumaNotas();
        totalSumNotas += hilo3.getSumaNotas();
        totalSumNotas += hilo4.getSumaNotas();
        totalSumNotas += hilo5.getSumaNotas();
        totalSumNotas += hilo6.getSumaNotas();
        totalSumNotas += hilo7.getSumaNotas();
        totalSumNotas += hilo8.getSumaNotas();
        totalSumNotas += hilo9.getSumaNotas();
        totalSumNotas += hilo10.getSumaNotas();

        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formatoDecimales = new DecimalFormat("#.00", separadoresPersonalizados);

        float media = totalSumNotas / 100000;
        System.out.println("La media aritmética es de " + formatoDecimales.format(media));
    }
}
