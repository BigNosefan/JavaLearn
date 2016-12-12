package chapter_5;

interface Compute<E,F> {
	void makeChorus(E x,F y);
}
class Chorus2<E,F> implements Compute<E,F> {

	@Override
	public void makeChorus(E x, F y) {
		y.toString();
		x.toString();
	}
	
}
class Singer2 {
	public String toString() {
		System.out.println("好一朵美丽的茉莉花");
		return "";
	}
	
}
class MusicalInstruments2 {
	public String toString() {
		System.out.println("|3 34 61 16|5 56 5-|");
		return "";
	}
}

public class Ex5_29 {

	public static void main(String[] args) {
		Chorus2<Singer2,MusicalInstruments2> model = new Chorus2<Singer2,MusicalInstruments2>();
		model.makeChorus(new Singer2(), new MusicalInstruments2());
	}

}
