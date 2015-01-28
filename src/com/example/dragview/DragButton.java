package com.example.dragview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class DragButton  extends Activity{

	private int parts;

	public int getParts() {
		return parts;
	}

	public void setParts(int parts) {
		this.parts = parts;
	}

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Button b1 = (Button) findViewById(R.id.button1);

	}
}

