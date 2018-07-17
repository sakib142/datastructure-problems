package com.datastructure.list.immutableList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Mohammad.Sakib
 * 
 *         Implementation of ImmutableList by overriding its methods
 *
 */
public class CustomImmutableList implements List<String> {

	final List<String> list;

	public CustomImmutableList(List<String> list) {
		this.list = list;
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean add(String e) {
		throw new UnsupportedOperationException();
	}

	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(Collection<? extends String> c) {
		throw new UnsupportedOperationException();
	}

	public boolean addAll(int index, Collection<? extends String> c) {
		throw new UnsupportedOperationException();
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub

	}

	public String get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public String set(int index, String element) {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(int index, String element) {
		throw new UnsupportedOperationException();

	}

	public String remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ListIterator<String> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public ListIterator<String> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
