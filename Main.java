import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

import static UI.UIMenu.showMenu;

public class Main {

  public static void main(String[] args) {

    showMenu();
//    Doctor myDoctor = new Doctor("Main Intriago", "Psicología");
//
//    myDoctor.addAvailableAppointment(new Date(), "4pm");
//    myDoctor.addAvailableAppointment(new Date(), "6pm");
//    myDoctor.addAvailableAppointment(new Date(), "1pm");
//
//    // imprime los objetos, no los datos del objeto
//    // System.out.println(myDoctor.getAvailableAppointment());
//    System.out.println(myDoctor);
//    User user = new Doctor("Carlos", "carlos@carlos.com");
//    user.showDataUser();
//    User userPa = new Patient("Esteban", "esteban@gmail.com");
//    userPa.showDataUser();
//
//    // esto son las clases anonimas
//    User user1 = new User("Yisus", "yisus@gmail.com") {
//
//      @Override
//      public void showDataUser() {
//        // TODO Auto-generated method stub
//        System.out.println("Doctor");
//        System.out.println("Hospital Cruz Verde");
//        System.out.println("Departamento: Otorrinología");
//
//      }
//
//    };
//    user1.showDataUser();
//    ISchedulable isSchedulable = new ISchedulable() {
//      @Override
//      public void schedule(Date date, String time) {
//        // TODO Auto-generated method stub
//
//      }
//
//    };
    // clases anonimas

//    for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointment()) {
//      System.out.println(aA.getDate() + " " + aA.getTime());
//
//    }
//
//    System.out.println("\n");
//    Patient patient = new Patient("Bryan", "bryan@mail.com");
//
//    System.out.println(patient);

    // System.out.println(patient.name);
    // System.out.println(patient.email);

    // aquí existe un problema, las cantidades estamos asumiendo que son
    // representadas
    // con las medidas que estan comentadas, per osi es en otro sistema de medición?
    // que hacemos? AL ser de tipo double no me deja darle ningun formato
    // ******* esto se soluciona con el encapsulamiento de datos ******

    /*
     * patient.weight = 65.8; // KG? patient.height = 1.72; // m ?
     * 
     * System.out.println(patient.weight); System.out.println(patient.height);
     * 
     * /* en el futuro se puede editar los valores del objeto y eso crea
     * inconsistencias
     * 
     * 
     * patient.weight = 55.6; patient.name = "Carlos Adrian";
     */
    /**
     * estoy alterando la inconsistencia de los datos tambien el peso y la altura la
     * ser de tipo double no me deja añadir alguna parametriazaión para las medidas
     */

    /**
     * Solucion para que no se dé ===== revisar las notas debemos tener definido el
     * standart de las unidades (en este ejemplo) en la clase se declararon como
     * privadas las variables de peso y altura por el nivel de acceso de private
     * ahora no se pude modificar desde aquí.
     * 
     */

  }

}
