package etec.com.br;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void site(View v){

        String endereco = "https://cobuci.live/Anthero";
        Uri uri = Uri.parse(endereco);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void sair(View v){

        finish();
    }

    public void servicos(View v){

        Intent intent = new Intent(this, Servicos.class);
        startActivity(intent);
    }
}
