package com.hashedin.Matrix;

import java.util.Arrays;

public class Matrix {
	private int rows;
	private int columns;
	private int arr[][];

	public Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		arr = new int[rows][columns];
	}

	/**
	 * Set values for the given row
	 * 
	 * @param rowNumber
	 *            0 based row index
	 * @param elements
	 *            elements in this row
	 */
	public void setRow(int rowNumber, int... elements) {
		int k = 0;
		for (int val : elements) {
			arr[rowNumber][k++] = val;
		}
	}

	/**
	 * Adds two matrices
	 * 
	 * @param b
	 *            the second matrix
	 * @return a new matrix 
	 */
	public Matrix add(Matrix b) {
		return operation(b, 1);
	}

	public Matrix subtract(Matrix b) {
		return operation(b, -1);
	}

	private Matrix operation(Matrix b, int operation)
			throws IllegalArgumentException {

		if (this.rows != b.rows && this.columns != b.columns) {
			throw new IllegalArgumentException("Rows or column not equal");
		}

		Matrix d = new Matrix(b.rows, b.columns);

		for (int i = 0; i < b.rows; i++) {
			for (int j = 0; j < b.columns; j++) {
				d.arr[i][j] = this.arr[i][j] + operation * b.arr[i][j];
			}
		}
		return d;
	}

//	private Matrix mul(Matrix b) throws IllegalArgumentException {
//
//		if (this.columns != b.rows) {
//			throw new IllegalArgumentException("could not be multiplied");
//		}
//
//		Matrix d = new Matrix(this.rows, b.columns);
//
//		for (int i = 0; i < this.rows; i++) {
//			for (int j = 0; j < b.columns; j++) {
//				for(int k=0;k=)
//				d.arr[i][j] = this.arr[i][j] + operation * b.arr[i][j];
//			}
//		}
//		return d;
//	}

	// @Override
	// public boolean equals(Object other) {
	// if(!(other instanceof Matrix)) {
	// return false;
	// }
	//		
	// Matrix b = (Matrix)other;
	//		
	// if (this.rows != b.rows && this.columns != b.columns) {
	// return false;
	// }
	// for (int i = 0; i < this.rows; i++) {
	// for (int j = 0; j < this.columns; j++) {
	// if (this.arr[i][j] != b.arr[i][j]) {
	// return false;
	// }
	// }
	// }
	// return true;
	// }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(arr);
		result = prime * result + columns;
		result = prime * result + rows;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matrix other = (Matrix) obj;
		if (!Arrays.equals(arr, other.arr))
			return false;
		if (columns != other.columns)
			return false;
		if (rows != other.rows)
			return false;
		return true;
	}

	
	 @Override
	 public String toString() {
		 StringBuilder buffer = new StringBuilder();
		 for (int i = 0; i < this.rows; i++) {
			 for (int j = 0; j < this.columns; j++) {
				 buffer.append(" ").append(arr[i][j]);
			 }
			 buffer.append("\n");
		 }
		 return buffer.toString();
	 }
//
//	@Override
//	public String toString() {
//		return "Matrix [arr=" + Arrays.toString(arr) + ", columns=" + columns
//				+ ", rows=" + rows + "]";
//	}
}
