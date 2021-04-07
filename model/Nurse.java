package model;

public class Nurse extends User {

  private String speciallity;

  public Nurse(String name, String email) {
    super(name, email);
  }

  @Override
  public void showDataUser() {

    System.out.println("Empleado del Hospital: Cruz verde");
    System.out.println("Departamentos: Nutriología, Pediatria, Terapia intensiva");

  }

  public String getSpeciallity() {
    return speciallity;
  }

  public void setSpeciallity(String speciallity) {
    this.speciallity = speciallity;
  }
}
