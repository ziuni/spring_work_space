package kr.hs.study.beans;

public class DataBean {
	private String name;
	private int kr;
	private int eng;
	private int math;
	private int spring;
	private int tot;
	private double avg;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKr() {
		return kr;
	}
	public void setKr(int kr) {
		this.kr = kr;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getTot() {
		return kr+eng+math+spring;
	}
	public double getAvg() {
		return (kr+eng+math+spring)/4;
	}
	
}
