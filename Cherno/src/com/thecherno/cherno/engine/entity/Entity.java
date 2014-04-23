package com.thecherno.cherno.engine.entity;

import com.thecherno.cherno.engine.interfaces.Renderable;
import com.thecherno.cherno.engine.interfaces.Updatable;
import com.thecherno.cherno.engine.level.Level;

public abstract class Entity implements Renderable, Updatable {

	protected int x, y;
	private boolean removed = false;
	protected Level level;

	public boolean isRemoved() {
		return removed;
	}

	public void remove() {
		removed = true;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void init(Level level) {
		this.level = level;
	}

}
