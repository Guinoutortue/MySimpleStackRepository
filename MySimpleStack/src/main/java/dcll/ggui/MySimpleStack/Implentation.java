package dcll.ggui.MySimpleStack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Implentation implements SimpleStack{

	private Item [] liste;
	
	private int nbElem;
	
	private final int TAILLE = 10;
	public Implentation() {
		liste = new Item[TAILLE];
		nbElem = 0;
	}
	
	@Override
	public boolean isEmpty() {
		if(nbElem == TAILLE) {
			return true;
		}
		return true;
	}

	@Override
	public int getSize() {
		return TAILLE;
	}

	@Override
	public void push(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Item peek() throws EmptyStackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item pop() throws EmptyStackException {
		// TODO Auto-generated method stub
		return null;
	}

}
