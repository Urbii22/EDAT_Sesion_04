package es.ubu.gii.edat.sesion04;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class OperacionesListas {

	static public <E> List<E> divideYCompara(List<Integer> l1, int pivote) {
		List<E> lista1 = new ArrayList<E>();
		List<E> lista2 = new ArrayList<E>();
		List<E> resultado = new ArrayList<E>();

		if (l1 == null || pivote < 0 || pivote > l1.size()) {
			throw new NoSuchElementException();
		}

		for (int i = 0; i < pivote; i++) {
			lista1.add((E) l1.get(i));
		}

		for (int i = pivote; i < l1.size(); i++) {
			lista2.add((E) l1.get(i));
		}

		for (int i = 0; i < lista1.size(); i++) {
			boolean esta = false;
			for (int j = 0; j < lista2.size(); j++) {
				if (lista1.get(i) == lista2.get(j)) {
					esta = true;
				}
			}
			if (esta == false) {

				resultado.add(lista1.get(i));
			}
		}
		return resultado;
	}

	static public <E> List<E> divideYReordena(List<Integer> l1, int pivote) {
		List<E> lista1 = new ArrayList<E>();
		List<E> lista2 = new ArrayList<E>();
		List<E> resultado = new ArrayList<E>();
		boolean salir = false;


		if (l1 == null || pivote < 0 || pivote > l1.size()) {
			throw new NoSuchElementException();
		}

		for (int i = 0; i < pivote; i++) {
			lista1.add((E) l1.get(i));
		}

		for (int i = pivote; i < l1.size(); i++) {
			lista2.add((E) l1.get(i));
		}
		
		int m = lista1.size() -1;
		int h = 0;
		while (salir == false) {
			int aux = 0;
			if (m >= 0) {
				resultado.add(lista1.get(m));
				m--;
			}else aux++;
			if (h < lista2.size()) {
				resultado.add(lista2.get(h));
				h++;
			}else aux++;
			if (aux == 2) salir = true;
		}
		return resultado;

	}

}
