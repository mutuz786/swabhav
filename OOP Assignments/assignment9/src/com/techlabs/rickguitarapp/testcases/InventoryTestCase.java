package com.techlabs.rickguitarapp.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.techlabs.rickguitarapp.Builder;
import com.techlabs.rickguitarapp.Guitar;
import com.techlabs.rickguitarapp.GuitarSpec;
import com.techlabs.rickguitarapp.Inventory;
import com.techlabs.rickguitarapp.Type;
import com.techlabs.rickguitarapp.Wood;

class InventoryTestCase {
	Inventory inventory = new Inventory();

	@Test
	void test_addInventoryMethod_CheckIfListIsUpdated() {
		inventory.addInventory("dhyyfd", 72246.62, "ekejfwek", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		int expectedResult = 1;
		int actualResult = inventory.getGuitarsLength();
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_addInventoryMethod_CheckIfDataIsEnteredCorrectly() {
		inventory.addInventory("dhyyfd", 72246.62, "ekejfwek", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		Guitar expectedResult = new Guitar("dhyyfd", 72246.62,
				new GuitarSpec("ekejfwek", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK, Wood.ADIRONDACK));
		Guitar actualResult = inventory.getGuitars().get(0);
		assertEquals(expectedResult.getSeialNumber(), actualResult.getSeialNumber());

	}

	@Test
	void test_getGuitarMethod_WithNonMatchingSerialNumber_ReturnNull() {
		Guitar expectedResult = null;
		inventory.addInventory("dhyyfd", 72246.62, "ekejfwek", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		Guitar actualResult = inventory.getGuitar("dhyy");
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_getGuitarMethod_WithMatchingSerialNumber_ReturnExpectedGuitar() {
		inventory.addInventory("dhyyfd", 72246.62, "ekejfwek", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		Guitar expectedResult = inventory.getGuitars().get(0);
		Guitar actualResult = inventory.getGuitar("dhyyfd");
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_searchMethod_WithMatchingSpecAndNullModelName_Return3() {
		inventory.addInventory("dhyyfd", 72246.62, "ekejfwek", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		inventory.addInventory("dhyyfd", 72246.62, "jhdmmjbd", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		inventory.addInventory("dhyyfd", 72246.62, "mhhdfjwy", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		int expectedResult = 3;
		int actualResult = inventory.search(new GuitarSpec(null, 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK, Wood.ADIRONDACK)).size();
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void test_searchMethod_WithMatchingSpecAndBlankModelName_ReturnExpectedGuitarListContent() {
		inventory.addInventory("dhyyfd", 72246.62, "ekejfwek", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		inventory.addInventory("dhyyfd", 72246.62, "hvyjcbj", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		inventory.addInventory("dhyyfd", 72246.62, "smydgauy", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		List<Guitar> expectedResult = inventory.getGuitars();
		List<Guitar> actualResult = inventory.search(new GuitarSpec("", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK, Wood.ADIRONDACK));
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void test_searchMethod_WithMatchingSpecAndSpecificModelName_Return1() {
		inventory.addInventory("dhyyfd", 72246.62, "ekejfwek", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		inventory.addInventory("dhyyfd", 72246.62, "hvyjcbj", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		inventory.addInventory("dhyyfd", 72246.62, "smydgauy", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		int expectedResult = 1;
		int actualResult = inventory.search(new GuitarSpec("ekejfwek", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK, Wood.ADIRONDACK)).size();
		assertEquals(expectedResult, actualResult);
	}
}
