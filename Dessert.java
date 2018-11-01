public class Dessert extends Food{
	
	public String ingredient;

	public Dessert(String namaFood, String ingredient){
		super(namaFood);		
		this.ingredient = ingredient;
	}

	public Dessert(String namaFood){
		super(namaFood);
	}


	public void showIngredient(){
		System.out.println(ingredient);
	}

}