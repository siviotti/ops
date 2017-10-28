package siviotti.ops.example.cc;

public class ExemploSonar {

	private Object car;

	public void process(Car myCar){          // +1
	    if(myCar.isNotMine()){               // +1
	    	System.out.println("abc");
	         return;                         // +1
	    }
	    myCar.paint("red");
	    myCar.changeWheel();
	    while(myCar.hasGazol() && myCar.getDriver() != null){   // +2
	    	myCar.drive();
	    }
	    return;
	}
}
