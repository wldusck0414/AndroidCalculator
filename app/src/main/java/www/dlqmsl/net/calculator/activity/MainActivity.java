package www.dlqmsl.net.calculator.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


import www.dlqmsl.net.calculator.R;
import www.dlqmsl.net.calculator.listener.OnBtnClickListener;


public class MainActivity extends AppCompatActivity {
    private Button acBtn;
    private Button divideBtn;
    private Button plusBtn;
    private Button minusBtn;
    private Button multiplyBtn;
    private Button equalBtn;
    private Button zeroBtn;
    private Button oneBtn;
    private Button twoBtn;
    private Button threeBtn;
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;
    private Button sevenBtn;
    private Button eightBtn;
    private Button nineBtn;
private TextView resTexView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resTexView = (TextView) findViewById(R.id.main_result_textview);
        acBtn = (Button) findViewById(R.id.main_btn_ac);
        acBtn.setTag(OnBtnClickListener.BTN_AC);
        acBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTexView));  // getBaseContext() = MainActivity.this

        divideBtn = (Button) findViewById(R.id.main_btn_divide);
        divideBtn.setTag(OnBtnClickListener.BTN_DIVIDE);
        divideBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTexView));

        plusBtn = (Button) findViewById(R.id.main_btn_plus);
        plusBtn.setTag(OnBtnClickListener.BTN_PLUS);
        plusBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTexView));

        minusBtn = (Button) findViewById(R.id.main_btn_minus);
        minusBtn.setTag(OnBtnClickListener.BTN_MINUS);
        minusBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTexView));

        multiplyBtn = (Button) findViewById(R.id.main_btn_multiply);
        multiplyBtn.setTag(OnBtnClickListener.BTN_MULTIPLY);
        multiplyBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTexView));

        equalBtn = (Button) findViewById(R.id.main_btn_equal);
        equalBtn.setTag(OnBtnClickListener.BTN_EQUAL);
        equalBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTexView));

        zeroBtn = (Button) findViewById(R.id.main_btn_0);
        zeroBtn.setTag(0);
        zeroBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTexView));

        oneBtn = (Button) findViewById(R.id.main_btn_1);
        oneBtn.setTag(1);
        oneBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTexView));

        twoBtn = (Button) findViewById(R.id.main_btn_2);
        twoBtn.setTag(2);
        twoBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTexView));

        threeBtn = (Button) findViewById(R.id.main_btn_3);
        threeBtn.setTag(3);
        threeBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTexView));

        fourBtn = (Button) findViewById(R.id.main_btn_4);
        fourBtn.setTag(4);
        fourBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTexView));

        fiveBtn = (Button) findViewById(R.id.main_btn_5);
        fiveBtn.setTag(5);
        fiveBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTexView));

        sixBtn = (Button) findViewById(R.id.main_btn_6);
        sixBtn.setTag(6);
        sixBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTexView));

        sevenBtn = (Button) findViewById(R.id.main_btn_7);
        sevenBtn.setTag(7);
        sevenBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTexView));

        eightBtn = (Button) findViewById(R.id.main_btn_8);
        eightBtn.setTag(8);
        eightBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTexView));

        nineBtn = (Button) findViewById(R.id.main_btn_9);
        nineBtn.setTag(9);
        nineBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this,resTexView));


    }
}



