package etec.com.br;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);
    }


    public void cadastrar(View v)
    {

        EditText user = (EditText)findViewById(R.id.txtUsuario);
        EditText pass = (EditText)findViewById(R.id.txtSenha);
        EditText pass2 = (EditText)findViewById(R.id.txtSenha2);
        EditText email = (EditText)findViewById(R.id.txtEmail);
        EditText tel = (EditText)findViewById(R.id.txtTel);
        EditText nick = (EditText)findViewById(R.id.txtNick);


        if(user.getText().toString().isEmpty() ||
            email.getText().toString().isEmpty() ||
            tel.getText().toString().isEmpty() ||
            nick.getText().toString().isEmpty() ||
            pass2.getText().toString().isEmpty() ||
            pass.getText().toString().isEmpty())


        {
            Toast.makeText(getApplicationContext(), "Não deixe nenhum campo em branco.", Toast.LENGTH_SHORT).show();

        }else {




            new AlertDialog.Builder(this)
                    .setTitle("Cadastro")
                    .setMessage("Cadastro Efetuado com sucesso.")
                    .setCancelable(false)
                    .setPositiveButton("Concluir", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(CadastroUsuario.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .show();


        }

    }

    public void site(View v){

        String endereco = "https://cobuci.live/Anthero";

        Uri uri = Uri.parse(endereco);

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);

        startActivity(intent);
    }

}
