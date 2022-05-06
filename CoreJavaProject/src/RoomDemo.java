
public class RoomDemo {

	public static void main(String[] args) {
		
		int englishMark = 50; //primitive data type of int
		Room myRoom = new Room(400,200,100); //Custom datatype of type Room 
//		myRoom.length = 400;
//		myRoom.width = 200;
//		myRoom.height = 100;
		myRoom.setColor("blue");
		System.out.println(myRoom.getColor());
//		int recievedFloorArea = myRoom.calculateFloorArea();
//		System.out.println("Floor Area is:" + recievedFloorArea);
//		
//		int recievedCost = myRoom.calculatePaintingCost(1);
//		System.out.println("painting cost is: " + recievedCost);
//		
//		Room guestRoom = new Room(600,400,200,"cream",101);
	}

}
