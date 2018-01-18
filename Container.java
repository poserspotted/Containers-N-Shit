import java.util.ArrayList;

public class Container<T> implements Comparable<Container<T>> {

	private String make;
	private int id;
	private int weightTons;
	private ArrayList<T> contents;
	public static final int DEFAULT_WEIGHT = 9999;
	
	public Container(String make, int id, int weightTons, T contents) {
		this.make = make;
		this.id = id;
		this.weightTons = weightTons;
		this.contents.add(contents);
	}
	
	public Container(String make, int id, int weightTons) {
		this.make = make;
		this.id = id;
		this.weightTons = weightTons;
		this.contents = new ArrayList<>();
	}
	public Container(String make, int id, T contents) {
		this(make, id, DEFAULT_WEIGHT);
		this.contents.add(contents);
	}
	public Container(String make, int id) {
		this(make, id, DEFAULT_WEIGHT);
		this.contents = new ArrayList<>();
	}
	public String getMake() {
		return this.make;
	}
	public int getId() {
		return this.id;
	}
	public int getWeightTons() {
		return this.weightTons;
	}
	public ArrayList<T> getContents() {
		return this.contents;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setWeightTons(int weightTons) {
		this.weightTons = weightTons;
	}
	public boolean addContent(T content) {
		boolean bool = false;
		if(content!=null) {
			this.contents.add(content);
			bool = true;
			return bool;
		}
		return bool;
	}
	public boolean removeContent(T content) {
		if(content!=null) {
			if(contents.contains(content)) {
				return contents.remove(content);
			}
		}
		return false;
	}
	public boolean contains(T content) {
		if(content!=null) {
			return contents.contains(content);
		}
		return false;
	}
	@Override
	public String toString() {
		String s = "Container: " + this.make + " " + this.id + "\nWeight: " + this.weightTons;
		return s;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Container<?>) {
			Container<?> otherContainer = (Container<?>) obj;
			return this.make.equals(otherContainer.getMake()) && this.id==otherContainer.getId() && this.weightTons==otherContainer.getWeightTons();
		} else {
			return false;
		}
	}
	@Override
	public int compareTo(Container<T> obj) {
		if(obj instanceof Container<?>) {
			Container<?> otherContainer = (Container<?>) obj;
			if(this.make.compareTo(otherContainer.getMake()) < 0) {
				return -1;
			}
			if(this.make.compareTo(otherContainer.getMake()) == 0) {
				if(this.id < otherContainer.getId()) {
					return -1;
				} else if(this.id == otherContainer.getId()) {
					return 0;
				} else //this.id > otherContainer.getId()) {
					return 1;
			}
			if(this.make.compareTo(otherContainer.getMake()) > 0) {
				return 1;
			}
		}
		return -1;
	}
}
