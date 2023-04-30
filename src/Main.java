
public class Main {

	public static void main(String[] args) {
		Celling celling = new Celling();
		Wall wall = new Wall();
		Table table = new Table();
		
		Fan [] start = {celling, wall , table};
		
		int FanSpeed = 8;
		
		for(Fan i: start) {
			if(FanSpeed == 1) {
				i.startone();
			}else if(FanSpeed ==2) {
				i.starttwo();
			}else if(FanSpeed == 3) {
				i.startthree();
			}else if(FanSpeed >=4){
				System.out.println("Invalid");
			}else if(FanSpeed == 0) {
				i.stop();
			}
		}
	}

}
