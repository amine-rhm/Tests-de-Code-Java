package com.exemple;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TabAlgosTest {

  // TU-001
  @Test
  public void testPlusGrandTableauNormal() {
    assertEquals(9, TabAlgos.plusGrand(new int[]{3, 7, 2, 9, 1}));
  }

  // TU-002
  @Test
  public void testPlusGrandUnElement() {
    assertEquals(42, TabAlgos.plusGrand(new int[]{42}));
  }

  // TU-003
  @Test
  public void testPlusGrandAvecNegatif() {
    assertEquals(-1, TabAlgos.plusGrand(new int[]{-5,-2,-10,-1}));
  }

  // TU-004
  @Test
  public void testPlusGrandAvecMelange() {
    assertEquals(5, TabAlgos.plusGrand(new int[]{-3,5,-8,2}));
  }

  // TU-005
  @Test
  public void testPlusGrandAvecZero() {
    assertEquals(0, TabAlgos.plusGrand(new int[]{0,-5,-2}));
  }

  // TU-006
  @Test
  public void testPlusGrandAvecDouble() {
    assertEquals(9, TabAlgos.plusGrand(new int[]{5,9,9,3,9}));
  }

  // TU-007
  @Test
  public void testPlusGrandEnPremierPosition() {
    assertEquals(10, TabAlgos.plusGrand(new int[]{10,3,5,1}));
  }
  
  // TU-008
  @Test
  public void testPlusGrandAuMilieu() {
    assertEquals(10, TabAlgos.plusGrand(new int[]{3,10,5,1}));
  }

  // TU-009
  @Test
  public void testPlusGrandEndernierPosition() {
    assertEquals(10, TabAlgos.plusGrand(new int[]{3,5,1,10}));
  }

// TU-010
@Test
public void testPlusGrandMaxValue() {
    assertEquals(Integer.MAX_VALUE, TabAlgos.plusGrand(new int[]{Integer.MAX_VALUE, 100, 50}));
}

// TU-011
@Test
public void testPlusGrandMinValue() {
    assertEquals(-50, TabAlgos.plusGrand(new int[]{Integer.MIN_VALUE, -100, -50}));
}

// TU-012
@Test
public void testPlusGrandMinEtMaxValue() {
    assertEquals(Integer.MAX_VALUE, TabAlgos.plusGrand(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}));
}

  // TU-013 (test d'exception)
  @Test
  public void testPlusGrandNull() {
    assertThrows(IllegalArgumentException.class, 
      () -> TabAlgos.plusGrand(null));
  }

// TU-014
@Test
public void testPlusGrandTableauVide() {
    assertThrows(IllegalArgumentException.class, () -> {
        TabAlgos.plusGrand(new int[]{});
    });
  }

// TU-015
@Test
public void testMoyenneEntiereExacte() {
    assertEquals(4.0, TabAlgos.moyenne(new int[]{2, 4, 6}));
}

// TU-016
@Test
public void testMoyenneUnSeulElement() {
    assertEquals(7.0, TabAlgos.moyenne(new int[]{7}));
}

// TU-017
@Test
public void testMoyenneAvecDécimale() {
    assertEquals(1.5, TabAlgos.moyenne(new int[]{1, 2}));
}

// TU-018
@Test
public void testMoyenneSimple() {
    assertEquals(2.0, TabAlgos.moyenne(new int[]{1, 2, 3}));
}

// TU-019
@Test
public void testMoyenneAvecNegatifs() {
    assertEquals(-4.0, TabAlgos.moyenne(new int[]{-4, -2, -6}));
}

// TU-020
@Test
public void testMoyenneMelangePosNeg() {
    assertEquals(1.5, TabAlgos.moyenne(new int[]{-2, 4, -1, 5}));
}

// TU-021
@Test
public void testMoyenneTousZeros() {
    assertEquals(0.0, TabAlgos.moyenne(new int[]{0, 0, 0}));
}

// TU-022
@Test
public void testMoyenneZerosMélangés() {
    assertEquals(5.0, TabAlgos.moyenne(new int[]{0, 5, 10}));
}

// TU-023
@Test
public void testMoyenneSommeNulle() {
    assertEquals(0.0, TabAlgos.moyenne(new int[]{1, -1, 1, -1}));
}

// TU-024
@Test
public void testMoyenneSimple2() {
    assertEquals(7.0, TabAlgos.moyenne(new int[]{5, 7, 9}));
}

// TU-025
@Test
public void testMoyenneGrandesValeurs() {
    assertEquals(200.0, TabAlgos.moyenne(new int[]{100, 200, 300}));
}

// TU-026
@Test
public void testMoyenneMaxValue() {
    assertEquals(1073741824.0, TabAlgos.moyenne(new int[]{Integer.MAX_VALUE, 1}));
}

// TU-027
@Test
public void testMoyenneMinValue() {
    assertEquals(-1073741824.0, TabAlgos.moyenne(new int[]{Integer.MIN_VALUE, 0}));
}

// TU-028
@Test
public void testMoyenneTableauNull() {
    assertThrows(IllegalArgumentException.class, () -> {
        TabAlgos.moyenne(null);
    });
}

// TU-029
@Test
public void testMoyenneTableauVide() {
    assertThrows(IllegalArgumentException.class, () -> {
        TabAlgos.moyenne(new int[]{});
    });
}

// TU-030
@Test
public void testEgauxIdentiques() {
    assertTrue(TabAlgos.egaux(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
}

// TU-031
@Test
public void testEgauxDeuxNull() {
    assertTrue(TabAlgos.egaux(null, null));
}

// TU-032
@Test
public void testEgauxDeuxVides() {
    assertTrue(TabAlgos.egaux(new int[]{}, new int[]{}));
}

// TU-033
@Test
public void testEgauxUnSeulElement() {
    assertTrue(TabAlgos.egaux(new int[]{5}, new int[]{5}));
}

// TU-034
@Test
public void testEgauxNegatifsIdentiques() {
    assertTrue(TabAlgos.egaux(new int[]{-1, -2, -3}, new int[]{-1, -2, -3}));
}

// TU-035
@Test
public void testEgauxZerosIdentiques() {
    assertTrue(TabAlgos.egaux(new int[]{0, 0, 0}, new int[]{0, 0, 0}));
}

// TU-036
@Test
public void testEgauxDoublonsIdentiques() {
    assertTrue(TabAlgos.egaux(new int[]{5, 5, 3, 3}, new int[]{5, 5, 3, 3}));
}

// TU-037
@Test
public void testEgauxOrdreDifferent() {
    assertFalse(TabAlgos.egaux(new int[]{1, 2, 3}, new int[]{3, 2, 1}));
}

// TU-038
@Test
public void testEgauxOrdreDifferent2() {
    assertFalse(TabAlgos.egaux(new int[]{1, 2, 3}, new int[]{1, 3, 2}));
}

// TU-039
@Test
public void testEgauxValeursDifferentes() {
    assertFalse(TabAlgos.egaux(new int[]{1, 2, 3}, new int[]{1, 2, 4}));
}

// TU-040
@Test
public void testEgauxTaillesDifferentes1() {
    assertFalse(TabAlgos.egaux(new int[]{1, 2}, new int[]{1, 2, 3}));
}

// TU-041
@Test
public void testEgauxTaillesDifferentes2() {
    assertFalse(TabAlgos.egaux(new int[]{1, 2, 3}, new int[]{1, 2}));
}

// TU-042
@Test
public void testEgauxPremierDifferent() {
    assertFalse(TabAlgos.egaux(new int[]{9, 2, 3}, new int[]{1, 2, 3}));
}

// TU-043
@Test
public void testEgauxMilieuDifferent() {
    assertFalse(TabAlgos.egaux(new int[]{1, 9, 3}, new int[]{1, 2, 3}));
}

// TU-044
@Test
public void testEgauxDernierDifferent() {
    assertFalse(TabAlgos.egaux(new int[]{1, 2, 9}, new int[]{1, 2, 3}));
}

// TU-045
@Test
public void testEgauxNullEtNonNull() {
    assertFalse(TabAlgos.egaux(null, new int[]{1, 2}));
}

// TU-046
@Test
public void testEgauxNonNullEtNull() {
    assertFalse(TabAlgos.egaux(new int[]{1, 2}, null));
}

// TU-047
@Test
public void testEgauxNullEtVide() {
    assertFalse(TabAlgos.egaux(null, new int[]{}));
}

// TU-048
@Test
public void testEgauxVideEtNonVide() {
    assertFalse(TabAlgos.egaux(new int[]{}, new int[]{1}));
}

// TU-049
@Test
public void testEgauxMaxValue() {
    assertTrue(TabAlgos.egaux(new int[]{Integer.MAX_VALUE}, new int[]{Integer.MAX_VALUE}));
}

// TU-050
@Test
public void testEgauxMinValue() {
    assertTrue(TabAlgos.egaux(new int[]{Integer.MIN_VALUE}, new int[]{Integer.MIN_VALUE}));
}

}