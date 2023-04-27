package diet;

public class rawMaterial extends Food implements NutritionalElement{

 
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
		
	public double getCalories() {
		// TODO Auto-generated method stub
		return this.calories;
	}


	public double getProteins() {
		// TODO Auto-generated method stub
		return this.proteins;
	}

	
	public double getCarbs() {
		// TODO Auto-generated method stub
		return this.carbs;
	}

	public double getFat() {
		// TODO Auto-generated method stub
		return this.fat;
		
	}

	
	public boolean per100g() {
		// TODO Auto-generated method stub
		return true;
	}



}
