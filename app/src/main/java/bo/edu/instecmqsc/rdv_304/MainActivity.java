package bo.edu.instecmqsc.rdv_304;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.redes);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numeros, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        Button button = findViewById(R.id.button);
        EditText ip1 = findViewById(R.id.ip1);
        TextView masc = findViewById(R.id.mascara);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Ip1 = Integer.parseInt(ip1.getText().toString());
                if(Ip1>=0 && Ip1<128)
                    masc.setText("255.0.0.0" );
                if(Ip1>=128 && Ip1<192)
                    masc.setText("255.255.0.0" );
                if(Ip1>=192 && Ip1<224)
                    masc.setText("255.255.255.0" );
                if(Ip1>=224 && Ip1<240)
                    masc.setText("255.255.255.255" );
                if(Ip1>=240 && Ip1<256)
                    masc.setText("255.255.255.255" );
            }
        });

    }
}