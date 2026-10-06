package rus.test.chasti_rechi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import rus.test.chasti_rechi.R;

public class Gl extends AppCompatActivity   {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gl);

        //Запрет поворота экрана
        setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

        }

    public void Clik(View v) {

        switch (v.getId()) {
            case R.id.b1:
        // действия, совершаемые после нажатия на кнопку
        // Создаем объект Intent для вызова новой Activity
        Intent intent = new Intent(this, Cush.class);
        // запуск activity
        startActivity(intent);
        break;
            case R.id.b2:
                // действия, совершаемые после нажатия на кнопку
                // Создаем объект Intent для вызова новой Activity
                Intent inten = new Intent(this, Glag.class);
                // запуск activity
                startActivity(inten);
                break;
            case R.id.b3:
                // действия, совершаемые после нажатия на кнопку
                // Создаем объект Intent для вызова новой Activity
                Intent inte = new Intent(this, Pril.class);
                // запуск activity
                startActivity(inte);
                break;
            case R.id.b4:
                // действия, совершаемые после нажатия на кнопку
                // Создаем объект Intent для вызова новой Activity
                Intent in = new Intent(this, Mesto.class);
                // запуск activity
                startActivity(in);
                break;
            case R.id.b5:
                // действия, совершаемые после нажатия на кнопку
                // Создаем объект Intent для вызова новой Activity
                Intent i = new Intent(this, Pred.class);
                // запуск activity
                startActivity(i);
                break;
           }


    }

}
