package enumConcept;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumConcept {
	
	enum Lang{
		JAVA, CSHARP, RUBY, PYTHON 
	}

	public static void main(String[] args) {
		
		
		//created a new enum set
		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);

		
		//empty enum set
		EnumSet<Lang> empty = EnumSet.noneOf(Lang.class);
		System.out.println(empty);
		
		
		//range
		EnumSet<Lang> range = EnumSet.range(Lang.JAVA, Lang.RUBY);
		System.out.println(range);
		
		
		//of
		EnumSet<Lang> of = EnumSet.of(Lang.JAVA);
		System.out.println(of);
		
		
		//multiple values
		EnumSet<Lang> multipleValues = EnumSet.of(Lang.CSHARP, Lang.PYTHON);
		System.out.println(multipleValues);
		
		
		
		//add and addAll
		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
		
		lang2.add(Lang.JAVA);
		lang2.addAll(lang1);
		System.out.println(lang2);
		
		
		//iterate enumset
		EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);
		Iterator<Lang> it = fullLang.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//remove and remove all
		EnumSet<Lang> langRemove = EnumSet.allOf(Lang.class);
		boolean b = langRemove.remove(Lang.JAVA);
		System.out.println(b);
		System.out.println(langRemove);
		
		
		boolean b1 = langRemove.removeAll(langRemove);
		System.out.println(b1);
		System.out.println(langRemove);
		
		
	}

}





































