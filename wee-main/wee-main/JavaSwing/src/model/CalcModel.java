package model;

public class CalcModel {
	private double no1Value;
	private double no2Value;
	private double resultValue;

	public CalcModel() {
		this.no1Value = 0;
		this.no2Value = 0;
	}

	public CalcModel(double a, double b) {
		super();
		this.no1Value = a;
		this.no2Value = b;
	}

	public double getNo1Value() {
		return no1Value;
	}

	public void setNo1Value(double no1Value) {
		this.no1Value = no1Value;
	}

	public double getNo2Value() {
		return no2Value;
	}

	public void setNo2Value(double no2Value) {
		this.no2Value = no2Value;
	}

	public double getResultValue() {
		return resultValue;
	}

	public void setResultValue(double resultValue) {
		this.resultValue = resultValue;
	}

	public double add() {
		return resultValue = no1Value + no2Value;
	}

	public double sub() {
		return resultValue = no1Value - no2Value;
	}
	public double mul() {
		return resultValue = no1Value * no2Value;
	}
	public double div() {
		return resultValue = no1Value / no2Value;
	}
	
	public double pow() {
		return resultValue = Math.pow(no1Value, no2Value);
	}

	public double mod() {
		return resultValue = no1Value % no2Value;
	}
}
