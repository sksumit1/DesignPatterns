package iterator_design_pattern;

import iterator_design_pattern.impl.Array_ItemHolder;
import iterator_design_pattern.impl.List_ItemHolder;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Item it1 = new Item("John",22);
		Item it2 = new Item("Rebecca",25);
		Item it3 = new Item("Andrew",26);
		
		List <Item> itemList = new ArrayList<Item>();
		itemList.add(it1);itemList.add(it2);itemList.add(it3);
		
		Item[] itemArray = {it1,it2,it3};
		
		System.out.println("---Using List Item Holder---");
		I_ItemHolder ith = new List_ItemHolder(itemList);
		I_Iterator ii = ith.createIterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		System.out.println("---Using Array Item Holder---");
		ith = new Array_ItemHolder(itemArray);
		ii = ith.createIterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}

	}

}
