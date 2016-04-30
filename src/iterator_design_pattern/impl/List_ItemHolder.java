package iterator_design_pattern.impl;

import iterator_design_pattern.I_ItemHolder;
import iterator_design_pattern.I_Iterator;
import iterator_design_pattern.Item;

import java.util.Iterator;
import java.util.List;

public class List_ItemHolder implements I_ItemHolder {

	private List<Item> items;	
	
	public List_ItemHolder(List<Item> items) {
		super();
		this.items = items;
	}

	@Override
	public I_Iterator createIterator() {
		return new List_Iterator(items.iterator());
	}
	
	class List_Iterator implements I_Iterator {
		
		private Iterator<Item> it;
		
		public List_Iterator(Iterator<Item> it) {
			this.it = it;
		}

		@Override
		public boolean hasNext() {
			return it.hasNext();
		}

		@Override
		public Item next() {
			return it.next();
		}
		
	}

}
