package exercicios.main;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class ExercicioQ6 {

	private static Calendar calendar = new GregorianCalendar();

	public static void main(String[] args) {
		int diasDaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana"));
		setDiaSemana(diasDaSemana);

		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		String data[] = df.format(calendar.getTime()).split(",");
		System.out.println(data[0]);
	}

	public static void setDiaSemana(int diasDaSemana) {
		switch (diasDaSemana) {
		case 1:
			calendar.add(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
			break;
		case 2:
			calendar.add(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
			break;
		case 3:
			calendar.add(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
			break;
		case 4:
			calendar.add(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
			break;
		case 5:
			calendar.add(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
			break;
		case 6:
			calendar.add(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
			break;
		case 7:
			calendar.add(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
			break;
		default:
			System.out.println("Dia da semana incorreto: ");
		}
	}
}
