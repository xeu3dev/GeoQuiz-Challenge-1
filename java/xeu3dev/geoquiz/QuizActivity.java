package xeu3dev.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button TrueButton;
    private Button FalseButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        // Получение ссылок на виджеты
        TrueButton = (Button) findViewById(R.id.true_button);
        // Назначение слушателя для кнопки
        TrueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
        // Создание уведомлений
                Toast toast =  Toast.makeText(QuizActivity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 0 , 0);
                toast.show();
            }
        });
        FalseButton = (Button) findViewById(R.id.false_button);
        FalseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Toast toast = Toast.makeText(QuizActivity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 0, 0);
                toast.show();
            }
        });
    }
}
