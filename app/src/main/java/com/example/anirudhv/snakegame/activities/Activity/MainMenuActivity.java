package com.example.anirudhv.snakegame.activities.Activity;

/**
 * Created by anirudhv on 10/28/17.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.andrebento.snake.R;

public class MainMenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void onButtonClick(View view) {
        switch(view.getId()) {
            case R.id.iv_settigns:
                startActivity(new Intent(this, SettingsActivity.class));
                break;
            case R.id.btn_play:
                startActivity(new Intent(this, GameActivity.class));
                break;
            case R.id.btn_high_scores:
                break;
        }
    }
}
