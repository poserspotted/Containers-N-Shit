import java.util.ArrayList;
import java.util.Collections;

public class ContainerDriver {

	public static void main(String[] args) {
		System.out.println("-----------------------");
		System.out.println("Testing toString");
		System.out.println("-----------------------");
		Container<Integer> container1 = new Container<>("CREX", 145678, 14);
		System.out.println(container1);
		System.out.println("-----------------------");
		System.out.println("Testing Display Contents");
		System.out.println("-----------------------");
		container1.displayContents();
		container1.addContent(2);
		container1.addContent(3);
		container1.addContent(6);
		container1.displayContents();
		System.out.println("-----------------------");
		System.out.println("Testing isEmpty");
		System.out.println("-----------------------");
		System.out.print(container1.isEmpty());
		System.out.println(" | should be false");
		Container<Integer> container2 = new Container<>("CREX", 253987, 15, 18);
		Container<Integer> container3 = new Container<>("GATX", 542853, 17);
		Container<Integer> container4 = new Container<>("BNSF", 572630, 32, 9);
		System.out.print(container3.isEmpty());
		System.out.println(" | should be true");
		ArrayList<Container<Integer>> containerList = new ArrayList<>();
		containerList.add(container1);
		containerList.add(container2);
		containerList.add(container3);
		containerList.add(container4);
		System.out.println("-----------------------");
		System.out.println("Testing Sorting/compareTo");
		System.out.println("-----------------------");
		for(Container<Integer> i : containerList) {
			System.out.println(i);
		}
		Collections.sort(containerList);
		System.out.println("-----------------------");
		for(Container<Integer> i : containerList) {
			System.out.println(i);
		}
		System.out.println("-----------------------");
		System.out.println("Testing equals");
		System.out.println("-----------------------");
		System.out.print(container1.equals(container2));
		System.out.println(" | should be false");
		System.out.println("-----------------------");
	}
}
