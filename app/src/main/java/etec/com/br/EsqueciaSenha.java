package etec.com.br;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EsqueciaSenha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esquecia_senha);
    }

    public void recuperarSenha(View v){

        EditText email = (EditText)findViewById(R.id.idEmailRecuperacao);

        if (email.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Email Invalido.", Toast.LENGTH_SHORT).show();
        }

        else if (email.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Digite um E-mail.", Toast.LENGTH_SHORT).show();
            finish();

        } else {
            Toast.makeText(getApplicationContext(),"E-mail de recuperação enviado!", Toast.LENGTH_LONG).show();

        }
    }

    public void site(View v){

        String endereco = "https://cobuci.live/Anthero";

        Uri uri = Uri.parse(endereco);

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);

        startActivity(intent);
    }
}
