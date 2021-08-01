package tw.com.menudemo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCustomeBar();

    }

    private void setCustomeBar(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        toolbar.setNavigationOnClickListener(v -> {
            Toast.makeText(getApplicationContext(),"返回上一頁",Toast.LENGTH_SHORT).show();
        });

        toolbar.inflateMenu(R.menu.mymenu);

        toolbar.setOnMenuItemClickListener(item -> {

            if (item.getTitle().equals("設定")){
                Toast.makeText(getApplicationContext(),item.getTitle(),Toast.LENGTH_SHORT).show();
            }else{
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
            return true;

        });



    }

    private void setSupportActionBar(Toolbar toolbar) {
    }
}