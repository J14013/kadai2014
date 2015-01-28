package com.example.dragview;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class DragViewListener2 implements OnTouchListener {
	// ドラッグ対象のView
	private ImageView dragView2;
	// ドラッグ中に移動量を取得するための変数
	private int oldx2;
	private int oldy2;

	public DragViewListener2(ImageView dragView2) {
		this.dragView2 = dragView2;
	}

	@Override
	public boolean onTouch(View view2, MotionEvent event2) {
		// タッチしている位置取得
		int x2 = (int) event2.getRawX();
		int y2 = (int) event2.getRawY();
		
		switch (event2.getAction()) {
		case MotionEvent.ACTION_MOVE:
			// 今回イベントでのView移動先の位置
			int left2 = dragView2.getLeft() + (x2 - oldx2);
			int top2 = dragView2.getTop() + (y2 - oldy2);
			// Viewを移動する
			dragView2.layout(left2, top2, left2 + dragView2.getWidth(), top2
					+ dragView2.getHeight());
			break;
		}

		// 今回のタッチ位置を保持
		oldx2 = x2;
		oldy2 = y2;
		// イベント処理完了
		return true;
	}
}