package sv.edu.utec.parcial01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private EditText lbPeso = null;
    private EditText lbAltura = null;


    private TextView lbIMCValue = null;
    private TextView lbDescription = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initViews();

    }

    public void initViews() {

        lbAltura = findViewById(R.id.lblAltura);
        lbPeso = findViewById(R.id.lblPeso);


        lbIMCValue = findViewById(R.id.lblIMCValue);
        lbDescription = findViewById(R.id.lblDescription);


    }
}