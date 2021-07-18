package com.example.medicare;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class patint extends SQLiteOpenHelper {
    public static final String Database_name="Doctor.db";
    public static final String Table_name="Clinic_table";
    public static final String col0="ID";
    public static final String col1="Clinic";
    public static final String col2="Doctor";
    public static final String col3="Speciality";
    public static final String col4="Area";
    public static final String col5="Phone";

    public patint(Context context) {
        super(context,Database_name,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" create table " + Table_name + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,Clinic TEXT,Doctor TEXT,Speciality TEXT,Area TEXT,Phone INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL(" DROP TABLE IF EXISTS "+Table_name);
        onCreate(db);
    }
    public boolean insertdata(String clin,String doct,String spec,String area,String phone)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(col1,clin);
        contentValues.put(col2,doct);
        contentValues.put(col3,spec);
        contentValues.put(col4,area);
        contentValues.put(col5,phone);
        long result=db.insert(Table_name,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public Cursor getAllData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + Table_name,null);
        return res;

    }
    String spec1="Ophthalmology";
    String spec9="Dentist";
    String spec10="Dietitian";
    String spec11="Orthopaedic";
    String spec12="Pediatrician";
    String spec13="Gastroenterologist";
    String spec14="Ayurveda";
    String spec15="Dermatologist";
    String spec16="Diabetologist";
    String area="Nigdi";
    String area4="Kondhwa";


    public Cursor getR1S1(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec1 + "' AND Area='" + area +"'",null);
        return res;
    }

    String spec2="General Physician";


    public Cursor getR1S2(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec2 + "' AND Area='" + area +"'",null);
        return res;
    }

    String spec3="Cardiologist";


    public Cursor getR1S3(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec3 + "' AND Area='" + area +"'",null);
        return res;
    }

    String spec4="Physiotherapy";


    public Cursor getR1S4(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec4 + "' AND Area='" + area +"'",null);
        return res;
    }

    String spec5="Endocrinologist";


    public Cursor getR1S5(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec5 + "' AND Area='" + area +"'",null);
        return res;
    }

    String spec6="Gynaecologist";


    public Cursor getR1S6(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec6 + "' AND Area='" + area +"'",null);
        return res;
    }

    String spec7="Surgeon";


    public Cursor getR1S7(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec7 + "' AND Area='" + area +"'",null);
        return res;
    }

    String spec8="Multi Speciality";


    public Cursor getR1S8(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec8 + "' AND Area='" + area +"'",null);
        return res;
    }

    public Cursor getR1S9(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec9 + "' AND Area='" + area +"'",null);
        return res;
    }

    public Cursor getR1S10(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec10 + "' AND Area='" + area +"'",null);
        return res;
    }

    public Cursor getR1S11(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec11 + "' AND Area='" + area +"'",null);
        return res;
    }

    public Cursor getR1S12(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec12 + "' AND Area='" + area +"'",null);
        return res;
    }

    public Cursor getR1S13(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec13 + "' AND Area='" + area +"'",null);
        return res;
    }

    public Cursor getR1S14(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec14 + "' AND Area='" + area +"'",null);
        return res;
    }

    public Cursor getR1S15(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec15 + "' AND Area='" + area +"'",null);
        return res;
    }

    public Cursor getR1S16(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec16 + "' AND Area='" + area +"'",null);
        return res;
    }

    String area2="Dhankawadi";


    public Cursor getR2S1(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec1 + "' AND Area='" + area2 +"'",null);
        return res;
    }


    public Cursor getR2S2(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec2 + "' AND Area='" + area2 +"'",null);
        return res;
    }



    public Cursor getR2S3(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec3 + "' AND Area='" + area2 +"'",null);
        return res;
    }



    public Cursor getR2S4(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec4 + "' AND Area='" + area2 +"'",null);
        return res;
    }



    public Cursor getR2S5(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec5 + "' AND Area='" + area2 +"'",null);
        return res;
    }




    public Cursor getR2S6(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec6 + "' AND Area='" + area2 +"'",null);
        return res;
    }


    public Cursor getR2S7(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec7 + "' AND Area='" + area2 +"'",null);
        return res;
    }



    public Cursor getR2S8(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec8 + "' AND Area='" + area2 +"'",null);
        return res;
    }

    public Cursor getR2S9(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec9 + "' AND Area='" + area2 +"'",null);
        return res;
    }

    public Cursor getR2S10(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec10 + "' AND Area='" + area2 +"'",null);
        return res;
    }

    public Cursor getR2S11(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec11 + "' AND Area='" + area2 +"'",null);
        return res;
    }

    public Cursor getR2S12(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec12 + "' AND Area='" + area2 +"'",null);
        return res;
    }

    public Cursor getR2S13(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec13 + "' AND Area='" + area2 +"'",null);
        return res;
    }

    public Cursor getR2S14(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec14 + "' AND Area='" + area2 +"'",null);
        return res;
    }

    public Cursor getR2S15(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec15 + "' AND Area='" + area2 +"'",null);
        return res;
    }

    public Cursor getR2S16(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec16 + "' AND Area='" + area2 +"'",null);
        return res;
    }

    String area3="Kothrud";

    public Cursor getR3S1(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec1 + "' AND Area='" + area3 +"'",null);
        return res;
    }



    public Cursor getR3S2(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec2 + "' AND Area='" + area3 +"'",null);
        return res;
    }



    public Cursor getR3S3(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec3 + "' AND Area='" + area3 +"'",null);
        return res;
    }



    public Cursor getR3S4(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec4 + "' AND Area='" + area3 +"'",null);
        return res;
    }



    public Cursor getR3S5(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec5 + "' AND Area='" + area3 +"'",null);
        return res;
    }



    public Cursor getR3S6(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec6 + "' AND Area='" + area3 +"'",null);
        return res;
    }



    public Cursor getR3S7(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec7 + "' AND Area='" + area3 +"'",null);
        return res;
    }


    public Cursor getR3S8(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec8 + "' AND Area='" + area3 +"'",null);
        return res;
    }

    public Cursor getR3S9(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec9 + "' AND Area='" + area3 +"'",null);
        return res;
    }

    public Cursor getR3S10(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec10 + "' AND Area='" + area3 +"'",null);
        return res;
    }

    public Cursor getR3S11(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec11 + "' AND Area='" + area3 +"'",null);
        return res;
    }

    public Cursor getR3S12(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec12 + "' AND Area='" + area3 +"'",null);
        return res;
    }

    public Cursor getR3S13(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec13 + "' AND Area='" + area3 +"'",null);
        return res;
    }

    public Cursor getR3S14(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec14 + "' AND Area='" + area3 +"'",null);
        return res;
    }

    public Cursor getR3S15(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec15 + "' AND Area='" + area3 +"'",null);
        return res;
    }

    public Cursor getR3S16(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec16 + "' AND Area='" + area3 +"'",null);
        return res;
    }

    public Cursor getR4S1(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec1 + "' AND Area='" + area4 +"'",null);
        return res;
    }

    public Cursor getR4S2(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec2 + "' AND Area='" + area4 +"'",null);
        return res;
    }

    public Cursor getR4S3(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec3 + "' AND Area='" + area4 +"'",null);
        return res;
    }

    public Cursor getR4S4(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec4 + "' AND Area='" + area4 +"'",null);
        return res;
    }

    public Cursor getR4S5(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec5 + "' AND Area='" + area4 +"'",null);
        return res;
    }

    public Cursor getR4S6(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec6 + "' AND Area='" + area4 +"'",null);
        return res;
    }

    public Cursor getR4S7(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec7 + "' AND Area='" + area4 +"'",null);
        return res;
    }

    public Cursor getR4S8(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec8 + "' AND Area='" + area4 +"'",null);
        return res;
    }

    public Cursor getR4S9(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec9 + "' AND Area='" + area4 +"'",null);
        return res;
    }

    public Cursor getR4S10(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec10 + "' AND Area='" + area4 +"'",null);
        return res;
    }

    public Cursor getR4S11(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec11 + "' AND Area='" + area4 +"'",null);
        return res;
    }

    public Cursor getR4S12(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec12 + "' AND Area='" + area4 +"'",null);
        return res;
    }

    public Cursor getR4S13(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec13 + "' AND Area='" + area4 +"'",null);
        return res;
    }

    public Cursor getR4S14(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec14 + "' AND Area='" + area4 +"'",null);
        return res;
    }

    public Cursor getR4S15(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec15 + "' AND Area='" + area4 +"'",null);
        return res;
    }

    public Cursor getR4S16(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Clinic_table WHERE Speciality='" + spec16 + "' AND Area='" + area4 +"'",null);
        return res;
    }






}
