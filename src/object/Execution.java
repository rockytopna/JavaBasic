package object;

public class Execution {
	
	public static void main(String[] args) {
		
		//Object creation
		laptop laptop = new laptop();
		Watch watch = new Watch();
		
		//desire_class_name reference_Variable = new(keyword) constructor_class_name
		//we can also put laptop refVar = new laptop
		
		System.out.println(laptop.brand);
		//System.out.println(refVar.brand)
		
		System.out.println(laptop.model);
		//System.out.println(refVar.model)
		
		System.out.println(laptop.production_year);
		//System.out.println(refVar.production_year);
		
		System.out.println(watch.Brand+ watch.Model+ watch.year);
		
		
		
		
	}

}
