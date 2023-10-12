package com.example.demo.minus.service;

import org.springframework.stereotype.Service;

@Service // Serviceクラスを示す
public class MinusService {

	public int minus(int num1, int num2) { 
		return num1 - num2;
	}
}