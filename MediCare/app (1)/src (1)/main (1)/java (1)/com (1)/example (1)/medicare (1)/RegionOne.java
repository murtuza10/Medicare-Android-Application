package com.example.medicare;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegionOne extends AppCompatActivity {
    private Button button,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13;
    private Button button14,button15;
    patint myDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region_one);
        myDB=new patint(this);
        button = (Button) findViewById(R.id.button5);
        button1 = (Button) findViewById(R.id.button6);
        button2 = (Button) findViewById(R.id.button3);
        button3 = (Button) findViewById(R.id.button7);
        button4 = (Button) findViewById(R.id.button2);
        button5 = (Button) findViewById(R.id.button8);
        button6 = (Button) findViewById(R.id.button);
        button7 = (Button) findViewById(R.id.button4);
        button8 = (Button) findViewById(R.id.button9);
        button9 = (Button) findViewById(R.id.button10);
        button10 = (Button) findViewById(R.id.button11);
        button11 = (Button) findViewById(R.id.button12);
        button12 = (Button) findViewById(R.id.button13);
        button13 = (Button) findViewById(R.id.button14);
        button14 = (Button) findViewById(R.id.button15);
        button15 = (Button) findViewById(R.id.button16);
        viewAll();

    }


    public void viewAll(){
        button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getR1S1();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(1)+"\n");
                            buffer.append("Doctor: "+ res.getString(2)+"\n");
                            buffer.append("Speciality: "+ res.getString(3)+"\n");
                            buffer.append("Area: "+ res.getString(4)+"\n");
                            buffer.append("Phone No: "+ res.getString(5)+"\n\n");
                        }

                        //Show all data
                        showMessage("Doctors",buffer.toString());
                    }
                }
        );

        button1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getR1S2();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(1)+"\n");
                            buffer.append("Doctor: "+ res.getString(2)+"\n");
                            buffer.append("Speciality: "+ res.getString(3)+"\n");
                            buffer.append("Area: "+ res.getString(4)+"\n");
                            buffer.append("Phone No: "+ res.getString(5)+"\n\n");

                        }

                        //Show all data
                        showMessage("Doctors",buffer.toString());
                    }
                }
        );

        button2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getR1S3();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(1)+"\n");
                            buffer.append("Doctor: "+ res.getString(2)+"\n");
                            buffer.append("Speciality: "+ res.getString(3)+"\n");
                            buffer.append("Area: "+ res.getString(4)+"\n");
                            buffer.append("Phone No: "+ res.getString(5)+"\n\n");

                        }

                        //Show all data
                        showMessage("Doctors",buffer.toString());
                    }
                }
        );

        button3.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getR1S4();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(1)+"\n");
                            buffer.append("Doctor: "+ res.getString(2)+"\n");
                            buffer.append("Speciality: "+ res.getString(3)+"\n");
                            buffer.append("Area: "+ res.getString(4)+"\n");
                            buffer.append("Phone No: "+ res.getString(5)+"\n\n");

                        }

                        //Show all data
                        showMessage("Doctors",buffer.toString());
                    }
                }
        );

        button4.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getR1S5();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(1)+"\n");
                            buffer.append("Doctor: "+ res.getString(2)+"\n");
                            buffer.append("Speciality: "+ res.getString(3)+"\n");
                            buffer.append("Area: "+ res.getString(4)+"\n");
                            buffer.append("Phone No: "+ res.getString(5)+"\n\n");

                        }

                        //Show all data
                        showMessage("Doctors",buffer.toString());
                    }
                }
        );

        button5.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getR1S6();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(1)+"\n");
                            buffer.append("Doctor: "+ res.getString(2)+"\n");
                            buffer.append("Speciality: "+ res.getString(3)+"\n");
                            buffer.append("Area: "+ res.getString(4)+"\n");
                            buffer.append("Phone No: "+ res.getString(5)+"\n\n");

                        }

                        //Show all data
                        showMessage("Doctors",buffer.toString());
                    }
                }
        );

        button6.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getR1S7();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(1)+"\n");
                            buffer.append("Doctor: "+ res.getString(2)+"\n");
                            buffer.append("Speciality: "+ res.getString(3)+"\n");
                            buffer.append("Area: "+ res.getString(4)+"\n");
                            buffer.append("Phone No: "+ res.getString(5)+"\n\n");

                        }

                        //Show all data
                        showMessage("Doctors",buffer.toString());
                    }
                }
        );

        button7.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getR1S8();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(1)+"\n");
                            buffer.append("Doctor: "+ res.getString(2)+"\n");
                            buffer.append("Speciality: "+ res.getString(3)+"\n");
                            buffer.append("Area: "+ res.getString(4)+"\n");
                            buffer.append("Phone No: "+ res.getString(5)+"\n\n");

                        }

                        //Show all data
                        showMessage("Doctors",buffer.toString());
                    }
                }
        );

        button8.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getR1S9();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(1)+"\n");
                            buffer.append("Doctor: "+ res.getString(2)+"\n");
                            buffer.append("Speciality: "+ res.getString(3)+"\n");
                            buffer.append("Area: "+ res.getString(4)+"\n");
                            buffer.append("Phone No: "+ res.getString(5)+"\n\n");

                        }

                        //Show all data
                        showMessage("Doctors",buffer.toString());
                    }
                }
        );

        button9.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getR1S10();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(1)+"\n");
                            buffer.append("Doctor: "+ res.getString(2)+"\n");
                            buffer.append("Speciality: "+ res.getString(3)+"\n");
                            buffer.append("Area: "+ res.getString(4)+"\n");
                            buffer.append("Phone No: "+ res.getString(5)+"\n\n");

                        }

                        //Show all data
                        showMessage("Doctors",buffer.toString());
                    }
                }
        );

        button10.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getR1S11();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(1)+"\n");
                            buffer.append("Doctor: "+ res.getString(2)+"\n");
                            buffer.append("Speciality: "+ res.getString(3)+"\n");
                            buffer.append("Area: "+ res.getString(4)+"\n");
                            buffer.append("Phone No: "+ res.getString(5)+"\n\n");

                        }

                        //Show all data
                        showMessage("Doctors",buffer.toString());
                    }
                }
        );

        button11.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getR1S12();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(1)+"\n");
                            buffer.append("Doctor: "+ res.getString(2)+"\n");
                            buffer.append("Speciality: "+ res.getString(3)+"\n");
                            buffer.append("Area: "+ res.getString(4)+"\n");
                            buffer.append("Phone No: "+ res.getString(5)+"\n\n");

                        }

                        //Show all data
                        showMessage("Doctors",buffer.toString());
                    }
                }
        );

        button12.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getR1S13();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(1)+"\n");
                            buffer.append("Doctor: "+ res.getString(2)+"\n");
                            buffer.append("Speciality: "+ res.getString(3)+"\n");
                            buffer.append("Area: "+ res.getString(4)+"\n");
                            buffer.append("Phone No: "+ res.getString(5)+"\n\n");

                        }

                        //Show all data
                        showMessage("Doctors",buffer.toString());
                    }
                }
        );

        button13.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getR1S14();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(1)+"\n");
                            buffer.append("Doctor: "+ res.getString(2)+"\n");
                            buffer.append("Speciality: "+ res.getString(3)+"\n");
                            buffer.append("Area: "+ res.getString(4)+"\n");
                            buffer.append("Phone No: "+ res.getString(5)+"\n\n");

                        }

                        //Show all data
                        showMessage("Doctors",buffer.toString());
                    }
                }
        );

        button14.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getR1S15();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(1)+"\n");
                            buffer.append("Doctor: "+ res.getString(2)+"\n");
                            buffer.append("Speciality: "+ res.getString(3)+"\n");
                            buffer.append("Area: "+ res.getString(4)+"\n");
                            buffer.append("Phone No: "+ res.getString(5)+"\n\n");

                        }

                        //Show all data
                        showMessage("Doctors",buffer.toString());
                    }
                }
        );

        button15.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Cursor res= myDB.getR1S16();
                        if(res.getCount() == 0){

                            showMessage("Error","No Data Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext ()) {
                            buffer.append("Clinic/Hospital: "+ res.getString(1)+"\n");
                            buffer.append("Doctor: "+ res.getString(2)+"\n");
                            buffer.append("Speciality: "+ res.getString(3)+"\n");
                            buffer.append("Area: "+ res.getString(4)+"\n");
                            buffer.append("Phone No: "+ res.getString(5)+"\n\n");

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
