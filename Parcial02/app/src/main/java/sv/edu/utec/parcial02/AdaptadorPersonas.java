package sv.edu.utec.parcial02;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorPersonas extends ArrayAdapter<String> {
        Activity contexto;
        String []personas;
        Integer[] imgPersonas;

        ImageView imvPerson;
        TextView tvNombre;


        public AdaptadorPersonas(Activity contexto,String[]personas,Integer[] imgPersonas){
                super(contexto, R.layout.personas,personas);
                this.contexto=contexto;
                this.personas=personas;
                this.imgPersonas=imgPersonas;
        }
        public View getView(int posicion, View v, ViewGroup parent){

                LayoutInflater inflater =contexto.getLayoutInflater();
                View rowView=inflater.inflate(R.layout.personas,null,true);
                tvNombre=rowView.findViewById(R.id.tvPersona);
                imvPerson=rowView.findViewById(R.id.imvPersona);
                tvNombre.setText(personas[posicion]);
                imvPerson.setImageResource(imgPersonas[posicion]);
                return rowView;
        }


}
