package com.hashedin.Matrix;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MatrixDriver {

	public static void main(String[] args) {
		Matrix a = new Matrix(2, 3);
		a.setRow(0, 1, 2, 3);
		a.setRow(1, 4, 5, 6);
		
		Matrix b = new Matrix(2, 3);
		b.setRow(0, 7, 8, 9);
		b.setRow(1, 10, 11, 12);
		
		
		Matrix d = a.add(b);
		d = a.subtract(b);
		
		if(a.equals(b))
		{
			System.out.println("Equal \n");
		}
		else
		{
			System.out.print("NOT Equal \n");
		}
		System.out.println(d);
		
		Map<String, String> capitals = new HashMap<String, String>();
		capitals.put("Maharashtra", "Mumbai");
		capitals.put("Karnataka", "Bangalore");
		capitals.put("Goa", "Panjim");
		capitals.put("Tamil Nadu", "Chennai");
		
		
		for(String s : capitals.values()) {
			System.out.println(s);
		}
		for(String key : capitals.keySet()) {
			System.out.println(key);
		}
	}

}
