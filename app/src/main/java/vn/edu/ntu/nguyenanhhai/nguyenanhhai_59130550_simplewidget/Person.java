package vn.edu.ntu.nguyenanhhai.nguyenanhhai_59130550_simplewidget;

import android.text.TextUtils;
import java.util.ArrayList;

public class Person {
  private String name;
  private String birthDate;
  private String gender;
  private ArrayList<String> hobbies;

  // setter
  public void setName(String name) {
    this.name = name;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public void setGender(String gender) {
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
            "Giới tính: " + gender + '\n' +
            "Sở thích: " + TextUtils.join("; ", hobbies);
  }
}
