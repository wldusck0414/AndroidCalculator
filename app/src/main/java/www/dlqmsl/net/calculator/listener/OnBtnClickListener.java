package www.dlqmsl.net.calculator.listener;

import android.view.View;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.eclipsesource.v8.V8;

public class OnBtnClickListener implements View.OnClickListener{
    public static final int BTN_AC = -1;
    public static final int BTN_DIVIDE = -2;
    public static final int BTN_PLUS = -3;
    public static final int BTN_MINUS = -4;
    public static final int BTN_MULTIPLY = -5;
    public static final int BTN_EQUAL = -6;
    private Context context;
    private TextView resTextView;
    private static StringBuilder sb;

    public OnBtnClickListener(Context context, TextView resTextView) {
        this.context = context;
        this.resTextView = resTextView;
        this.sb = new StringBuilder();
        sb.append(resTextView.getText());
    }

    @Override
    public void onClick(View view){
        Button btn = (Button) view;

        switch ((int) btn.getTag()) {
            case BTN_AC:
                sb = new StringBuilder();
                sb.append("0");
                break;
            case BTN_DIVIDE:
                sb.append("/");
                break;
            case BTN_PLUS:
                sb.append("+");
                break;
            case BTN_MINUS:
                sb.append("-");
                break;
            case BTN_MULTIPLY:
                sb.append("*");
                break;
            case BTN_EQUAL:
                V8 runtime = V8.createV8Runtime();
                int result = runtime.executeIntegerScript("eval(" + sb.toString() + ")");
                runtime.release();

                sb= new StringBuilder();
                sb.append(String.valueOf(result));

                break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if(resTextView.getText().equals("0")) {
                    sb = new StringBuilder();
                    sb.append(String.valueOf(btn.getTag()));
                }
                else {
                    sb.append(String.valueOf(btn.getTag()));
                }
                break;
        }

        resTextView.setText(sb.toString());
    }
}
