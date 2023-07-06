package yape.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 *
 * @author Benji
 */
public class FechaHora {

    public static String obtenerFechaHoraActual() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaHoraFormateada = fechaHoraActual.format(formatoFechaHora);
        return fechaHoraFormateada;
    }

    public static int getDia() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getDayOfMonth();
    }

    public static String getDiaSemana() {
        Calendar calendar = Calendar.getInstance();
        String diaSemana = "";
        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                diaSemana = "dom";
                break;
            case 2:
                diaSemana = "lun";
                break;
            case 3:
                diaSemana = "mar";
                break;
            case 4:
                diaSemana = "mier";
                break;
            case 5:
                diaSemana = "jue";
                break;
            case 6:
                diaSemana = "vie";
                break;
            case 7:
                diaSemana = "sab";
                break;
        }
        return diaSemana;
    }

    public static int getAño() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear();
    }

    public static String getHora() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("HH:mm a");
        String fechaHoraFormateada = fechaHoraActual.format(formatoFechaHora);
        return fechaHoraFormateada;
    }
    
    
}
