package model;

import java.awt.Color;

public class ColorModel {
	private Color forgeground;
	private Color background;
	private boolean opaque;

	public ColorModel() {
		super();
		this.forgeground = Color.BLACK;
		this.background = Color.WHITE;
		this.opaque = true;
	}

	public ColorModel(Color forgeground, Color background, boolean opaque) {
		super();
		this.forgeground = forgeground;
		this.background = background;
		this.opaque = opaque;
	}


	public Color getForgeground() {
		return forgeground;
	}

	public void setForgeground(Color forgeground) {
		this.forgeground = forgeground;
	}

	public Color getBackground() {
		return background;
	}

	public void setBackground(Color background) {
		this.background = background;
	}

	public boolean isOpaque() {
		return opaque;
	}

	public void setOpaque(boolean opaque) {
		this.opaque = opaque;
	}
	
	public void setAll(Color forgeColor, Color backColor, boolean opaque) {
		this.forgeground = forgeColor;
		this.background = backColor;
		this.opaque = opaque;
	}
}
