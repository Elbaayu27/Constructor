public class FoodTest{
	public static void main(String[] args) {
		Dessert d1 = new Dessert("Tiramissu");
		d1.showNamaFood();
		d1.showIngredient();

		Dessert d2 = new Dessert("Apple Pie","Apple");
		d2.showNamaFood();
		d2.showIngredient();
	}
}