package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Region extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    patint myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region);
        myDB=new patint(this);
        button1=(Button) findViewById(R.id.button10);
        button2=(Button) findViewById(R.id.button11);
        button3=(Button) findViewById(R.id.button12);
        button4=(Button) findViewById(R.id.button9);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegion1();
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegion2();
            }

        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegion3();
            }

        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegion4();
            }

        });
        Cursor res= myDB.getAllData();
        if(res.getCount() == 0) {
            AddData();
        }

    }

    public void AddData() {
        myDB.insertdata("Sainath Hospital", "Dr. S.K.Mangade", "Ophthalmology","Dhankawadi","02024366278");
        myDB.insertdata("Manas Hospital", "Dr. Manoj Katariya", "General Physician","Dhankawadi","020 24369663");
        myDB.insertdata("Modi Clinic", "Dr.Manavir Modi", "Chest","Dhankawadi","020 2436 4047");
        myDB.insertdata("Prerna Nursing Home", "Dr.Vikas Khare", "Physiotherapy","Dhankawadi","020 2437 1414");
        myDB.insertdata("Samarth Nursing Home", "Dr.Amit Paliwal", "Gynaecologist","Dhankawadi","9822632645");
        myDB.insertdata("Shree Sai Vinayak Clinic", "Dr. Mallikarjun S Ballur", "General Physician","Dhankawadi","09922577571");
        myDB.insertdata("Shirolkar Clinic", "Dr.Shirolkar Dhananjay", "General Physician","Dhankawadi","020 24367619");
        myDB.insertdata("Siddhi Hospital & Laparoscopy Center Pvt. Ltd", "Dr.Sharad Kamble", "General Physician","Dhankawadi","020 24365001");
        myDB.insertdata("Shivprasad Clinic", "Dr.Mahesh Karwa", "General Physician","Dhankawadi","9326876190");
        myDB.insertdata("Sutar Hospital", "Dr.J.N.Sutar", "Multi Speciality","Kothrud"," 020 2538 2990");
        myDB.insertdata("Kulkarni Endocrinologist Institute", "Dr.Kulkarni", "Endocrinologist","Kothrud","020 2538 0555");
        myDB.insertdata("Shashwat Hospital", "Dr.P.S.Karmarkar", "Multi Speciality","Kothrud","020 25309900");
        myDB.insertdata("Deenanath Mangeshkar Hospital", "Multiple Doctors", "Multi Speciality","Kothrud","020 4015 1000");
        myDB.insertdata("Sahyadri Hospital", "Multiple Doctorsa", "Multi Speciality","Kothrud","020 6721 3300");
        myDB.insertdata("Somani Cardiac and Gynec Center", "Dr. Abhay Somani", "Cardiologist","Kothrud","9152296124");
        myDB.insertdata("Krishna Hospital", "Dr. Rajesh Dhopeshwarkar", "Cardiologist","Kothrud"," 020 4140 3700");
        myDB.insertdata("SHANTI NURSING HOME", "Dr. Sameer Bele", "General Physician","Kothrud","NA");
        myDB.insertdata("Cardiomet Clinic", "Dr. Abhijeet Palshikar", "Cardiologist","Kothrud","9130058897");
        myDB.insertdata("PanPrtho Hospital", "Multiple Doctors", "Multi Speciality","Nigdi","020 2764 2764");
        myDB.insertdata("Sterling Hospital", "Multiple Doctors", "Multi Speciality","Nigdi","020 2733 2700");
        myDB.insertdata("Kartik Hospital", "Dr.Jagdish Dhekane", "Pediatrics","Nigdi","020 2765 6583");
        myDB.insertdata("Lokmanya Hospltal", "Multiple Doctors", "Multi Speciality","Nigdi","098811 42101");
        myDB.insertdata("GuruKrupa Clinic", "Dr.Pravin Ghadge", "Surgeon","Nigdi","098222 86811");
        myDB.insertdata("Apollo Clinic", "Dr. Blessy Jacob", "Ophthalmology","Nigdi","1860 500 7788");
        myDB.insertdata("Bindu Speciality Clinic", "Dr. Sujay Naik", "Ophthalmology","Nigdi","087930 08903");
        myDB.insertdata("Advait Hospital", "Dr. Vaibhav Kanse", "Ophthalmology","Nigdi"," 088057 10857");
        myDB.insertdata("Apollo Clinic", "Dr. Shilpy Dolas", "Surgeon","Nigdi","1860 500 7788");
        myDB.insertdata("Apollo Clinic", "Dr. KANCHAN INGLE WAYKOLE", "Surgeon","Nigdi","1860 500 7788");
        myDB.insertdata("Dr.Bhise Clinic", "Dr. Kiran Bhise", "Surgeon","Nigdi","096895 18951");
        myDB.insertdata("Gandhi Nursing Home", "Dr. Nitin K Gandhi", "Surgeon","Nigdi","020 2765 5581");
        myDB.insertdata("Dr. Tarun Datta clinic", "Dr. Tarun Datta", "General Physician","Kondhwa","9371001917");
        myDB.insertdata("Dr. Suhas Rajput clinic", "Dr. Suhas Rajput", "General Physician","Kondhwa","098901 20067");
        myDB.insertdata("Good Health Family Clinic", "Dr. Nilanjan Banerjee", "General Physician","Kondhwa","020 26805264");
        myDB.insertdata("Satyanand Hospital", "Dr. Munaf Inamdar", "General Physician","Kondhwa","086001 46624");
        myDB.insertdata("Rucha clinic", "Dr. Vivek Billampelly", "General Physician","Kondhwa","9822894963");
        myDB.insertdata("Deoskar Polyclinic", "Dr. Ram Deoskar", "General Physician","Kondhwa","020 2683 0357");
        myDB.insertdata("Dr. G.V. Jog Clinic", "Dr. G.V. Jog", "General Physician","Kondhwa","020 2683 0947");
        myDB.insertdata("Hi-Tech Eye Surgery & Laser Centre", "Dr. SALIM K PATHAN", "Ophthalmology","Kondhwa","084484 48946");
        myDB.insertdata("Dr. Shobhna Shahjee - Eye Care Clinic", "Dr. Shobhna Shahjee", "Ophthalmology","Kondhwa","093261 73109");
        myDB.insertdata("Sai Netra Eye Clinic", "Dr. Monica Lodha", "Ophthalmology","Kondhwa","020 2427 5747");
        myDB.insertdata("Netrajyot Superspeciality Eye Clinic", "Dr.Piyush Jain", "Ophthalmology","Kondhwa","9890213234");
        myDB.insertdata("Gupta Dental & Eye Care", "Dr.Smita Gupta", "Ophthalmology","Kondhwa","9822026351");
        myDB.insertdata("Neo Vision Eye Care & Laser Center", "Dr. Mukesh Paryani", "Ophthalmology","Kondhwa","9820465000");
        myDB.insertdata("Heart OPD", "Dr. Ebrahim Patel", "Cardiologist","Kondhwa","077580 05384");
        myDB.insertdata("Heart Care Clinic", "Dr. Usha Pratap", "Cardiologist","Kondhwa","+91 7276377437");
        myDB.insertdata("Apollo Clinic", "Dr. Abhay Somani", "Cardiologist","Kondhwa","1860 500 7788");
        myDB.insertdata("Dr Umesh Akkalkotkar's Heart care clinic", "Dr Umesh Akkalkotkar", "Cardiologist","Kondhwa","NA");
        myDB.insertdata("Dr. Ranjit Jagtap", "Dr. Ranjit Jagtap", "Cardiologist","Kondhwa","098220 10966");
        myDB.insertdata("Kala Physiotheraphy Clinic", " Dr. Meenu Lelani", "Physiotherapy","Kondhwa","094232 22754");
        myDB.insertdata("FysioFit Physiotherapy Clinic", "Dr. Priyanka Kumbhare", "Physiotherapy","Kondhwa","085519 29475");
        myDB.insertdata("Dr. Koshy Polyclinic", "Dr Deepti Waghmare", "Physiotherapy","Kondhwa","073873 82337");
        myDB.insertdata("Physiotherapy And Wellness Clinic (F&M)", "Dr. Sana Majid", "Physiotherapy","Kondhwa","082377 24132");
        myDB.insertdata("Healing Bones Clinic Orthopaedic And Physiotherapy", "Dr. Siddharth Shah", "Physiotherapy","Kondhwa","9152616422");
        myDB.insertdata("Ruby Hall Clinic", "Dr. Vaishali Deshmukh", "Endocrinologist","Kondhwa","02066494949");
        myDB.insertdata("Dr. Rahul`s Dental Hospital & Poly Clinic", "Dr. Rahul", "Dentist","Kondhwa","095458 94566");
        myDB.insertdata("Prachi Patil's Professional Dental Care", "Dr. Prachi Patil", "Dentist","Kondhwa","099229 40024");
        myDB.insertdata("L I M R A DentalClinic", "Dr.Junaid Shah", "Dentist","Kondhwa","092255 11005");
        myDB.insertdata("Marvel Dental Care", "Dr. Mariam Siddiqui", "Dentist","Kondhwa","8381043621");
        myDB.insertdata("Munira Dental Care Centre", "Dr. Munira", "Dentist","Kondhwa","098909 36110");
        myDB.insertdata("Sharada Polyclinic and Dental Centre", "Multiple Doctors", "Dentist","Kondhwa"," 086984 14434");
        myDB.insertdata("Smile n' Care", "Dr. Jyotsna Pandit", "Dentist","Kondhwa"," 020 6648 9548");
        myDB.insertdata("Sana Hospital", "Dr. Suhel Khan", "Orthopaedic","Kondhwa","077987 93456");
        myDB.insertdata("Poona Orthopaedic Clinic", "Dr Keswani", "Orthopaedic","Kondhwa","098220 33827");
        myDB.insertdata("Dr Ashraf Khan Orthopaedic Joint Care Clinic", "Dr. Ashraf Khan", "Orthopaedic","Kondhwa","098235 04741");
        myDB.insertdata("Apollo Clinic Wanowrie", "Dr. ABHIJIT PATIL", "Orthopaedic","Kondhwa","1860 500 1066\n");
        myDB.insertdata("Apollo Clinic", "Dr Anand Jadhav", "Orthopaedic","Kondhwa","090490 59282");
        myDB.insertdata("Dr. Raj Ganacharya Childrens Clinic", "Dr. Raj Ganacharya", "Pediatrician","Kondhwa","020 2683 2968");
        myDB.insertdata("Dr Sarwat Memorial Hospital", "Dr Wasim Kazi", "Pediatrician","Kondhwa","091759 78765");
        myDB.insertdata("Dr. Aparana Mishra Clinic", "Dr. Aparana Mishra", "Pediatrician","Kondhwa","099225 00412");
        myDB.insertdata("Petals Child Care Clinic", "Dr. Ranjeet Kargar", "Pediatrician","Kondhwa","080558 12179");
        myDB.insertdata("Dr.Vishal Ghadwaje's VEERA CHILD CARE clinic", "Dr.Vishal Ghadwaje", "Pediatrician","Kondhwa","097624 57314");
        myDB.insertdata("Dr.Swati Pagares Child Health Care", "Dr. Swati Atish Pagare", "Pediatrician","Kondhwa","9892660619");
        myDB.insertdata("Harsh Hospital", "Dr. Ravindra Chhajed", "Diabetologist","Kondhwa","02024267218");
        myDB.insertdata("Meadowlark Clinic", "Dr. Laxmikant Kaotekwar", "Diabetologist","Kondhwa","02026860442");
        myDB.insertdata("Dr. Ranjeet V. Meher", "Dr. Ranjeet V. Meher", "Diabetologist","Kondhwa","02026834979");
        myDB.insertdata("Heal And Care", "Dr. Manisha Patils", "Dermatologist","Kondhwa","9152423991");
        myDB.insertdata("Sparsh Polyclinic - The Laser Skin and Hair Transplant Centre", "Dr. Nina Kanvaljit", "Dermatologist","Kondhwa"," 098232 92164");
        myDB.insertdata("Skin Science Clinic", "Dr Anita Viegas", "Dermatologist","Kondhwa","098909 75606");
        myDB.insertdata("Sukhayu Ayurveda Clinic", "Dr. Abhijit Jinde", "Ayurveda","Kondhwa","020 4005 5962");
        myDB.insertdata("Trishala Ayurved Clinic and Panchkarma Center", "Dr. Manisha Jain", "Ayurveda","Kondhwa","9762002789");
        myDB.insertdata("SANJEEVANI AYURVEDIC CLINIC AND PANCHKARMA KENDRA", "Dr. Niloy Kar", "Ayurveda","Kondhwa","093700 34545");
        myDB.insertdata("Mantra Ayurveda Clinic and Panchakarma Center", "-", "Ayurveda","Kondhwa","8087631987");
        myDB.insertdata("Dr SUJATA PAWAR AYURVEDA AND PANCHKARMA CLINIC", "Dr SUJATA PAWAR", "Ayurveda","Kondhwa","087882 08767");
        myDB.insertdata("Green Leaf Ayurved Clinic", "Dr. Rupal Shah", "Ayurveda","Kondhwa","098230 26200");
        myDB.insertdata("Shree Madhavaamrut Ayurvedi and Panchkarma Clinic", "Dr. Nilesh Jadhav", "Ayurveda","Kondhwa","098226 03832");
        myDB.insertdata("Gut Care", "Dr. A. K. Handa", "Gastroenterologist","Kondhwa","02048606744");
        myDB.insertdata("New Horizons Clinic", "Dr. Harshvardhan Chaukulkar", "Gastroenterologist","Kondhwa","088066 02876");
        myDB.insertdata("Anjali Mukerjee Health Total - Dietitian, Nutritionist & Weight Loss Center", "-", "Dietitian","Kondhwa"," 020-26830995");
        myDB.insertdata("Dr. Rekha Sachdev Pohani", "Dr. Rekha Sachdev Pohani", "Dietitian","Kondhwa","097620 75688");
        myDB.insertdata("Sirona's Healing Centre", "Ms.Tripti Khanna", "Dietitian","Kondhwa","098812 36383");
        myDB.insertdata("Mehta Clinic", "Dr. Vimla Mehta", "Gynaecologist","Kondhwa","098231 10169");
        myDB.insertdata("LADY CARE CLINIC", "Dr. Swatika Kumari ", "Gynaecologist","Kondhwa"," 098817 18912");
        myDB.insertdata("Dr Zohara Siamwala", "Dr Zohara Siamwala", "Gynaecologist","Kondhwa","098235 31504");
        myDB.insertdata("Ladyhope Clinic", "Dr. Payal Narang", "Gynaecologist","Kondhwa","020 2680 5398");
        myDB.insertdata("Prarthna Clinic", "Dr. Padma Srivastava", "Gynaecologist","Kondhwa","083800 05198");
        myDB.insertdata("Apollo Clinic", "Dr. Nilofer Sahir Shaikh", "Gynaecologist","Kondhwa","1860 500 1066");
        myDB.insertdata("Sarwat Hospital", "Dr. Namra Shaikh Kazi", "Gynaecologist","Kondhwa","077699 76833");
        myDB.insertdata("ALKAS CLINIC", "Dr. Hrishikesh Waghmare", "Gynaecologist","Kondhwa","8856832052");
        myDB.insertdata("Dr. Masal Hospital", "Dr. Vinayak Masal", "Gynaecologist","Kondhwa","096231 22129");
        myDB.insertdata("Inamdar Hospital", "Dr.Pradeep Sharma", "Surgeon","Kondhwa"," 083800 05198");
        myDB.insertdata("New Horizons Clinic", "Dr. Harshvardhan Chaukulkar", "Surgeon","Kondhwa","088066 02876");
        myDB.insertdata("Padale Polyclinic", "Dr. Sanjay Vijay Padale", "Surgeon","Kondhwa","94220876429");
        myDB.insertdata("Dr. Lalit Thakker Clinic", "Dr. Lalit Thakker", "Surgeon","Kondhwa","9422363581");
        myDB.insertdata("Kabir Clinic", "Dr. Kazim Syed", "Surgeon","Kondhwa","9326386899");
        myDB.insertdata("Dr. Nilofer Punjabi Clinic", "Dr. Nilofer Punjabi", "Surgeon","Kondhwa","02071177314");
        myDB.insertdata("Ruby Hall Clinic", "Dr. Dinesh Jain", "Surgeon","Kondhwa","9742076774");
        myDB.insertdata("Ganga Clinic", "Dr. Satish D Jambhulkar", "Surgeon","Kondhwa","02026856944");
        myDB.insertdata("Sana Hospital", "Multiple Doctors", "Multi Speciality","Kondhwa","9152303325");
        myDB.insertdata("Ruby Hall Clinic", "Multiple Doctors", "Multi Speciality","Kondhwa","02066494949");
        myDB.insertdata("Inamdar Multispeciality Hospital", "Multiple Doctors", "Multi Speciality","Kondhwa","020 6681 2222");
        myDB.insertdata("Welfare Multispecialty Hospital", "Multiple Doctors", "Multi Speciality","Kondhwa","02026834979");
        myDB.insertdata("Lifeline Multispeciality Hospital", "Multiple Doctors", "Multi Speciality","Kondhwa","8237035055");
        myDB.insertdata("Noble Hospital", "Multiple Doctors", "Multi Speciality","Kondhwa","020 2683 3489");
        myDB.insertdata("New Sofia Hospital", "Multiple Doctors", "Multi Speciality","Kondhwa","093707 25552");
        myDB.insertdata("Satyanand Hospital", "Multiple Doctors", "Multi Speciality","Kondhwa"," 086001 46624");
        myDB.insertdata("Ruby Hall Clinic", "Dr. Ravindra Chhajed", "Endocrinologist","Kondhwa","02066494949");
        myDB.insertdata("Inamdar Multispeciality Hospital", "Dr. Sanjeev Bakshi", "Endocrinologist","Kondhwa","020 6681 2222");




    }

    public void openRegion1() {
        Intent intent= new Intent(this, RegionOne.class);
        startActivity(intent);
    }

    public void openRegion2() {
        Intent intent= new Intent(this, RegionTwo.class);
        startActivity(intent);
    }

    public void openRegion3() {
        Intent intent= new Intent(this, RegionThree.class);
        startActivity(intent);
    }

    public void openRegion4() {
        Intent  intent= new Intent(this, RegionFour.class);
        startActivity(intent);
    }
}
