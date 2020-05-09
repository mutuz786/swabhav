package com.techlabs.gameframeworktest.gsf.board;

import java.util.*;
import com.techlabs.gameframeworktest.gsf.unit.Unit;

public class Tile {

	private List<Unit> units;

	public Tile() {
		units = new LinkedList<Unit>();
	}

	protected void addUnit(Unit unit) {
		units.add(unit);
	}

	protected void removeUnit(Unit unit) {
		units.remove(unit);
	}

	protected void removeUnits() {

	}

	protected List<Unit> getUnits() {
		return units;
	}

}
