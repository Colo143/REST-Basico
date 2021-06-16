package com.practicas.springboot.json.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.practicas.springboot.json.app.service.impl.ServiceFibonacciImpl;

@SpringBootTest
class FobinacciApplicationTest {
	
	@Autowired
	ServiceFibonacciImpl serviceFibonacciImpl;
	
	
	@Test
	void getListadoNumerosFibonacci(){
		int numero = 0, iterator=1;
		List<Integer> lista = new ArrayList<>();
		while (numero < 21) {
			lista.add(serviceFibonacciImpl.recursividadFibonacci(numero));
			numero++;
		}
		
		System.out.println("Listado de los 21 primeros numeros Fibonacci:");
		for(int i=0; i < lista.size(); i++) {
			System.out.println("Numero " + iterator++ + ": " + lista.get(i));
		}
	}
	
	@Test
	void comprobarCantidadNumerosFibonacci() {
		Assertions.assertEquals(21, serviceFibonacciImpl.listadoNumerosFibonacci().size());
	}
	
	@Test
	void getComprobarNumeroFibonacci() {
		System.out.println("");
		Scanner entradaDatoNumerico = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		int numero = entradaDatoNumerico.nextInt();
		if(numero > 6765) {
			System.out.println("Numero Fuera de Rango. Recuerde que es una lista finita de los primeros 21 numeros de Sucesión Fibonacci");
		} else if(serviceFibonacciImpl.comprobarNumeroFibonacci(numero)) {
			System.out.println("El numero "+ numero +" forma parte de la Sucesión Fibonacci");
		} else {
			System.out.println("El numero "+ numero +" no forma parte de la Sucesión Fibonacci");
		}
	}

}
