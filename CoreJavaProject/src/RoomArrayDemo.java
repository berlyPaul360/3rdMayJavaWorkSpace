
public class RoomArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room myRoom = new Room(500,300,100);
		
		Room[] allRooms = new Room[3];// here array of 3 room references is created
		
		System.out.println(allRooms[0].length);// will give null pointer exception
		
		allRoom[0] = new Room(200,100,50);
		allRoom[1] = new Room(400,200,150);
		allRoom[2] = new Room(300,100,50);
		
		Room[] hallRooms = {new Room(30,20,10), new Room(50,30,20), new Room(70,30,20)};//initialized
		
	}

}
