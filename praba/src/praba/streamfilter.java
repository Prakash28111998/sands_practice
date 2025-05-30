package praba;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamfilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Babu");
		names.add("Arivu");
		names.add("Ballon");
		names.add("Charlie");
		List<String> ls = Stream.of("Prabu","Arivu","Anu","Manjal").filter(c->c.endsWith("u")).map(c->c.toUpperCase()).collect(Collectors.toList());
		List<String> lp =Stream.of("praksh","anthosh","prasanth").filter(c->c.endsWith("sh")).map(c->c.toLowerCase()).collect(Collectors.toList());
		
			
//		Long A=names.stream().filter(p -> p.startsWith("B")).count();
//		System.out.println(A);
//		names.stream().filter(a->a.length()>4).forEach(a->System.out.println(a));
//		names.stream().filter(b->b.length()>4).limit(2).forEach(b->System.out.println(b));
//		names.stream()
        System.out.println(ls.get(1));
	}

}
