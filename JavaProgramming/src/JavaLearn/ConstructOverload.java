package JavaLearn;


//constructor is only to assign the data i.e Initialization not for any actions

//poly morphisim can be acheived by method overloading

public class ConstructOverload {
	
	double width,height,depth; //These are class variables
	
	ConstructOverload(){				// 1st constructor with no Params OR DEFAULT CONSTRUCTOR
		
		width=height=depth=0; //local variables r method variables
		
		//width = height+depth;
		
	}
	
	ConstructOverload(double w, double h, double d){		// 2nd constructor with  Params
		
		width = w;
		height=h;
		depth =d;
		
	}
	
	
	ConstructOverload(double len){			// 3rd constructor with single Param

		
		width=depth=height =len;
		
		
	}
	
	
	double volume() { //normal method
		
		double volume = width*depth*height;
		return volume;
	}
	
}
