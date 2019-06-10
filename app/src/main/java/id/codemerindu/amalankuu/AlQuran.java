package id.codemerindu.amalankuu;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class AlQuran extends AppCompatActivity {


    String nama_surah,isiSurah;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quran);

        Intent intent = getIntent();
      nama_surah = intent.getStringExtra("namasurah");

        setQuran(nama_surah);
       setTitle(nama_surah);


    }

    public void setQuran(String surah){
        if(surah.equalsIgnoreCase("1) Surah Al - Fatihah - Pembukaan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alfatihah);
            String[] tarti = getResources().getStringArray(R.array.AlfatihahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("2) Surah Al - Baqarah - Sapi Betina")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.albaqarah);
            String[] tarti = getResources().getStringArray(R.array.AlbaqarahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("3) Surah Ali ‘Imran - Keluarga ‘Imran")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.imron);
            String[] tarti = getResources().getStringArray(R.array.AlimronArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("4) Surah An - Nisa’ - Wanita")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.annisa);
            String[] tarti = getResources().getStringArray(R.array.AnnisaArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("5) Surah Al - Ma’idah - Jamuan (Hidangan Makanan)")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.almaidah);
            String[] tarti = getResources().getStringArray(R.array.AlmaidahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("6) Surah Al - An’am - Binatang Ternak")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alanam);
            String[] tarti = getResources().getStringArray(R.array.AlanamArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("7) Surah Al - A’raf - Tempat Yang Tertinggi")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alaraf);
            String[] tarti = getResources().getStringArray(R.array.AlarafArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        } else if(surah.equalsIgnoreCase("8) Surah Al - Anfal - Harta Rampasan Perang")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alanfal);
            String[] tarti = getResources().getStringArray(R.array.AlanfalArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        } else if(surah.equalsIgnoreCase("9) Surah At - Taubah - Pengampunan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.attaubah);
            String[] tarti = getResources().getStringArray(R.array.AttaubahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        } else if(surah.equalsIgnoreCase("10) Surah Yunus - Nabi Yunus")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.yunus);
            String[] tarti = getResources().getStringArray(R.array.YunusArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("11) Surah Hud - Nabi Hud")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.hud);
            String[] tarti = getResources().getStringArray(R.array.HudArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("12) Surah Yusuf - Nabi Yusuf")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.yusuf);
            String[] tarti = getResources().getStringArray(R.array.Yusufarti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("13) Surah Ar - Ra’d - Guruh (Petir)")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.arradu);
            String[] tarti = getResources().getStringArray(R.array.ArraduArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("14) Surah Ibrahim - Nabi Ibrahim")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.ibrahim);
            String[] tarti = getResources().getStringArray(R.array.IbrahimArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("15) Surah Al - Hijr - Al Hijr (Nama Gunung)")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alhjr);
            String[] tarti = getResources().getStringArray(R.array.AlhjrArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("16) Surah An - Nahl - Lebah")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.annahl);
            String[] tarti = getResources().getStringArray(R.array.AnnahlArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("17) Surah Al - Isra’ - Memperjalankan Di Waktu Malam")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alisra);
            String[] tarti = getResources().getStringArray(R.array.AlisraArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("18) Surah Al - Kahf - Penghuni-Penghuni Gua")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alkahfi);
            String[] tarti = getResources().getStringArray(R.array.AlkahfiArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("19) Surah Maryam - Maryam (Maria)")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.maryam);
            String[] tarti = getResources().getStringArray(R.array.MaryamArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("20) Surah Ta Ha - Ta Ha")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.taha);
            String[] tarti = getResources().getStringArray(R.array.TahaArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("21) Surah Al - Anbiya\t- Nabi-Nabi")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.taha);
            String[] tarti = getResources().getStringArray(R.array.TahaArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("22) Surah Al - Hajj - Haji")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alhajj);
            String[] tarti = getResources().getStringArray(R.array.AlhajjArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("23) Surah Al - Mu’minun - Orang-Orang Mukmin")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.almuminun);
            String[] tarti = getResources().getStringArray(R.array.AlmuminunArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("24) Surah An - Nur - Cahaya")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.annur);
            String[] tarti = getResources().getStringArray(R.array.AnnurArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("25) Surah Al - Furqan - Pembeda")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alfurqan);
            String[] tarti = getResources().getStringArray(R.array.AlfurqanArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("26) Surah Asy - Syu’ara’ - Penyair")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.asysyuara);
            String[] tarti = getResources().getStringArray(R.array.AsysyuaraArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("27) Surah An - Naml - Semut")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.annaml);
            String[] tarti = getResources().getStringArray(R.array.AnnamlArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("28) Surah Al - Qasas - Cerita")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alqashash);
            String[] tarti = getResources().getStringArray(R.array.AlqashashArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("29) Surah Al - ‘Ankabut - Laba-Laba")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alankabut);
            String[] tarti = getResources().getStringArray(R.array.AlankabutArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("30) Surah Ar - Rum - Bangsa Romawi")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.arrum);
            String[] tarti = getResources().getStringArray(R.array.ArrumArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("31) Surah Luqman - Keluarga Luqman")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.luqman);
            String[] tarti = getResources().getStringArray(R.array.LuqmanArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("32) Surah As - Sajdah - Sajdah")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.assajdah);
            String[] tarti = getResources().getStringArray(R.array.AssajdahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("33) Surah Al - Ahzab - Golongan-Golongan Yang Bersekutu")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alahzab);
            String[] tarti = getResources().getStringArray(R.array.AlahzabArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("34) Surah Saba’ - Kaum Saba’")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.saba);
            String[] tarti = getResources().getStringArray(R.array.SabaArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("35) Surah Fatir - Pencipta")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.faathir);
            String[] tarti = getResources().getStringArray(R.array.FaathirArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("36) Surah Ya Sin - Yaasiin")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.yaasiin);
            String[] tarti = getResources().getStringArray(R.array.YaasiinArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("37) Surah As - Saffat - Barisan-Barisan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.ashshaaffat);
            String[] tarti = getResources().getStringArray(R.array.AshshaaffatArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("38) Surah Sad - Shaad")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.shaad);
            String[] tarti = getResources().getStringArray(R.array.ShaadArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("39) Surah Az - Zumar - Rombongan-Rombongan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.azzumar);
            String[] tarti = getResources().getStringArray(R.array.AzzumarArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("40) Surah Al - Mu’min - Orang Yg Beriman")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.almuminun);
            String[] tarti = getResources().getStringArray(R.array.AlmuminunArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("41) Surah Fussilat - Yang Dijelaskan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alfushilat);
            String[] tarti = getResources().getStringArray(R.array.AlfushilatArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("42) Surah Asy - Syura - Musyawarah")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.asysyuara);
            String[] tarti = getResources().getStringArray(R.array.AsysyuaraArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("43) Surah Az - Zukhruf - Perhiasan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.azzukhruf);
            String[] tarti = getResources().getStringArray(R.array.AzzukhrufArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("44) Surah Ad - Dukhan\t- Kabut")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.addhukaan);
            String[] tarti = getResources().getStringArray(R.array.AddhukaanArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("45) Surah Al - Jasiyah - Yang Bertekuk Lutut")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.aljaatsiyah);
            String[] tarti = getResources().getStringArray(R.array.AljaatsiyahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("46) Surah Al - Ahqaf - Bukit-Bukit Pasir")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alahqaaf);
            String[] tarti = getResources().getStringArray(R.array.AlahqaafArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("47) Surah Muhammad - Muhammad")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.muhammad);
            String[] tarti = getResources().getStringArray(R.array.MuhammadArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("48) Surah Al - Fath - Kemenangan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alfath);
            String[] tarti = getResources().getStringArray(R.array.AlfathArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("49) Surah Al - Hujurat - Kamar-Kamar")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alhujuraat);
            String[] tarti = getResources().getStringArray(R.array.AlhujuraatArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("50) Surah Qaf - Qaaf")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.qaaf);
            String[] tarti = getResources().getStringArray(R.array.QaafArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("51) Surah Az - Zariyat - Angin Yang Menerbangkan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.adzdzaariyat);
            String[] tarti = getResources().getStringArray(R.array.AdzdzaariyatArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("52) Surah At - Tur - Bukit")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.aththuur);
            String[] tarti = getResources().getStringArray(R.array.AththuurArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("53) Surah An - Najm - Bintang")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.annajm);
            String[] tarti = getResources().getStringArray(R.array.AnnajmArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("54) Surah Al - Qamar - Bulan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alqamar);
            String[] tarti = getResources().getStringArray(R.array.AlqamarArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("55) Surah Ar - Rahman - Yang Maha Pemurah")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.arrahman);
            String[] tarti = getResources().getStringArray(R.array.ArrahmanArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("56) Surah Al - Waqi’ah - Hari Kiamat")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alwaaqiah);
            String[] tarti = getResources().getStringArray(R.array.AlwaaqiahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("57) Surah Al - Hadid - Besi")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alhadiid);
            String[] tarti = getResources().getStringArray(R.array.AlhadiidArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("58) Surah Al - Mujadilah - Wanita Yang Mengajukan Gugatan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.almujaadalah);
            String[] tarti = getResources().getStringArray(R.array.AlmujaadalahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("59) Surah Al - Hasyr - Pengusiran")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alhasyr);
            String[] tarti = getResources().getStringArray(R.array.AlhasyrArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("60) Surah Al - Mumtahanah\t- Wanita Yang Diuji")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.almumtahanah);
            String[] tarti = getResources().getStringArray(R.array.AlmumtahanahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("61) Surah As - Saff - Satu Barisan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.ashshaff);
            String[] tarti = getResources().getStringArray(R.array.AshshaffArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("62) Surah Al - Jumu’ah - Hari Jum’at")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.aljumuah);
            String[] tarti = getResources().getStringArray(R.array.AljumuahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("63) Surah Al - Munafiqun - Orang-Orang Yang Munafik")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.almunafiqun);
            String[] tarti = getResources().getStringArray(R.array.AlmunafiqunArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("64) Surah At - Tagabun - Hari Dinampakkan Kesalahan-Kesalahan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.athtaghabun);
            String[] tarti = getResources().getStringArray(R.array.AthtaghabunArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("65) Surah At - Talaq - Talak")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.aththalaaq);
            String[] tarti = getResources().getStringArray(R.array.AththalaaqArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("66) Surah At - Tahrim - Mengharamkan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.attahrim);
            String[] tarti = getResources().getStringArray(R.array.AttahrimArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("67) Surah Al - Mulk - Kerajaan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.almulk);
            String[] tarti = getResources().getStringArray(R.array.AlmulkArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("68) Surah Al - Qalam - Pena")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alqalam);
            String[] tarti = getResources().getStringArray(R.array.AlqalamArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("69) Surah Al - Haqqah - Hari Kiamat")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alhaaqqah);
            String[] tarti = getResources().getStringArray(R.array.AlhaaqqahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("70) Surah Al - Ma’arij - Tempat Naik")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.almaaarij);
            String[] tarti = getResources().getStringArray(R.array.AlmaaarijArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("71) Surah Nuh - Nuh")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.nuh);
            String[] tarti = getResources().getStringArray(R.array.NuhArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("72) Surah Al - Jinn - Jin")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.aljin);
            String[] tarti = getResources().getStringArray(R.array.AljinArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("73) Surah Al - Muzzammil - Orang Yang Berselimut")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.almuzammil);
            String[] tarti = getResources().getStringArray(R.array.AlmuzammilArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("74) Surah Al - Muddassir - Orang Yang Berkemul")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.almuddastir);
            String[] tarti = getResources().getStringArray(R.array.AlmuddastirArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("75) Surah Al - Qiyamah - Hari Kiamat")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alqiyaamah);
            String[] tarti = getResources().getStringArray(R.array.AlqiyaamahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("76) Surah Al - Insan - Manusia")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alinsan);
            String[] tarti = getResources().getStringArray(R.array.AlinsanArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("77) Surah Al - Mursalat - Malaikat-Malaikat Yang Diutus")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.almursalat);
            String[] tarti = getResources().getStringArray(R.array.AlmursalatArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("78) Surah An - Naba’ - Berita Besar")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.annaba);
            String[] tarti = getResources().getStringArray(R.array.AnnabaArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("79) Surah An - Nazi’at - Malaikat-Malaikat Yang Mencabut")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.annaaziat);
            String[] tarti = getResources().getStringArray(R.array.AnnaaziatArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("80) Surah ‘Abasa - Ia Bermuka Masam")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.abasa);
            String[] tarti = getResources().getStringArray(R.array.AbasaArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("81) Surah At - Takwir - Menggulung")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.attakwir);
            String[] tarti = getResources().getStringArray(R.array.AttakwirArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("82) Surah Al - Infitar - Terbelah")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alinfithar);
            String[] tarti = getResources().getStringArray(R.array.AlinfitharArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("83) Surah Al - Mutafifin - Orang-Orang Yang Curang")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.almuthaffifin);
            String[] tarti = getResources().getStringArray(R.array.AlmuthaffifinArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("84) Surah Al - Insyiqaq - Terbelah")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alinsyiqaq);
            String[] tarti = getResources().getStringArray(R.array.AlinsyiqaqArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("85) Surah Al - Buruj - Gugusan Bintang")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alburuuj);
            String[] tarti = getResources().getStringArray(R.array.AlburuujArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("86) Surah At - Tariq - Yang Datang Di Malam Hari")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.aththariq);
            String[] tarti = getResources().getStringArray(R.array.AththariqArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("87) Surah Al - A’la - Yang Paling Tinggi")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alalaa);
            String[] tarti = getResources().getStringArray(R.array.AlalaaArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("88) Surah Al - Gasyiyah - Hari Pembalasan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alghaasyiah);
            String[] tarti = getResources().getStringArray(R.array.AlghaasyiahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("89) Surah Al - Fajr - Fajar")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alfajr);
            String[] tarti = getResources().getStringArray(R.array.AlfajrArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("90) Surah Al - Balad - Negeri")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.albalad);
            String[] tarti = getResources().getStringArray(R.array.AlbaladArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("91) Surah Asy - Syams - Matahari")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.asysyams);
            String[] tarti = getResources().getStringArray(R.array.AsysyamArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("92) Surah Al - Lail - Malam")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.allail);
            String[] tarti = getResources().getStringArray(R.array.AllailArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("93) Surah Ad - Duha - Waktu Matahari Sepenggalahan Naik (Dhuha)")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.adhdhuha);
            String[] tarti = getResources().getStringArray(R.array.adhdhuhaArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("94) Surah Asy - Sharh - Melapangkan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.asysyarh);
            String[] tarti = getResources().getStringArray(R.array.asysyarhArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("95) Surah At - Tin - Buah Tin")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.attiin);
            String[] tarti = getResources().getStringArray(R.array.attiinArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("96) Surah Al - ‘Alaq - Segumpal Darah")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alalaq);
            String[] tarti = getResources().getStringArray(R.array.alalaqArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("97) Surah Al - Qadr - Kemuliaan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alqadr);
            String[] tarti = getResources().getStringArray(R.array.alqadrArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("98) Surah Al - Bayyinah - Pembuktian")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.albayyinah);
            String[] tarti = getResources().getStringArray(R.array.albayyinahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("99) Surah Az - Zalzalah - Kegoncangan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.azzalzalah);
            String[] tarti = getResources().getStringArray(R.array.azzalzalahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("100) Surah Al - ‘Adiyat - Berlari Kencang")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alaadiyah);
            String[] tarti = getResources().getStringArray(R.array.alaadiyahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("101) Surah Al - Qari’ah - Hari Kiamat")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alqaariah);
            String[] tarti = getResources().getStringArray(R.array.alqaariahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("102) Surah At - Takasur - Bermegah-Megahan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.attakaatsur);
            String[] tarti = getResources().getStringArray(R.array.attakaatsurArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("103) Surah Al - ‘Asr - Masa/Waktu")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alashr);
            String[] tarti = getResources().getStringArray(R.array.alashrArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("104) Surah Al - Humazah - Pengumpat")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alhumazah);
            String[] tarti = getResources().getStringArray(R.array.alhumazahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("105) Surah Al - Fil - Gajah")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alfiil);
            String[] tarti = getResources().getStringArray(R.array.alfiilArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("106) Surah Quraisy - Suku Quraisy")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.quraisy);
            String[] tarti = getResources().getStringArray(R.array.quraisyArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("107) Surah Al - Ma’un - Barang-Barang Yang Berguna")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.almaaun);
            String[] tarti = getResources().getStringArray(R.array.almaaunArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("108) Surah Al - Kausar - Nikmat Yang Berlimpah")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alkautstar);
            String[] tarti = getResources().getStringArray(R.array.alkautstarArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("109) Surah Al - Kafirun - Orang-Orang Kafir")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alkaafirun);
            String[] tarti = getResources().getStringArray(R.array.alkaafirunArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("110) Surah An - Nasr - Pertolongan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.annashr);
            String[] tarti = getResources().getStringArray(R.array.annashrArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("111) Surah Al - Lahab - Gejolak Api/ Sabut")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.allahab);
            String[] tarti = getResources().getStringArray(R.array.allahabArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("112) Surah Al - Ikhlas - Ikhlas")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alikhlash);
            String[] tarti = getResources().getStringArray(R.array.alikhlashArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("113) Surah Al - Falaq - Waktu Subuh")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alfalaq);
            String[] tarti = getResources().getStringArray(R.array.alfalaqArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("114) Surah An - Nas - Manusia")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.annass);
            String[] tarti = getResources().getStringArray(R.array.annassArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }
    }
}
