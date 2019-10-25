package doughnutsKit;
import doughnutsKit.Box;
import doughnutsKit.Doughnut;;
public class DoughnutMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box box1 = new Box("´õÁð");
		Box box2 = new Box("ÇÏÇÁ´õÁð");
		Box box3 = new Box(7);
		Doughnut doughnut1 = new Doughnut("¸ÕÄ¡Å²µµ³Ó","¸À¾øÀ½");
		Doughnut doughnut2 = new Doughnut("Ä¡Å²µµ³Ó","ÃÊÄÚ¸À");
		Doughnut doughnut3 = new Doughnut("ÁøÈ«µµ³Ó","¼³»ç¸À");
		Doughnut doughnut4 = new Doughnut("½Ã±×´ÏÃÄµµ³Ó","¾È ÆÈ¸®´Â¸À");
		
		box1.putDoughnutsToBox("µþ±â µµ³Ó");
		box1.putDoughnutsToBox("ÃÊÄÚ µµ³Ó");
		box1.putDoughnutsToBox("¸á·Ð µµ³Ó");
		box1.putDoughnutsToBox("¹Ù³ª³ª µµ³Ó");
		box1.putDoughnutsToBox(doughnut1.printDoughnut());
		box1.putDoughnutsToBox(doughnut2.printDoughnut());
		box1.printBox();
		
		box2.putDoughnutsToBox("¸Á°í µµ³Ó");
		box2.putDoughnutsToBox("ÄÚ³¢¸® µµ³Ó");
		box2.putDoughnutsToBox("¹Ùº¸ µµ³Ó");
		box2.putDoughnutsToBox("±¹ºñ µµ³Ó");
		box2.putDoughnutsToBox(doughnut3.printDoughnut());
		box2.printBox();
		
		box3.putDoughnutsToBox("¸®´ª½º µµ³Ó");
		box3.putDoughnutsToBox("À©µµ¿ì µµ³Ó");
		box3.putDoughnutsToBox("·¹³ë¹ö µµ³Ó");
		box3.putDoughnutsToBox("¿¡ÀÌ¼ö½º µµ³Ó");
		box3.putDoughnutsToBox(doughnut4.printDoughnut());
		box3.putDoughnutsToBox("»ï¼º µµ³Ó");
		box3.putDoughnutsToBox("¾ÖÇÃ µµ³Ó");
		box3.putDoughnutsToBox("È¥´Ù µµ³Ó");
		box3.putDoughnutsToBox("Åä¿äÅ¸ µµ³Ó");
		box3.printBox();
			
	}

}
