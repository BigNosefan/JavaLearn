package chapter_5;

public class Ex5_27_Generics {

	public static void main(String[] args) {
		Chorus<Singer,MusicalInstruments> model = new Chorus<Singer,MusicalInstruments>();
		model.makeChorus(new Singer(), new MusicalInstruments());
	}

}

class Chorus <E,F> {
	void makeChorus (E person, F yueqi) {
		yueqi.toString();
		person.toString();
	}
}
class Singer {
	public String toString() {
		System.out.println("好一朵美丽的茉莉花");
		return "";
	}
}
class MusicalInstruments {
	public String toString() {
		System.out.println("|3 34 61 16|5 56 5-|");
		return "";
	}
}