package mx.carpediemsoft.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            }

       public void irChapul (View v){
        Intent i= new Intent(this, MapsActivity.class);
        startActivity(i);
    }

    public void irAngel (View v){

        Intent i= new Intent(this, MapsActivity1.class);
        startActivity(i);
    }

    public void irSanJuan (View v){

        Intent i= new Intent(this, MapsActivity2.class);
        startActivity(i);
    }

    public void irAzteca (View v){

        Intent i= new Intent(this, MapsActivity3.class);
        startActivity(i);
    }
}
