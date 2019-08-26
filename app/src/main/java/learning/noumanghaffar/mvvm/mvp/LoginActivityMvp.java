package learning.noumanghaffar.mvvm.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import learning.noumanghaffar.mvvm.R;
import learning.noumanghaffar.mvvm.User;

/* This is UI class which updated the user data. We use Butter knife for View coupling.  */
public class LoginActivityMvp extends AppCompatActivity implements LoginContract.View {

    @BindView(R.id.txt_username_val)
    TextView userNameVal;

    @BindView(R.id.txt_user_age_val)
    TextView userAgeVal;

    @BindView(R.id.txt_user_sir_name_val)
    TextView userSirNamVal;

    @BindView(R.id.txt_user_occu_val)
    TextView txtUserOccuVal;

    @BindView(R.id.txt_user_id_val)
    TextView txtUserIdVal;

    @BindView(R.id.txt_user_city_val)
    TextView txtUserCityVal;

    @BindView(R.id.txt_user_country_val)
    TextView txtUserCountryVal;

    @BindView(R.id.txt_user_salary_val)
    TextView txtUserRevenueVal;

    private LoginPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_mvp);
        ButterKnife.bind(this);
        //Initiating presenter
        mPresenter = new LoginPresenter(this);
        //Loading data
        mPresenter.loadUserData();

    }
    // Updating view on Data.
    @Override
    public void updateUserDataOnUi(User user) {
        if (user != null) {
            userNameVal.setText(user.userName);
            userAgeVal.setText(user.userAge + "");
            userSirNamVal.setText(user.userSirName);
            txtUserOccuVal.setText(user.userOcc);
            txtUserIdVal.setText(user.userId);
            txtUserCityVal.setText(user.userCity);
            txtUserCountryVal.setText(user.userCountry);
            txtUserRevenueVal.setText(user.userSalary);
        } else {
            userNameVal.setText("");
            userAgeVal.setText("");
            userSirNamVal.setText("");
            txtUserOccuVal.setText("");
            txtUserIdVal.setText("");
            txtUserCityVal.setText("");
            txtUserCountryVal.setText("");
            txtUserRevenueVal.setText("");
        }
    }
}
