package ddns.android.vuls.activities.net;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ddns.android.vuls.R;

public class NetActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net);
        findViewById(R.id.btn_HttpsURLConnection).setOnClickListener(this);
        findViewById(R.id.btn_SSLPinning).setOnClickListener(this);
        findViewById(R.id.btn_anti).setOnClickListener(this);
        findViewById(R.id.btn_proto).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_HttpsURLConnection:
                startActivity(new Intent(this, HttpsURLConnectionActivity.class));
                break;
            case R.id.btn_SSLPinning:
                startActivity(new Intent(this, SSLPinningActivity.class));
                break;
            case R.id.btn_anti:
                startActivity(new Intent(this, AntiActivity.class));
                break;
            case R.id.btn_proto:
                startActivity(new Intent(this, ProtoActivity.class));
                break;
            default:
                break;

        }
    }
}
