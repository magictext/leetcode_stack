package me_341;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NestedIterator implements Iterator<Integer> {

	LinkedList<Integer> buff = new LinkedList<Integer>();

	public NestedIterator(List<NestedInteger> nestedList) {
		helper(nestedList);
	}

	@Override
	public Integer next() {
		if (hasNext())
			return buff.removeFirst();
		return -1;
	}

	@Override
	public boolean hasNext() {
		return buff.size() == 0 ? false : true;
	}

	public void helper(List<NestedInteger> nestedList) {
		for (NestedInteger item : nestedList) {
			if (item.isInteger())
				buff.add(item.getInteger());
			else
				helper(item.getList());
		}
	}

}
