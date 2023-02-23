package sv.edu.utec.parcial01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etPassword;
    Button btIngreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre=(EditText) findViewById(R.id.edtNombre);
        etPassword=(EditText) findViewById(R.id.edtPassword);

        btIngreso=(Button) findViewById(R.id.btnIngresar);
        btIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String V_User=etNombre.getText().toString();
                String V_Pass=etPassword.getText().toString();
                if (V_User.equals("parcialETps1") && V_Pass.equals("p4rC14l#tp$"))
                {
                    Intent intent=new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "contraseña y usuario no son correctos", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}