package UI;

import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;
import model.Patient;

public class UIMenu {

  public static final String[] MONTHS = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
      "Septiembre", "Octubre", "Noviembre", "Diciembre" };
  public static Doctor doctorLogged;
  public static Patient patientLogged;

  public static void showMenu() {
    System.out.println("Welcome to My Appointments");
    System.out.println("Selecciona la opcion deseada");

    int response = 0;

    do {
      System.out.println("1. Doctor");
      System.out.println("2. Patient");
      System.out.println("0. Salir");

      Scanner sc = new Scanner(System.in);
      response = Integer.valueOf(sc.nextLine());

      switch (response) {
        case 1:
          System.out.println("Doctor");
          response = 0;
          authUser(1);
          break;
        case 2:
          response = 0;
          authUser(2);
          break;
        case 0:
          System.out.println("Thank you for you visit");
          break;
        default:
          System.out.println("Please select a correct answer");
          break;
      }

      sc.close();

    } while (response != 0);

  }

  private static void authUser(int userType) {

    // userType = 1 => Doctor
    // userType =2 => Paciente
    ArrayList<Doctor> doctors = new ArrayList<>();
    doctors.add(new Doctor("Fabricio Gonzalez", "fabricio@mail.com"));
    doctors.add(new Doctor("Erick Gonza", "erick@mail.com"));
    doctors.add(new Doctor("Hugo Mejia", "hugo@mail.com"));

    ArrayList<Patient> patients = new ArrayList<>();
    patients.add(new Patient("Camila Marcillo", "camila@mail.com"));
    patients.add(new Patient("Karen Sanchez", "karen@mail.com"));
    patients.add(new Patient("Liz Araus", "lis@mail.com"));

    boolean emailCorrect = false;

    do {

      System.out.println("Insert your email [tunombre@mail.com]");
      Scanner sc = new Scanner(System.in);
      String email = sc.nextLine();

      if (userType == 1) {

        for (Doctor d : doctors) {
          if (d.getEmail().equals(email)) {

            emailCorrect = true;
            // obtener el usuario logueado
            doctorLogged = d;
            // mostrar el menu del doctor
            UIDoctorMenu.showDoctorMenu();

          }
        }

      }

      if (userType == 2) {

        for (Patient p : patients) {

          if (p.getEmail().equals(email)) {

            emailCorrect = true;
            patientLogged = p;
            // mostrar el menu del paciente

          }

        }

      }

    } while (!emailCorrect);

  }

  public static void showPatientMenu() {
    int response = 0;
    do {
      System.out.println("\n\n");
      System.out.println("Patient");
      System.out.println("1. Book an appointment");
      System.out.println("2. My appointments");
      System.out.println("0. Return");

      Scanner sc = new Scanner(System.in);
      response = Integer.valueOf(sc.nextLine());

      switch (response) {

        case 1:
          System.out.println(":: Book an appointment");

          for (int i = 1; i < 4; i++) {

            System.out.println(i + "." + MONTHS[i]);

          }

          break;
        case 2:
          System.out.println(":: My appointments");
          break;
        case 0:
          showMenu();
          break;

      }

      sc.close();

    } while (response != 0);
  }

}
