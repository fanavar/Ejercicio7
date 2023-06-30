package cl.awakelab.ejercicio7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void setDayNight(int mode){
        if(mode==0){
            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }
        else{
            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }


switchNight.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (switchNight.isChecked()) {
                setDayNight(0);
                Toast.makeText(getBaseContext(), "Enable Dark Mode", Toast.LENGTH_SHORT).show();
            } else {
                setDayNight(1);
                Toast.makeText(getBaseContext(), "Enable Light Mode", Toast.LENGTH_SHORT).show();
            }
        }
}