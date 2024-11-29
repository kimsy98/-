package 자료구조구현;

import java.util.Arrays;

public class MyArrayList<T> implements IList<T>{
	
	private int size;
	private T[] elements;
	
	private static final int DEFAULT_SIZE = 50;
	public MyArrayList() {
	    this.size = 0;
	    this.elements = (T[]) new Object[DEFAULT_SIZE];
	}
	


	@Override
	public void add(T t) {
		if(this.size==this.elements.length) {
			this.elements=Arrays.copyOf(this.elements, this.size*2);
		}
		this.elements[this.size++] = t;
	}

	@Override
	public void insert(int index, T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		this.size = 0;
		this.elements = (T[])new Object[DEFAULT_SIZE];
		
	}

	@Override
	public boolean delete(T t) {
		for (int i = 0; i < this.size; i++) {
			if(this.elements[i].equals(t)) {
				for (int j = i; j < this.size-1; j++) {
					this.elements[j] = this.elements[j+1];
				}
				this.size--;
				return true;
			}
			
		}
		return false;
	}

	@Override
	public boolean deleteByIndex(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int index) {
		if(index<0||index>this.size()-1) {
			throw new IndexOutOfBoundsException();
		}
		return this.elements[index];
	}

	@Override
	public int indexOf(T t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return this.size==0;
	}

	@Override
	public boolean contains(T t) {
		for (int i = 0; i < this.size; i++) {
			if(this.elements[i].equals(t))return true;
		}
		return false;
	}

	@Override
	public int size() {
		return this.size;
	}
	
	public static void main(String[] args) {
		MyArrayList<Integer> mList = new MyArrayList<Integer>();
		
		mList.add(1);
		System.out.println(mList.get(0));
//		System.out.println(mList.get(1));
		System.out.println(mList.delete(1));
	}

}
