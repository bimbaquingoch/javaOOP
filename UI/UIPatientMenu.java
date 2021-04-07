package UI;

import model.AppointmentDoctor;
import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.print.Doc;

public class UIPatientMenu {

  public static void showPatientMenu() {
    int response = 0;
    do {
      System.out.println("\n\n");
      System.out.println("Patient");
      System.out.println("Welcome: " + UIMenu.patientLogged.getName());
      System.out.println("1.- Book an appointment");
      System.out.println("2.- My appointments");
      System.out.println("0.- Logout");

      Scanner sc = new Scanner(System.in);
      response = Integer.valueOf(sc.nextLine());

      switch (response) {
        case 1:
          showBookAppointmentMenu();
          break;
        case 2:
          showPatientMyAppointments();
          break;
        case 0:
          UIMenu.showMenu();
          break;

        default:
          break;
      }

    } while (response != 0);
  }

  private static void showBookAppointmentMenu() {
    int response = 0;
    do {

      System.out.println(":::  Book an appointment");
      System.out.println(":: Select date: ");
      // numeracion de la lista de fechas
      // indice de la fecha que seleccionada
      Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();

      int k = 0;

      for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {

        ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i)
            .getAvailableAppointment();
        Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

        for (int j = 0; j < availableAppointments.size(); j++) {

          k++;
          System.out.println(k + ". " + availableAppointments.get(j).getDate());
          doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
          doctors.put(Integer.valueOf(k), doctorAppointments);

        }

      }

      Scanner sc = new Scanner(System.in);
      int responseDateSelected = Integer.valueOf(sc.nextLine());
      Map<Integer, Doctor> doctorsAvailableSelected = doctors.get(responseDateSelected);
      Integer indexDate = 0;
      Doctor doctorSelected = new Doctor("", "");
      for (Map.Entry<Integer, Doctor> doc : doctorsAvailableSelected.entrySet()) {

        indexDate = doc.getKey();
        doctorSelected = doc.getValue();

      }

      System.out.println(
          doctorSelected.getName() + ". Date:" + doctorSelected.getAvailableAppointment().get(indexDate).getDate()
              + ". time: " + doctorSelected.getAvailableAppointment().get(indexDate).getTime());
      System.out.println("Confirm you're appointment: \n 1. Yes\n 2. Change data");
      response = Integer.valueOf(sc.nextLine());

      if (response == 1) {

        // va la logica de que se ejecute la cita
        UIMenu.patientLogged.addAppointmentDoctors(doctorSelected,
            doctorSelected.getAvailableAppointment().get(indexDate).getDate(),
            doctorSelected.getAvailableAppointment().get(indexDate).getTime());
        showPatientMenu();

      }

    } while (response != 0);
  }

  private static void showPatientMyAppointments() {

    int response = 0;
    do {
      System.out.println(":: My Appointments");

      if (UIMenu.patientLogged.getAppointmentDoctors().size() == 0) {

        System.out.println("Dont have appointments");
        break;

      }

      for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {

        int j = i + 1;
        System.out.println(j + ".- \nDate: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate()
            + "\nTime: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() + "\n Doctor: "
            + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName());

      }

      System.out.println("0.- Return");

    } while (response != 0);

  }

}
