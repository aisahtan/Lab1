package exercise7;

public class WeightMars {
	
	double mass;
		
		public WeightMars(double mass){
			this.mass = mass;
		}
		
		void setMass(double mass) {
			this.mass = mass;
		}
		
		public void calculateWeight() {
			double earthWeight = mass * 9.81;
			double marsWeight = mass * 3.71;
	
			System.out.println("Mass: "+ mass +"kg\nWeight on Earth: " + earthWeight +"N\nWeight on Mars: "+ marsWeight +" N\n");
		}

}
