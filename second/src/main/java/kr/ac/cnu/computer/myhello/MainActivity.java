package kr.ac.cnu.computer.myhello;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int flag = 0;
    int ans = 0;
    String a = "";
    String b = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mod = (TextView) findViewById(R.id.mod);
        TextView result = (TextView) findViewById(R.id.result);

        Button clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String temp ="";
                result.setText(temp);
            }
        });
        Button one = (Button) findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0) {
                    a += "1";
                } else {
                    b+="1";
                }
                mod.setText(mod.getText().toString()+"1");
            }
        });

        Button two = (Button) findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0) {
                    a += "2";
                } else {
                    b+="2";
                }
                mod.setText(mod.getText().toString()+"2");
            }
        });

        Button three = (Button) findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0) {
                    a += "3";
                } else {
                    b+="3";
                }
                mod.setText(mod.getText().toString()+"3");
            }
        });

        Button four = (Button) findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0) {
                    a += "4";
                } else {
                    b+="4";
                }
                mod.setText(mod.getText().toString()+"4");
            }
        });

        Button five = (Button) findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0) {
                    a += "5";
                } else {
                    b+="5";
                }
                mod.setText(mod.getText().toString()+"5");
            }
        });

        Button six = (Button) findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0) {
                    a += "6";
                } else {
                    b+="6";
                }
                mod.setText(mod.getText().toString()+"6");
            }
        });

        Button seven = (Button) findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0) {
                    a += "7";
                } else {
                    b+="7";
                }
                mod.setText(mod.getText().toString()+"7");
            }
        });

        Button eight = (Button) findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0) {
                    a += "8";
                } else {
                    b+="8";
                }
                mod.setText(mod.getText().toString()+"8");
            }
        });

        Button nine = (Button) findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0) {
                    a += "9";
                } else {
                    b+="9";
                }
                mod.setText(mod.getText().toString()+"9");
            }
        });

        Button zero = (Button) findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0) {
                    a += "0";
                } else {
                    b+="0";
                }
                mod.setText(mod.getText().toString()+"0");
            }
        });

        Button plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mod.getText().toString()+"+";
                mod.setText(text);

                flag = 1;
                if(!b.equals("")){
                    ans = Integer.parseInt(a)+Integer.parseInt(b);
                    a = Integer.toString(ans);
                    b = "";
                }
                result.setText(Integer.toString(ans));
            }
        });

        Button equal = (Button) findViewById(R.id.equal);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "";
                mod.setText(text);

                ans = Integer.parseInt(a)+Integer.parseInt(b);
                result.setText(Integer.toString(ans));
                a = "";
                b = "";
                flag = 0;
            }
        });

    }
}