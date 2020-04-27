package vn.edu.ntu.nguyenanhhai.nguyenanhhai_59130550_simplewidget;

import android.text.TextUtils;
import java.util.ArrayList;

public class Person {
  private String name;
  private String birthDate;
  private boolean gender;
  private ArrayList<String> hobbies;

  // constructor
  public Person() {
    this.name = "";
    this.birthDate = "";
    this.gender = true;
    this.hobbies = new ArrayList<>();
  }

  // setter
  public void setName(String name) {
    this.name = name;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public void setGender(boolean gender) {
    this.gender = gender;
  }

  public void setHobbies(ArrayList<String> hobbies) {
    this.hobbies = hobbies;
  }

  // add a hobby to the hobbies
  public void addHobby(String hobby) {
    hobbies.add(hobby);
  }

  // toString Person
  @Override
  public String toString() {
    return name + '\n' +
            "Ngày sinh: " + birthDate + '\n' +
            "Giới tính: " + (gender ? "Nam" : "Nữ") + '\n' +
            "Sở thích: " + TextUtils.join("; ", hobbies);
  }
}
