package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

  // atributos
  private String speciality;
  // coleccion de objetos de tipo availableAppointments
  private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

  public Doctor(String name, String email) {

    super(name, email);

  }

  public String getSpeciality() {
    return speciality;
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }

  // este es un metodo que añanade todas las nuevas citas en este array
  public void addAvailableAppointment(String date, String time) {

    // cada vez que se añanada una nueva cita se puede crear con esos datos
    availableAppointments.add(new AvailableAppointment(date, time));
    // tambien funciona de esta manera
    // availableAppointments.add(new Doctor.AvailableAppointment(date, time));

  }

  // si quiero devolver los elementos de la lista de citas disponibles
  // se pone así
  public ArrayList<AvailableAppointment> getAvailableAppointment() {
    return availableAppointments;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString() + "\nEpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
  }

  @Override
  public void showDataUser() {
    System.out.println("Empleado del Hospital: Cruz Roja");
    System.out.println("Departamento: Pediatria");

  }

  public static class AvailableAppointment {
    private int id;
    private Date date;
    private String time;
    SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

    public AvailableAppointment(String date, String time) {
      try {
        this.date = format.parse(date);
      } catch (ParseException e) {
        e.printStackTrace();
      }
      this.time = time;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public Date getDate() {
      return date;
    }

    public void setDate(Date date) {
      this.date = date;
    }

    public String getTime() {
      return time;
    }

    public void setTime(String time) {
      this.time = time;
    }

    @Override
    public String toString() {
      // TODO Auto-generated method stub
      return "Available Appointment \nDate: " + date + " \nTime: " + time;
    }

  }

}
