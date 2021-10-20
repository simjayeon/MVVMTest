package kr.sharenshare.mvvmtest.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.sharenshare.mvvmtest.R;
import kr.sharenshare.mvvmtest.databinding.ActivityMainBinding;
import kr.sharenshare.mvvmtest.model.UserProfile;

public class MainActivity extends AppCompatActivity {
    //데이터 바인딩 : 데이터와 뷰를 연결하는 작업을 레이아웃에서 처리
    // 뷰 바인딩 클래스 생성을 안하고 싶을 때(레이아웃에 바인딩 클래스가 필요 없을 때) xml 최상단에 작성
    //tools:viewBindingIgnore="true"

    //바인딩 클래스 이름은 규칙이 정해져 있으니 알맞게 사용해야 함
    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //바인딩 클래스를 만들기 위하여 작성 inlate-> xml에 있는 뷰를 객체화
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //생성한 루트 뷰를 넘겨줌
        setContentView(mainBinding.getRoot());
    }

    /*
    //뷰 바인딩
    //바인딩 된 객체 안에 있는 name, phone, address에 접근하여 사용
    private  void updateUI(UserProfile userProfile){
        mainBinding.name.setText("아이유");
        mainBinding.phone.setText("010-1111-1111");
        mainBinding.address.setText("사랑시 고백구 행복동");

    }

     */
}