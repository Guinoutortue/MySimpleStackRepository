package dcll.ggui.MySimpleStack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.lang.IndexOutOfBoundsException;

public class Implentation implements SimpleStack{

	private ArrayList<Item> liste;
	
	public Implentation() {
		liste = new ArrayList<Item>();
	}
	
	@Override
	public boolean isEmpty() {
		boolean res=false;
		if(liste.size()==0) {
			res=true;
		}
		return res;
	}

	@Override
	public int getSize() {
		return liste.size();
	}

	@Override
	public void push(Item item) {
		liste.add(item);
	}

	@Override
	public Item peek() throws EmptyStackException {
		Item res;
		try {
			res=liste.get(getSize());
		}catch(java.lang.IndexOutOfBoundsException e) {
			throw new EmptyStackException();
		}
		return res;
	}

	@Override
	public Item pop() throws EmptyStackException {
		Item res;
		try {
			res=liste.get(getSize());
			liste.remove(getSize());
		}catch(java.lang.IndexOutOfBoundsException e) {
			throw new EmptyStackException();
		}
		return res;
	}

}
