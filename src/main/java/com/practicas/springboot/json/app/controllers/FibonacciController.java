package com.practicas.springboot.json.app.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practicas.springboot.json.app.service.IServiceFibonacci;

@Controller
public class FibonacciController {

	@Autowired
	private IServiceFibonacci fibonacci;

	@PostMapping("/isFibonacci")
	@ResponseBody
	public Map<String, Object> DeterminarFibonacci(@RequestBody JSONObject json, Integer numeroInput) {
		Map<String, Object> map = new LinkedHashMap<String, Object>();

		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			json = new JSONObject("{input: '" + numeroInput + "'}");
			if (fibonacci.comprobarNumeroFibonacci(json.getInt("input")) == true) {
				map.put("success", true);
				map.put("message", "Pertenece a Fibonacci");
				map.put("date", dtf.format(LocalDateTime.now()));
			} else {
				map.put("success", false);
				map.put("message", "No pertenece a Fibonacci");
				map.put("date", dtf.format(LocalDateTime.now()));
			}
		} catch (JSONException e) {
			map.put("mensaje error", "Debes ingresar un formato numerico valido");
		}
		return map;
	}
}
