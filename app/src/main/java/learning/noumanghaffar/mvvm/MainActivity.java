package learning.noumanghaffar.mvvm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import learning.noumanghaffar.mvvm.mvp.LoginActivityMvp;
import learning.noumanghaffar.mvvm.mvvm.LoginActivityMVVM;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.btn_mvp)
    public void onMvpClick() {
        Intent intent = new Intent(MainActivity.this, LoginActivityMvp.class);
        startActivity(intent);

    }

    @OnClick(R.id.btn_mvvm)
    public void onMVVMClick() {
        Intent intent = new Intent(MainActivity.this, LoginActivityMVVM.class);
        startActivity(intent);

    }

}
