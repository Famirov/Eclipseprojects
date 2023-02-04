package Module7.encapsulationpractice;

public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	

	public Printer(int tonerLevel,boolean duplex ) {
		
		if (-1<tonerLevel && tonerLevel<=100) {
			this.tonerLevel = tonerLevel;
		}else {
			this.tonerLevel = -1;
		}
		
		this.duplex= duplex;
		
		this.pagesPrinted =0;
		
	}
	
	public int addToner(int tonerAmount) {
		
		if(0<(tonerAmount+tonerLevel) && (tonerAmount+tonerLevel)<=100 ) {
			
			return (tonerAmount+tonerLevel);
		}else {
			return -1;
		}
		
	}
	
	public void printPages(int pages) {
		
		int pagesToPrint;
		
		if(duplex) {
			pagesToPrint = pages;
		}else {
			pagesToPrint = pages * 2;
		}
		
		this.pagesPrinted = pagesToPrint;
		
		System.out.println(pagesToPrint);
		 
		
		
	}
	
	
	public int getPagesPrinted() {
		
		return pagesPrinted;
	}
	
	
	

	
	
	
}
