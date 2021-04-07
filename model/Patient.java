package model;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

  private String birthday;
  private String blood;
  private double weight;
  private double height;

  private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
  private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

  public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
    return appointmentDoctors;
  }

  public void addAppointmentDoctors(Doctor doctor , Date date, String time) {
    AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this,doctor);
    appointmentDoctor.schedule(date,time);
    appointmentDoctors.add(appointmentDoctor);
  }

  public ArrayList<AppointmentNurse> getAppointmentNurses() {
    return appointmentNurses;
  }

  public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
    this.appointmentNurses = appointmentNurses;
  }

  public Patient(String name, String email) {
    super(name, email);

  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getBlood() {
    return blood;
  }

  public void setBlood(String blood) {
    this.blood = blood;
  }

  public String getHeight() {
    return height + " m.";
  }

  public void setHeight(double height) {
    this.height = height;
  }

  // set recibe un dato
  public void setWeight(double weight) {

    this.weight = weight;

  }

  public String getWeight() {

    return this.weight + " Kg";

  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString() + "\n Age: " + birthday + "\n Weight: " + getWeight() + "\n Height: " + getHeight()
        + "\n Blood: " + blood;
  }

  @Override
  public void showDataUser() {
    System.out.println("Paciente");
    System.out.println("Historial completo desde nacimiento");

  }

}
