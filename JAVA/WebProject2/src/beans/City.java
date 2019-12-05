package beans;

public class City {
	private String name;
	private int population;
	private float rainFall;
	public City() {
		}
	public City(String name, int population, float rainFall) {
		super();
		this.name = name;
		this.population = population;
		this.rainFall = rainFall;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", population=" + population + ", rainFall=" + rainFall + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public float getRainFall() {
		return rainFall;
	}
	public void setRainFall(float rainFall) {
		this.rainFall = rainFall;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		result = prime * result + Float.floatToIntBits(rainFall);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		if (Float.floatToIntBits(rainFall) != Float.floatToIntBits(other.rainFall))
			return false;
		return true;
	}
	
	
}
