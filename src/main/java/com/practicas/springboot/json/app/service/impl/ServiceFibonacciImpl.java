package com.practicas.springboot.json.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practicas.springboot.json.app.service.IServiceFibonacci;

@Service
public class ServiceFibonacciImpl implements IServiceFibonacci {

	@Override
	public int recursividadFibonacci(int n) {
		switch (n) {
		case 0:
			return 0;
		case 1:
			return 1;
		default:
			return recursividadFibonacci(n - 1) + recursividadFibonacci(n - 2);
		}
	}

	@Override
	public List<Integer> listadoNumerosFibonacci() {
		int numero = 0;
		List<Integer> lista = new ArrayList<>();
		while (numero < 21) {
			lista.add(recursividadFibonacci(numero));
			numero++;
		}
		return lista;
	}

	@Override
	public boolean comprobarNumeroFibonacci(int num) {
		int cantidad = listadoNumerosFibonacci().size();
		for (int i = 0; i < cantidad; i++) {
			if (num == listadoNumerosFibonacci().get(i)) {
				return true;
			}
		}
		return false;
	}

}
