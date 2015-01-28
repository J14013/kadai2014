package com.example.dragview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class DragActivity extends Activity {

	private int parts;

	public int getParts() {
		return parts;
	}

	public void setParts(int parts) {
		this.parts = parts;
	}

	protected void onCreate(Bundle savedInstanceState) {

	    Toast.makeText(this, "スタート", Toast.LENGTH_LONG).show();

	    	Button b1 = (Button) findViewById(R.id.button1);

		if(parts==1){
			super.onCreate(savedInstanceState);
			setContentView(R.layout.drag_activity);
			// ドラッグ対象Viewとイベント処理クラスを紐付ける
			Toast.makeText(this, "1が動作しています", Toast.LENGTH_LONG).show();
			ImageView dragView = (ImageView) findViewById(R.id.imageView1);
			DragViewListener listener = new DragViewListener(dragView);
			dragView.setOnTouchListener(listener);
			}
	}


}

/*

		if(a==1){
			super.onCreate(savedInstanceState);
			setContentView(R.layout.drag_activity);
			// ドラッグ対象Viewとイベント処理クラスを紐付ける
			Toast.makeText(this, "２が動作しています", Toast.LENGTH_LONG).show();
			ImageView dragView2 = (ImageView) findViewById(R.id.imageView2);
			DragViewListener2 listener2 = new DragViewListener2(dragView2);
			dragView2.setOnTouchListener(listener2);
			a--;
			}
*/

