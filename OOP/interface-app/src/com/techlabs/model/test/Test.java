package com.techlabs.model.test;

import com.techlabs.model.Boy;
import com.techlabs.model.IEmotionable;
import com.techlabs.model.IMannerable;
import com.techlabs.model.Man;

public class Test {
	public static void main(String[] args) {
		Boy boy = new Boy();
		Man man = new Man();

		atTheParty(boy);
		atTheParty(man);
		atTheMovie(boy);
		//atTheMovie(man);
	}

	private static void atTheMovie(IEmotionable object) {
		object.cry();
		object.laugh();
	}

	private static void atTheParty(IMannerable object) {
		object.wish();
		object.depart();
	}
}
