
public class Room {
	
	// instance variables
		private int length;
		private int width;
		private int height;
		private String color;
		private int roomNo;

	
	// lookout for constructor
		Room(int length, int width, int height, String color, int roomNo) {
//			this.length = length;
//			this.width = width;
//			this.height = height;
//			this.color = color;
			this(length, width, height, color);
			this.roomNo = roomNo;
		}

		Room(int length, int width, int height, String color) {
//			this.length = length;
//			this.width = width;
//			this.height = height;
			this(length, width, height);
			this.color = color;

		}

		Room(int length, int width, int height) {
			this.length = length;
			this.width = width;
			this.height = height;
		}
		// public getter/setters, accessors/mutators, read/write	

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	int calculateFloorArea() {
		int floorArea = length * width;// (variables inside a method is a local variable)

		return floorArea;
	}

	int calculatePaintingCost(int rate) {// local variable inside a parameter {
		int wallArea = (2 * length * height) + (2 * width * height);
		int paintingCost = wallArea * rate;
		return paintingCost;
	}

}
