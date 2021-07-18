package com.example.medicare;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoctorActivity extends AppCompatActivity {
    private Button button;
    patint myDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
        myDB=new patint(this);
        button = (Button) findViewById(R.id.button);
        Cursor res= myDB.getAllData();
        if(res.getCount() == 0) {
            AddData();
        }
        viewAll();

    }

    public void AddData() {
                myDB.insertdata("Sainath Hospital", "Dr. S.K.Mangade", "Ophthalmology","Dhankawadi","020 24366278");
                myDB.insertdata("Manas Hospital", "Dr. Manoj Katariya", "Family Physician","Dhankawadi","020 24369663");
                myDB.insertdata("Modi Clinic", "Dr.Manavir Modi", "Chest","Dhankawadi","020 2436 4047");
                myDB.insertdata("Prerna Nursing Home", "Dr.Vikas Khare", "Physiotherapy","Dhankawadi","020 2437 1414");
                myDB.insertdata("Samarth Nursing Home", "Dr.Amit Paliwal", "Gynaecologist","Dhankawadi","020 7117 7307");
                /*myDB.insertdata("Shree Sai Vinayak Clinic", "Dr. Mallikarjun S Ballur", "Family Physician","Dhankawadi");
                myDB.insertdata("Shirolkar Clinic", "Dr.Shirolkar Dhananjay", "Family Physician","Dhankawadi");
                myDB.insertdata("Siddhi Hospital & Laparoscopy Center Pvt. Ltd", "Dr.Sharad Kamble", "Family Physician","Dhankawadi");
                myDB.insertdata("Shivprasad Clinic", "Dr.Mahesh Karwa", "Family Physician","Dhankawadi");
                myDB.insertdata("Sutar Hospital", "Dr.J.N.Sutar", "Multi Speciality","Kothrud");
                myDB.insertdata("Kulkarni Endosurgery Institute", "Dr.Kulkarni", "Endosurgery","Kothrud");
                myDB.insertdata("Shashwat Hospital", "Dr.P.S.Karmarkar", "Multi Speciality","Kothrud");
                myDB.insertdata("Deenanath Mangeshkar Hospital", "Multiple Doctors", "Multi Speciality","Kothrud");
                myDB.insertdata("Sahyadri Hospital", "Multiple Doctorsa", "Multi Speciality","Kothrud");
                myDB.insertdata("Somani Cardiac and Gynec Center", "Dr. Abhay Somani", "Cardiologist","Kothrud");
                myDB.insertdata("Krishna Hospital", "Dr. Rajesh Dhopeshwarkar", "Cardiologist","Kothrud");
                myDB.insertdata("SHANTI NURSING HOME", "Dr. Sameer Bele", "Cardiologist","Kothrud");
                myDB.insertdata("Cardiomet Clinic", "Dr. Abhijeet Palshikar", "Cardiologist","Kothrud");
                myDB.insertdata("PanPrtho Hospital", "Multiple Doctors", "Multi Speciality","Nigdi");
                myDB.insertdata("Sterling Hospital", "Multiple Doctors", "Multi Speciality","Nigdi");
                myDB.insertdata("Kartik Hospital", "Dr.Jagdish Dhekane", "Pediatrics","Nigdi");
                myDB.insertdata("Lokmanya Hospltal", "Multiple Doctors", "Multi Speciality","Nigdi");
                myDB.insertdata("GuruKrupa Clinic", "Dr.Pravin Ghadge", "Surgeon","Nigdi");
                myDB.insertdata("Apollo Clinic", "Dr. Blessy Jacob", "Ophthalmology","Nigdi");
                myDB.insertdata("Bindu Speciality Clinic", "Dr. Sujay Naik", "Ophthalmology","Nigdi");
                myDB.insertdata("Advait Hospital", "Dr. Vaibhav Kanse", "Ophthalmology","Nigdi");
                myDB.insertdata("Apollo Clinic", "Dr. Shilpy Dolas", "Surgeon","Nigdi");
                myDB.insertdata("Apollo Clinic", "Dr. KANCHAN INGLE WAYKOLE", "Surgeon","Nigdi");
                myDB.insertdata("Dr.Bhise Clinic", "Dr. Kiran Bhise", "Surgeon","Nigdi");
                myDB.insertdata("Gandhi Nursing Home", "Dr. Nitin K Gandhi", "Surgeon","Nigdi");*/
        }



    public void viewAll(){
        button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getAllData();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(0)+"\n");
                            buffer.append("Doctor: "+ res.getString(1)+"\n");
                            buffer.append("Speciality: "+ res.getString(2)+"\n");
                            buffer.append("Area: "+ res.getString(3)+"\n\n");

                        }

                        //Show all data
                        showMessage("Doctors",buffer.toString());
                    }
                }
        );
    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder =  new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
    }


