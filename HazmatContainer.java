
public class HazmatContainer<T> extends Container<T> {
	
	private String hazType;
	
	public HazmatContainer(String make, int id, int weightTons, T content, String hazType) {
		super(make, id, weightTons, content);
		this.hazType = hazType;
	}
	public HazmatContainer(String make, int id, T content, String hazType) {
		super(make, id, content);
		this.hazType = hazType;
	}
	public HazmatContainer(String make, int id, int weightTons, String hazType) {
		super(make, id, weightTons);
		this.hazType = hazType;
	}
	public HazmatContainer(String make, int id, String hazType) {
		super(make, id);
		this.hazType = hazType;
	}
	
	public String getHazType() {
		return this.hazType;
	}
	public void setHazType(String hazType)
	{
		this.hazType = hazType;
	}
	public void printHazType() {
		System.out.println("This container contains " + this.hazType + ".");
	}
	public void printHazmatInstructions() {
		System.out.println("Handle " + this.hazType + " with care. Also, run away if spilled!");
	}
	public void printHazmatHandling() {
		System.out.println("Do not drop " + this.hazType + " on the ground from height, or spill in the ocean!");
	}
	@Override
	public String toString() {
		String s = "Container: " + super.getMake() + " " + super.getId() + "\nWeight: " + super.getWeightTons() + "\nHazmat Type: " + this.hazType;
		return s;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof HazmatContainer<?>) {
			HazmatContainer<?> otherContainer = (HazmatContainer<?>) obj;
			return super.getMake().equals(otherContainer.getMake()) && super.getId()==otherContainer.getId() && super.getWeightTons()==otherContainer.getWeightTons() && this.hazType.equals(otherContainer.getHazType());
		} 		
		return false;
	}
}
