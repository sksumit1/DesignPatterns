package iterator_design_pattern.impl;

import iterator_design_pattern.I_ItemHolder;
import iterator_design_pattern.I_Iterator;
import iterator_design_pattern.Item;

public class Array_ItemHolder implements I_ItemHolder {

	private Item[] items;	
	
	public Array_ItemHolder(Item[] items) {
		super();
		this.items = items;
	}

	@Override
	public I_Iterator createIterator() {
		return new Array_Iterator(this.items);
	}
	
	class Array_Iterator implements I_Iterator {
		
		private int index = -1;
		private Item[] items;
		
		public Array_Iterator(Item[] items) {
			this.items = items;
		}

		@Override
		public boolean hasNext() {
			if(items.length > (index+1)) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public Item next() {
			return items[++index];
		}
		
	}

}
