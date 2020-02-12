package com.techlab.chapter2;

public class Drumkit {
	boolean topHat=true;
	boolean snare=true;
	public static void main(String[] args0) {
		Drumkit d= new Drumkit();
		d.playSnare();
		d.playTopHat();
		d.snare=false;
		if(d.snare==true) {
			d.playSnare();
		}
	}
	void playSnare() {
		System.out.println("Bang Bang Ba-Bang");
	}
	void playTopHat(){
		System.out.println("Ding Ding Da-Ding");
	}
}
