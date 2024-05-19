class Motorcycle{
	String make,color,engineState;

	void engineState(){
		if (EngineState == true) {
			System.out.println("Engine is on");
		}else{
			engineState = true;
			System.out.println("Engine is off");
		}
	}

	void showAtts(){
		if (EngineState == true) {
			System.out.println("Engine is on "+make+" "+color);
		}else{
			System.out.println("");
		}
	}

}