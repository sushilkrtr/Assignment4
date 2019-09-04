
public class Coordinator {

	public static void main(String[] args) {
		
		DAC dc=new DAC("DAC",62,46);
		dc.placementPercentage();
		WIMC wc=new WIMC("WIMC",120,45);
		wc.placementPercentage();
		DASS ds=new DASS("DASS",39,38);
		ds.placementPercentage();
	}
}
