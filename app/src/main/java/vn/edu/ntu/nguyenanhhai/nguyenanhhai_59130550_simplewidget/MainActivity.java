package vn.edu.ntu.nguyenanhhai.nguyenanhhai_59130550_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

  EditText edtName;
  EditText edtBirthDate;
  RadioGroup rdgGender;
  LinearLayout llHobby;
  EditText edtDiffHobby;
  Button btnSubmit;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    addViews();
    addEvents();
  }

  private void addViews() {
    edtName = findViewById(R.id.edtName);
    edtBirthDate = findViewById(R.id.edtBirthDate);
    rdgGender = findViewById(R.id.rdgGender);
    llHobby = findViewById(R.id.llHobby);
    edtDiffHobby = findViewById(R.id.edtDiffHobby);
    btnSubmit = findViewById(R.id.btnSubmit);
  }

  private void addEvents() {
    btnSubmit.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        toast();
      }
    });
  }

  private void toast() {

  }
}
