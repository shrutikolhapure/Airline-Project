package AirlineReservationSystem;

public class Conn {
public Conn() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
