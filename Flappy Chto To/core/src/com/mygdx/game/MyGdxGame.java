package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;//область адресов для отрисовки и управления объектами
	Background bg;
	
	@Override
	public void create () { //метод который вызывется единажды, производится подгрузка элементов, первичный расчет математики
		batch = new SpriteBatch(); //создается батч
		bg = new Background();
	}

	@Override
	public void render () {
	    update();
		Gdx.gl.glClearColor(1, 1, 1, 1);//создание цвета
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);//	использование цвета
		batch.begin();
		bg.render(batch);
		batch.end();
	}

	public void update()
    {
        bg.update();
    }

	@Override
	public void dispose () { //очистка
		batch.dispose();

	}
}