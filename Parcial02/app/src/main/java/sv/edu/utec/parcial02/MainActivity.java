package sv.edu.utec.parcial02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Personas> listapersonas;
    ListView lv1;
    Integer[] ImgPpersonas = {
            R.drawable.lead_photo_1,
            R.drawable.lead_photo_2,
            R.drawable.lead_photo_3,
            R.drawable.lead_photo_4,
            R.drawable.lead_photo_5,
            R.drawable.lead_photo_6,
            R.drawable.lead_photo_7,
            R.drawable.lead_photo_8,
            R.drawable.lead_photo_9,
            R.drawable.lead_photo_10,

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listapersonas = new ArrayList<Personas>();
        listapersonas.add(new Personas("marta", 'f'));
        listapersonas.add(new Personas("carmelo", 'm'));
        listapersonas.add(new Personas("fabiola", 'f'));
        listapersonas.add(new Personas("gabriel", 'm'));
        listapersonas.add(new Personas("julian", 'm'));
        listapersonas.add(new Personas("Jaime", 'm'));
        listapersonas.add(new Personas("carmen", 'f'));
        listapersonas.add(new Personas("lamar", 'm'));
        listapersonas.add(new Personas("marcela", 'f'));
        listapersonas.add(new Personas("miriam", 'f'));
        listapersonas.add(new Personas("pablo", 'm'));
        listapersonas.add(new Personas("saldivar", 'f'));
        AdaptadorPersonas adaptador = new AdaptadorPersonas(this);
        lv1 = findViewById(R.id.lvListaPersonas);
        lv1.setAdapter((ListAdapter) adaptador);
    }

    class AdaptadorPersonas extends ArrayAdapter<Personas> {
        AppCompatActivity appCompatActivity;

        AdaptadorPersonas(AppCompatActivity context) {
            super(context, R.layout.personas, listapersonas);
            appCompatActivity = context;
        }
        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.personas, null);
            TextView textView1 = item.findViewById(R.id.tvPersona);
            textView1.setText(listapersonas.get(position).getNombre());
            ImageView imageView1 = item.findViewById(R.id.imvPersona);
            imageView1.setImageResource(ImgPpersonas[position]);
            return(item);
        }
    }
}