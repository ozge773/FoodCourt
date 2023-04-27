package diet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;



/**
 * Facade class for the diet management.
 * It allows defining and retrieving raw materials and products.
 *
 */
public class Food{

	/**
	 * Define a new raw material.
	 * The nutritional values are specified for a conventional 100g quantity
	 * @param name unique name of the raw material
	 * @param calories calories per 100g
	 * @param proteins proteins per 100g
	 * @param carbs carbs per 100g
	 * @param fat fats per 100g
	 * 
	 */
	protected String name;
	protected double calories, proteins, carbs, fat;
	//List<NutritionalElement> rawMaterials =new ArrayList<>();
	
	TreeMap <String, NutritionalElement> rawMaterialMap = new TreeMap<String, NutritionalElement>();
	public void defineRawMaterial(String name, double calories, double proteins, double carbs, double fat) {
		rawMaterial r = new rawMaterial();
		r.name = name;
		r.calories = calories;		
		r.proteins = proteins;
		r.carbs = carbs;
		r.fat = fat;
		rawMaterialMap.put(name, r);
		//rawMaterials.add(r);
		
	}

	/**
	 * Retrieves the collection of all defined raw materials
	 * @return collection of raw materials though the {@link NutritionalElement} interface
	 */

	public Collection<NutritionalElement> rawMaterials() {
		Collection<NutritionalElement> rawMaterials = new ArrayList<>();
		for(Map.Entry<String, NutritionalElement> entry: rawMaterialMap.entrySet()) {
			NutritionalElement e = entry.getValue();
			rawMaterials.add(e);
		}
		return rawMaterials;
		
		
		
	}

	/**
	 * Retrieves a specific raw material, given its name
	 * @param name  name of the raw material
	 * @return  a raw material though the {@link NutritionalElement} interface
	 */
	public NutritionalElement getRawMaterial(String name) 
		
	{
		//NutritionalElement r_material = rawMaterials.stream().filter(l -> l.getName()==name).collect(Collectors.toList()).get(0);
		//return r_material;
		NutritionalElement rawMaterial = rawMaterialMap.get(name) ;
		return rawMaterial;
		
		
	}
