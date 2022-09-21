package model;

public class MouseLocationModel {
	private int counterClick;
	private int x, y;
	private boolean isInComponent;
	public MouseLocationModel(){
		counterClick = 0;
		x = y = 0;
		isInComponent = false;
	}
	public MouseLocationModel(int counterClick, int x, int y, boolean isInComponent) {
		super();
		this.counterClick = counterClick;
		this.x = x;
		this.y = y;
		this.isInComponent = isInComponent;
	}
	public int getCounterClick() {
		return counterClick;
	}
	public void setCounterClick(int counterClick) {
		this.counterClick = counterClick;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isInComponent() {
		return isInComponent;
	}
	public void setInComponent(boolean isInComponent) {
		this.isInComponent = isInComponent;
	}
	public void increaseNumOfClick() {
		counterClick++;
	}
}
