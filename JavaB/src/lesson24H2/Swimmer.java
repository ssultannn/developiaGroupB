package lesson24H2;

import java.util.jar.Attributes.Name;

public class Swimmer extends Athlete {
	double swimTime;

	public void swim() {
		System.out.println(name + " проплыл за " + swimTime + " минут");
	}
}
