package com.techlabs.iterator1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Array<T> implements Iterable<T> {
	T[] values;

	public Array(T[] values) {
		this.values = values;
	}

	class ArrayIterator implements Iterator<T> {
		int current = 0;

		public boolean hasNext() {
			if (current < Array.this.values.length) {
				return true;
			} else {
				return false;
			}
		}

		public T next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			return values[current++];
		}
	}

	public T get(int index) {
		return values[index];
	}

	public void set(int index, T value) {
		values[index] = value;
	}

	public int length() {
		return values.length;
	}

	public Iterator<T> iterator() {
		return new ArrayIterator();
	}

	public static void main(String[] args) {
		String[] strings = new String[] { "Hello", "World", "Swabhav",
				"Techlabs" };

		Array<String> array = new Array<String>(strings);

		for (String s : array) {
			System.out.println(s);
		}
	}
}
