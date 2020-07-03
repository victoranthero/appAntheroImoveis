package etec.com.br;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button createNotificationButton = findViewById(R.id.btnAcessar);

        createNotificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                addnotification();
            }
        });

    }

    public void acesso(View v) {

        EditText user = (EditText) findViewById(R.id.idUser);
        EditText pass = (EditText) findViewById(R.id.IdPassword);

        if (user.getText().toString().equals("victor") && pass.getText().toString().equals("12345")) {
            Intent abrir = new Intent(this, HomePage.class);
            startActivity(abrir);

        } else if (user.getText().toString().equals("mayara") && pass.getText().toString().equals("12345")) {
            Intent abrir = new Intent(this, HomePage.class);
            startActivity(abrir);

        } else {
            Toast toast = Toast.makeText(this, "Usuario ou Senha Incorretos", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void recuperar(View view){
        Intent intent = new Intent(this, EsqueciaSenha.class);
        startActivity(intent);
    }

    public void cadastrar(View view){
        Intent intent = new Intent(this, CadastroUsuario.class);
        startActivity(intent);

    }

    public void site(View view){

        String endereco = "https://cobuci.live/Anthero";
        Uri uri = Uri.parse(endereco);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void addnotification (){

        EditText user = (EditText) findViewById(R.id.idUser);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher_round)
                .setContentTitle("Olá" + user.getText().toString())
                .setContentText("Seja bem vindo ao nosso APP!!");

        Intent notificationIntent = new Intent(this, HomePage.class);

        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());

    }

}






