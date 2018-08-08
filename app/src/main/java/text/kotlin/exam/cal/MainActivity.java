package text.kotlin.exam.cal;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edt01;
    private Button btn00;
    private Button btn01;
    private Button btn02;
    private Button btn03;
    private Button btn04;
    private Button btn05;
    private Button btn06;
    private Button btn07;
    private Button btn08;
    private Button btn09;
    private Button reset;
    private TextView txt01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt01 = (EditText) findViewById(R.id.edt01);
        btn00 = (Button) findViewById(R.id.btn00);
        btn01 = (Button) findViewById(R.id.btn01);
        btn02 = (Button) findViewById(R.id.btn02);
        btn03 = (Button) findViewById(R.id.btn03);
        btn04 = (Button) findViewById(R.id.btn04);
        btn05 = (Button) findViewById(R.id.btn05);
        btn06 = (Button) findViewById(R.id.btn06);
        btn07 = (Button) findViewById(R.id.btn07);
        btn08 = (Button) findViewById(R.id.btn08);
        btn09 = (Button) findViewById(R.id.btn09);
        reset = (Button) findViewById(R.id.reset);

        txt01 = (TextView) findViewById(R.id.txt01);
        btn00.setOnClickListener(this);
        btn01.setOnClickListener(this);
        btn02.setOnClickListener(this);
        btn03.setOnClickListener(this);
        btn04.setOnClickListener(this);
        btn05.setOnClickListener(this);
        btn06.setOnClickListener(this);
        btn07.setOnClickListener(this);
        btn08.setOnClickListener(this);
        btn09.setOnClickListener(this);
        reset.setOnClickListener(this);

        edt01 = (EditText) findViewById(R.id.edt01);


    }

    @Override
    public void onClick(View view) {

        if (!((Button) view).getText().equals("+") &&
                !((Button) view).getText().equals("-") &&
                !((Button) view).getText().equals("*") &&
                !((Button) view).getText().equals("/") &&
                !((Button) view).getText().equals("=") &&
                !((Button) view).getText().equals("c")) {

            edt01.append(((Button) view).getText().toString());
            btnRun((Button) view);
        }

        if (((Button) view).getText().equals("c"))  {
            edt01.setText("");
        }


//        switch (view.getId()) {
//            case R.id.btn00:
//                edt01.append("0");
//                btnRun(btn00);
//                break;
//            case R.id.btn01:
//                edt01.append("1");
//                btnRun(btn01);
//                break;
//            case R.id.btn02:
//                edt01.append("2");
//                btnRun(btn02);
//                break;
//            case R.id.btn03:
//                edt01.append("3");
//                btnRun(btn03);
//                break;
//            case R.id.btn04:
//                edt01.append("4");
//                btnRun(btn04);
//                break;
//            case R.id.btn05:
//                edt01.append("5");
//                btnRun(btn05);
//                break;
//            case R.id.btn06:
//                edt01.append("6");
//                btnRun(btn06);
//                break;
//            case R.id.btn07:
//                edt01.append("7");
//                btnRun(btn07);
//                break;
//            case R.id.btn08:
//                edt01.append("8");
//                btnRun(btn08);
//                break;
//            case R.id.btn09:
//                edt01.append("9");
//                btnRun(btn09);
//                break;
//
//        }

    }

    void btnRun(final Button btn) {
        Runnable runnable = new Runnable() {
            int count = 0;

            @Override
            public void run() {
                while (true) {

                    int color = 0;
//                    Random random = new Random();
                    color = Color.argb(count, 57, 126, 145);
//                    color = Color.argb(count, random.nextInt(255), random.nextInt(255), random.nextInt(255));
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    btn.setBackgroundColor(color);

                    if (count == 255) {
                        break;
                    }

                    count++;
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
