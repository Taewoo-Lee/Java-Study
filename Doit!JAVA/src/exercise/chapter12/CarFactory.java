package exercise.chapter12;

import java.util.HashMap;

class CarFactory {
	private static CarFactory instance = new CarFactory();

	private CarFactory() {
	}

	public static CarFactory getInstance() {
		// TODO Auto-generated method stub
		if (instance == null)
			instance = new CarFactory();
		return instance;
	}

	HashMap<String, Car> carMap = new HashMap<String, Car>();

	public Car createCar(String name) {
		// TODO Auto-generated method stub
		if (carMap.containsKey(name))
			return carMap.get(name); // 이미 존재한 경우, 이름만 바꾼다.
		Car c = new Car();
		carMap.put(name, c);
		return c;
	}

}
