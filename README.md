# FoodCourt
Inheritance applied with the TreeMap

The FoodCourt project includes diffferent classes, including rawMaterial, Food, ....
class rawMaterial can use the objects and variables declared in the Food class since it extends it. rawMaterial also implements
an interface Mutritional elements.
Interface NutritionalElements has the getter methods. This methods are implemented in the rawMaterial class.
class Food includes method "define raw Material" . 
/*IMPORTANT POINTS FOR FUNCTIONALITY*/
Visibility: 
  in the proposed sceleton code the the method defineMaterial is implemented in the Food class.
  It is esential to meake the assigned values in the rawMaterial class. If in the implemntation of setter defineMaterial(...
  variables name, calories etc. are used as this.name = name it won't be visible,

