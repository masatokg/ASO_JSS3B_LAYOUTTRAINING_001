package jp.ac.st.asojuku.layouttraining001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();

		// LinearLayoutボタン変数にリスナーを登録する
		Button btnLINE = (Button)findViewById(R.id.btnLINE);
		btnLINE.setOnClickListener(this);

		// RelativeLayoutボタン変数にリスナーを登録する
		Button btnRELATIVE = (Button)findViewById(R.id.btnRELATIVE);
		btnRELATIVE.setOnClickListener(this);

		// FrameLayoutボタン変数にリスナーを登録する
		Button btnFRAME = (Button)findViewById(R.id.btnFRAME);
		btnFRAME.setOnClickListener(this);

		// TableLayoutボタン変数にリスナーを登録する
		Button btnTABLE = (Button)findViewById(R.id.btnTABLE);
		btnTABLE.setOnClickListener(this);

		// GridLayoutボタン変数にリスナーを登録する
		Button btnGrid = (Button)findViewById(R.id.btnGRID);
		btnGrid.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ

		// 生成して代入用のIntentインスタンス変数を用意
		Intent intent = null;
		switch(v.getId()) { //どのボタンが押されたか判定
			case R.id.btnLINE: // LinearLayoutボタンが押された

				// インテントのインスタンス生成
				intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
				break;

			case R.id.btnRELATIVE: // RelativeLayoutボタンが押された

				// インテントのインスタンス生成
				intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
				break;

			case R.id.btnFRAME: // FrameLayoutボタンが押された

				// インテントのインスタンス生成
				intent = new Intent(MainActivity.this, FrameLayoutActivity.class);
				break;

			case R.id.btnTABLE: // TableLayoutボタンが押された

				// インテントのインスタンス生成
				intent = new Intent(MainActivity.this, TableLayoutActivity.class);
				break;

			case R.id.btnGRID: // GridLayoutボタンが押された

				// インテントのインスタンス生成
				intent = new Intent(MainActivity.this, GridLayoutActivity.class);
				break;
		}
		// 次画面のアクティビティ起動
		startActivity(intent);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
