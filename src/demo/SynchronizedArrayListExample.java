package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayListExample {
	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>();

		List<Integer> synchronizesArrayList = Collections.synchronizedList(arrayList);
		synchronizesArrayList.add(1);
		synchronizesArrayList.add(2);
		synchronizesArrayList.add(3);
		synchronizesArrayList.add(4);

		synchronized (synchronizesArrayList) {
			for (Integer i : synchronizesArrayList) {
				System.out.print(" " + i);
			}
		}

		/*
		 * Using CopyOnWriteArrayList no need to write explicit synchronized block
		 * List<Integer> arrayList = new ArrayList<>();
		 * 
		 * List<Integer> synchronizesArrayList = new CopyOnWriteArrayList<>();
		 * synchronizesArrayList.add(1); synchronizesArrayList.add(2);
		 * synchronizesArrayList.add(3); synchronizesArrayList.add(4);
		 * 
		 * { for (Integer i : synchronizesArrayList) { System.out.print(" " + i); } }
		 */

	}
}
