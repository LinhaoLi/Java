import java.util.Iterator;
import java.util.NoSuchElementException;

public class PositionalelementIterator<E> implements Iterator<E> {
	//implements names in another file
	//TODO: choose private member variables
	private Positionalelement<E> element;
	private Position<E> current;

	public PositionalelementIterator(Positionalelement<E> L) { //TODO: choose parameters
		//TODO: implement this
		element = L;
		if(element.isEmpty()){current = null;}
		else{current = element.first();}

	}

	@Override
	public boolean hasNext() {
		//TODO: implement this
		return current!=null;
	}

	@Override
	public E next() {
		//TODO: implement this
		if(current == null){throw new NoSuchElementException("element Ended");}
		E toReturn = current.getElement();
		if(current == element.last()){
			current= null;
		}else{
			current =element.after(current);
		}
		return toReturn;
	}
}
