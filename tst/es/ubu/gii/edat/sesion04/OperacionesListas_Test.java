package es.ubu.gii.edat.sesion04;


import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class OperacionesListas_Test {


	@Test
	public void testDivideYCompara() {
		int pivote = 6;
		List<Integer> l1 = Arrays.asList(2,2,3,4,2,7,2,5,9,12,4,7);
		List<Integer> lr = Arrays.asList(3);
		assertEquals(lr,OperacionesListas.divideYCompara(l1,pivote));
	}

	@Test
	public void testDivideYCompara2() {
		int pivote = 5;
		List<Integer> l1 = Arrays.asList(2,2,3,4,2,7,2,5,9,12,4,7);
		List<Integer> lr = Arrays.asList(3);
		assertEquals(lr,OperacionesListas.divideYCompara(l1,pivote));
	}

	@Test
	public void testDivideYReordena() {
		int pivote = 6;
		List<Integer> l1 = Arrays.asList(2,2,3,4,2,7,2,5,9,12,4,7,9);
		List<Integer> lr = Arrays.asList(7,2,2,5,4,9,3,12,2,4,2,7,9);
		assertEquals(lr,OperacionesListas.divideYReordena(l1,pivote));
	}

	@Test
	public void testDivideYReordena2() {
		int pivote = 5;
		List<Integer> l1 = Arrays.asList(2,2,3,4,2,7,2,5,9,12,4,7,9);
		List<Integer> lr = Arrays.asList(2, 7, 4, 2, 3, 5, 2, 9, 2, 12, 4, 7, 9);
		assertEquals(lr,OperacionesListas.divideYReordena(l1,pivote));
	}

}
