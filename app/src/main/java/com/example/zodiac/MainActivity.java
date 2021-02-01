package com.example.zodiac;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.LocaleData;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.Toast;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    NumberPicker mounths_numbers;
    NumberPicker days_numbers;
    NumberPicker years_numbers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
try{
        String [] years=fill_years();
        String [] days=fill_days();
        String [] months=fill_months();

        // define Number pickers
        mounths_numbers=(NumberPicker)findViewById(R.id.mounth);
        mounths_numbers.setDisplayedValues(months);
        mounths_numbers.setMinValue(1);
        mounths_numbers.setMaxValue(months.length);

        // define Number pickers
        years_numbers=(NumberPicker)findViewById(R.id.years);
        years_numbers.setDisplayedValues(years);
        years_numbers.setMinValue(0);
        years_numbers.setMaxValue(years.length-1);

        // define Number pickers
      days_numbers=(NumberPicker)findViewById(R.id.day);
        days_numbers.setDisplayedValues(days);
        days_numbers.setMinValue(1);
        days_numbers.setMaxValue(days.length);}
catch(Exception e){
    Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_SHORT).show();

        }


    }

    public  void calculate(View v){
        try{
       int days=days_numbers.getValue();
       int month=mounths_numbers.getValue();
       int years=years_numbers.getValue()+1920;

       String age= getAge( years,  month,  days);
       String zodiac=define_your_zodiac (month, days);
       Toast.makeText(getApplicationContext(),"age= "+ age + zodiac,Toast.LENGTH_LONG).show();
       Intent goToSecond= new Intent();
       goToSecond.setClass(this,SecondActivity.class);
       goToSecond.putExtra("Age",age);
       goToSecond.putExtra("zodiac",zodiac);
       startActivity(goToSecond);


       finish();

        }
        catch(Exception e){
            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_SHORT).show();

        }


    }
    public String [] fill_years(){
        String [] years=new String[101];
        // fill years
        int j =0;
        for(int i=1920; i<=2020; i++){
            years[j++] = String.valueOf(i);}
        return  years;
    }

    public String [] fill_months(){
        String [] mounths=new String[12];
        // fill mounths
        int j=0;
        for(int i=1; i<=12; i++){
            mounths[j++] = String.valueOf(i);}
        return mounths;
    }

    public String []  fill_days(){
        String [] days=new String[31];
        // fill days
        int j=0;
        for(int i=1; i<=31; i++){
            days[j++] = String.valueOf(i);}
        return days;


    }
    public String getAge(int year, int month, int day){
        Calendar dob = Calendar.getInstance();
        Calendar today = Calendar.getInstance();

        dob.set(year, month, day);

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)){
            age--;
        }

        Integer ageInt = new Integer(age);
        String ageS = ageInt.toString();

        return ageS;
    }
    public  String define_your_zodiac (int month,int day){
        String zodiac="";
        if (month==3 && day>=21||month==4&&day<=19)
            zodiac="Aries";
        else if (month==4&& day>=20||month==5&&day<=20)
            zodiac="Taurus";
        else if (month==5&& day>=21||month==6&&day<=20)
            zodiac="Gemini";
        else if (month==6&& day>=21||month==7&&day<=22)
            zodiac="Cancer";
        else if (month==7&& day>=23||month==8&&day<=22)
            zodiac="Leo";
        else if (month==8&& day>=23||month==9&&day<=22)
            zodiac="Virgo";
        else if (month==9&& day>=23||month==10&&day<=23)
            zodiac="Libra";
        else if (month==10&& day>=24||month==11&&day<=21)
            zodiac="Scorpio";
        else if (month==11&& day>=22||month==12&&day<=21)
            zodiac="Sagittarius";
        else if (month==12&& day>=22||month==1&&day<=19)
            zodiac="Capricorn";
        else if (month==1&& day>=20||month==2&&day<=18)
            zodiac="Aquarius";
        else if (month==2&& day>=19||month==3&&day<=20)
            zodiac="Pisces";

        return zodiac;
    }
}