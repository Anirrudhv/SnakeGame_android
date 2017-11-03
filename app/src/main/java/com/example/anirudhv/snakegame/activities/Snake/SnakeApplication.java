package com.example.anirudhv.snakegame.activities.Snake;

import android.app.Application;
import com.example.anirudhv.snakegame.activities.models.Game;

/**
 * Created by anirudhv on 10/28/17.
 */


public class SnakeApplication extends Application {
    private Game snakeGame;

    public SnakeApplication() {
        this.snakeGame = null;
    }

    public Game getSnakeGame() {
        return snakeGame;
    }

    public void setSnakeGame(Game snakeGame) {
        this.snakeGame = snakeGame;
    }
}

