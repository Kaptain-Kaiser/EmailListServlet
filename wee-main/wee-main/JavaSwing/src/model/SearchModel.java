package model;

public class SearchModel {
	private String inputString;
	private String keyString;
	private int counter;

	public SearchModel() {
		this.counter = 0;
		this.inputString = "";
		this.keyString = "";
	}

	public SearchModel(String inputString, String keyString) {
		super();
		this.inputString = inputString;
		this.keyString = keyString;
	}

	public void search() {
		counter = 0;
		int pos = 0;
		while (true) {
			pos = inputString.indexOf(keyString, pos);
			if (pos == -1)
				break;
			else {
				counter++;
				pos += keyString.length();
			}
		}
	}

	public String getInputString() {
		return inputString;
	}

	public void setInputString(String inputString) {
		this.inputString = inputString;
	}

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
