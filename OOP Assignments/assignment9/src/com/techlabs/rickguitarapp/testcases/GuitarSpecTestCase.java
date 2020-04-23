package com.techlabs.rickguitarapp.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.rickguitarapp.Builder;
import com.techlabs.rickguitarapp.Guitar;
import com.techlabs.rickguitarapp.GuitarSpec;
import com.techlabs.rickguitarapp.Type;
import com.techlabs.rickguitarapp.Wood;

class GuitarSpecTestCase {
	Guitar guitar = new Guitar("101abc", 82634.92,
			new GuitarSpec("stringent", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK, Wood.ADIRONDACK));

	@Test
	void test_mathesMethodOnGuitar_WithMatchingData_ReturnTrue() {
		GuitarSpec spec = new GuitarSpec("stringent", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		boolean expectedResult = true;
		boolean actualResult = spec.matches(guitar.getSpec());
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_mathesMethodOnGuitar_WithNonMatchingModelName_ReturnFalse() {
		GuitarSpec spec = new GuitarSpec("ducati", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		boolean expectedResult = false;
		boolean actualResult = spec.matches(guitar.getSpec());
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_mathesMethodOnGuitar_WithNonMatchingNumString_ReturnFalse() {
		GuitarSpec spec = new GuitarSpec("stringent", 19, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		boolean expectedResult = false;
		boolean actualResult = spec.matches(guitar.getSpec());
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_mathesMethodOnGuitar_WithNonMatchingBuilder_ReturnFalse() {
		GuitarSpec spec = new GuitarSpec("stringent", 10, Builder.FENDER, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		boolean expectedResult = false;
		boolean actualResult = spec.matches(guitar.getSpec());
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_mathesMethodOnGuitar_WithNonMatchingType_ReturnFalse() {
		GuitarSpec spec = new GuitarSpec("stringent", 10, Builder.COLLINGS, Type.ELECTRIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		boolean expectedResult = false;
		boolean actualResult = spec.matches(guitar.getSpec());
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_mathesMethodOnGuitar_WithNonMatchingFrontWood_ReturnFalse() {
		GuitarSpec spec = new GuitarSpec("stringent", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ALDER,
				Wood.ADIRONDACK);
		boolean expectedResult = false;
		boolean actualResult = spec.matches(guitar.getSpec());
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void test_mathesMethodOnGuitar_WithNonMatchingBackWood_ReturnFalse() {
		GuitarSpec spec = new GuitarSpec("stringent", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.BRAZILIAN_ROSEWOOD);
		boolean expectedResult = false;
		boolean actualResult = spec.matches(guitar.getSpec());
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void test_mathesMethodOnGuitar_WithNullValuetoModel_ReturnTrue() {
		GuitarSpec spec = new GuitarSpec(null, 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		boolean expectedResult = true;
		boolean actualResult = spec.matches(guitar.getSpec());
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void test_mathesMethodOnGuitar_WithBlankValuetoModel_ReturnTrue() {
		GuitarSpec spec = new GuitarSpec("", 10, Builder.COLLINGS, Type.ACCOUSTIC, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		boolean expectedResult = true;
		boolean actualResult = spec.matches(guitar.getSpec());
		assertEquals(expectedResult, actualResult);
	}
}
