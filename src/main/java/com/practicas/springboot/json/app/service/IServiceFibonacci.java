package com.practicas.springboot.json.app.service;

import java.util.List;

public interface IServiceFibonacci {
	
	public int recursividadFibonacci(int n);
	
	public List<Integer> listadoNumerosFibonacci();
	
	public boolean comprobarNumeroFibonacci(int num);
	
}
