package rochanathalia.eti.br.inesbrasil;

import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Widgets
    private Button btnInes1;
    private Button btnInes2;
    private Button btnInes3;
    private Button btnInes4;
    private Button btnInes5;
    private Button btnInes6;
    private Button btnInes7;
    private Button btnInes8;

    //MediaPlayer
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencias
        btnInes1 = (Button) findViewById(R.id.btn_ines1);
        btnInes2 = (Button) findViewById(R.id.btn_ines2);
        btnInes3 = (Button) findViewById(R.id.btn_ines3);
        btnInes4 = (Button) findViewById(R.id.btn_ines4);
        btnInes5 = (Button) findViewById(R.id.btn_ines5);
        btnInes6 = (Button) findViewById(R.id.btn_ines6);
        btnInes7 = (Button) findViewById(R.id.btn_ines7);
        btnInes8 = (Button) findViewById(R.id.btn_ines8);

        btnInes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Ines Bumbum",Toast.LENGTH_LONG).show();
                play(view, R.raw.ines1);
            }
        });

        btnInes1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle("Ines Brasil");
                msg.setMessage("ELa é a melhor !!");
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton("OK",null);
                msg.show();
                return true;
            }
        });

        btnInes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Ines Dança",Toast.LENGTH_LONG).show();
                play(view, R.raw.ines2);
            }
        });
        btnInes2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle("Ines Brasil");
                msg.setMessage("ELa é a melhor !!");
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton("OK",null);
                msg.show();
                return true;
            }
        });

        btnInes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Ines Graças a Deus",Toast.LENGTH_LONG).show();
                play(view, R.raw.ines3);
            }
        });

        btnInes3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle("Ines Brasil");
                msg.setMessage("ELa é a melhor !!");
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton("OK",null);
                msg.show();
                return true;
            }
        });

        btnInes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Ines Alo,alo",Toast.LENGTH_LONG).show();
                play(view, R.raw.ines4);
            }
        });

        btnInes4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle("Ines Brasil");
                msg.setMessage("ELa é a melhor !!");
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton("OK",null);
                msg.show();
                return true;
            }
        });

        btnInes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Ines Ui, que Delicia",Toast.LENGTH_LONG).show();
                play(view, R.raw.ines5);
            }
        });

        btnInes5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle("Ines Brasil");
                msg.setMessage("ELa é a melhor !!");
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton("OK",null);
                msg.show();
                return true;
            }
        });

        btnInes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Ines , Porno?",Toast.LENGTH_LONG).show();
                play(view, R.raw.ines6);
            }
        });

        btnInes6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle("Ines Brasil");
                msg.setMessage("ELa é a melhor !!");
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton("OK",null);
                msg.show();
                return true;
            }
        });

        btnInes7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Ines Noel",Toast.LENGTH_LONG).show();
                play(view, R.raw.ines7);
            }
        });

        btnInes7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle("Ines Brasil");
                msg.setMessage("ELa é a melhor !!");
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton("OK",null);
                msg.show();
                return true;
            }
        });

        btnInes8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Ines Piscina",Toast.LENGTH_LONG).show();
                play(view, R.raw.ines8);
            }
        });

        btnInes8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle("Ines Brasil");
                msg.setMessage("ELa é a melhor !!");
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton("OK",null);
                msg.show();
                return true;
            }
        });

    }//fecha onCreate

    public void play(View v, int som){
        try {
            mp = MediaPlayer.create(getBaseContext(),som);
            mp.start();
        }catch (Exception e){

        }
    }

    public void stop(View v){
        try {
            mp.stop();
        }catch (Exception e){

        }
    }
}//fecha MainActi
