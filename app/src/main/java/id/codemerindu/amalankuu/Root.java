package id.codemerindu.amalankuu;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class Root extends Fragment{


    public Root(){}
    RelativeLayout view;

    BottomNavigationView bottomNavigationView;

     private Handler handler = new Handler();



    public View onCreateView (LayoutInflater inflater, ViewGroup container , Bundle savedInstanceState)
    {
//        TextView jam = (TextView) view.findViewById(R.id.textView2);


    handler.postDelayed(runnable, 1000);

        view = (RelativeLayout) inflater.inflate(R.layout.root,container,false);
        getActivity().setTitle("AmalanKuu");
        bottomNavigationView = (BottomNavigationView) view.findViewById(R.id.bottom);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.Dpagi:
                Intent Pintent = new Intent(getActivity(),pagi.class);
                getActivity().startActivity(Pintent);
                break;
            case R.id.Dsore:
                Intent Sintent = new Intent(getActivity(),sore.class);
                getActivity().startActivity(Sintent);
                break;
            case R.id.quran:
                Intent Qintent = new Intent(getActivity(),ListSurahActivity.class);
                getActivity().startActivity(Qintent);
                break;
            case R.id.jsholat:
                Toast.makeText(getActivity(),"Coming Soon",Toast.LENGTH_SHORT).show();
                break;
            case R.id.lainnya:
                    Toast.makeText(getActivity(),"Coming Soon",Toast.LENGTH_SHORT).show();
            break;


        }
        return true;
    }
});

        return  view;
    }
                private Runnable runnable = new Runnable() {
                 @Override
                 public void run() {
//           int hari, bulan, tahun;
//        Calendar date = Calendar.getInstance();
//        String namabulan[] = {"Januari", "Februari" , "Maret" , "April", "Mei", "Juni" , "Juli" ,
//                                "Agustus" , "September" , "Oktober" , "November" , "Desemberr"};
//        hari = date.get(Calendar.DAY_OF_MONTH);
//        bulan = date.get(Calendar.MONTH);
//        tahun = date.get(Calendar.YEAR);
//        TextView txtdate1 = (TextView) view.findViewById(R.id.tanngal);
//           txtdate1.setText(tahun);
//             }
                     String pola = null;
                     Locale lokal = null;
                     String hasil = null;

                     Date tanggal = new Date();


                     pola = "EEEE,dd MMMM, yyyy";
                     hasil = tampilkanTanngal(tanggal, pola , lokal);

                     TextView txtdate1 = (TextView) view.findViewById(R.id.tanngal);
           txtdate1.setText(hasil);

            };

                };
    protected static String tampilkanTanngal(Date tanggal, String pola, Locale lokal)
    {
        String tanngalStr = null;
        SimpleDateFormat formater = null;
        if (lokal == null)
        {
            formater = new SimpleDateFormat(pola);
        }else
        {
            formater = new SimpleDateFormat(pola,lokal);
        }
        tanngalStr = formater.format(tanggal);
        return  tanngalStr;
    }


}