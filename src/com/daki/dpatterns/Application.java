package com.stefancipe.dpatterns;

import com.stefancipe.dpatterns.abstractfactory.AbstractFactory;
import com.stefancipe.dpatterns.abstractfactory.Class;
import com.stefancipe.dpatterns.abstractfactory.Weapon;
import com.stefancipe.dpatterns.bridge.Circle;
import com.stefancipe.dpatterns.bridge.GreenColor;
import com.stefancipe.dpatterns.bridge.RedColor;
import com.stefancipe.dpatterns.bridge.Shape;
import com.stefancipe.dpatterns.bridge.Triangle;
import com.stefancipe.dpatterns.builder.Account;
import com.stefancipe.dpatterns.chainofresponsibility.AbstractLogger;
import com.stefancipe.dpatterns.chainofresponsibility.ChainPattern;
import com.stefancipe.dpatterns.command.Broker;
import com.stefancipe.dpatterns.command.BuyStock;
import com.stefancipe.dpatterns.command.SellStock;
import com.stefancipe.dpatterns.command.Stock;
import com.stefancipe.dpatterns.composite.Employee;
import com.stefancipe.dpatterns.composite.Manager;
import com.stefancipe.dpatterns.composite.Worker;
import com.stefancipe.dpatterns.decorator.Mozzarella;
import com.stefancipe.dpatterns.decorator.Olives;
import com.stefancipe.dpatterns.decorator.Pizza;
import com.stefancipe.dpatterns.decorator.PlainPizza;
import com.stefancipe.dpatterns.facade.CreditCard;
import com.stefancipe.dpatterns.facade.Facade;
import com.stefancipe.dpatterns.facade.Profile;
import com.stefancipe.dpatterns.factory.Car;
import com.stefancipe.dpatterns.factory.CarFactory;
import com.stefancipe.dpatterns.flyweight.Bandit;
import com.stefancipe.dpatterns.flyweight.BanditFactory;
import com.stefancipe.dpatterns.flyweight.BanditType;
import com.stefancipe.dpatterns.iterator.Container;
import com.stefancipe.dpatterns.iterator.Iterator;
import com.stefancipe.dpatterns.iterator.NameContainer;
import com.stefancipe.dpatterns.mediator.ChatUser;
import com.stefancipe.dpatterns.memento.CareTaker;
import com.stefancipe.dpatterns.memento.Originator;
import com.stefancipe.dpatterns.objectpool.ObjectPool;
import com.stefancipe.dpatterns.objectpool.Resource;
import com.stefancipe.dpatterns.observer.Publisher;
import com.stefancipe.dpatterns.observer.Subscriber;
import com.stefancipe.dpatterns.prototype.Animal;
import com.stefancipe.dpatterns.prototype.CloneFactory;
import com.stefancipe.dpatterns.prototype.Sheep;
import com.stefancipe.dpatterns.proxy.Proxy;
import com.stefancipe.dpatterns.singleton.Singleton;
import com.stefancipe.dpatterns.state.ConcreteStateA;
import com.stefancipe.dpatterns.state.ConcreteStateB;
import com.stefancipe.dpatterns.state.Context;
import com.stefancipe.dpatterns.strategy.Addition;
import com.stefancipe.dpatterns.strategy.Calculator;
import com.stefancipe.dpatterns.strategy.Multiplication;
import com.stefancipe.dpatterns.strategy.Subtraction;
import com.stefancipe.dpatterns.templatemethod.DOCReader;
import com.stefancipe.dpatterns.templatemethod.PDFReader;
import com.stefancipe.dpatterns.templatemethod.Reader;
import com.stefancipe.dpatterns.visitor.GoldCreditCard;
import com.stefancipe.dpatterns.visitor.HotelVisitor;
import com.stefancipe.dpatterns.visitor.ICreditCard;
import com.stefancipe.dpatterns.visitor.SilverCreditCard;
import com.stefancipe.dpatterns.visitor.StoreVisitor;
import com.stefancipe.dpatterns.visitor.Visitor;

public class Application {

	public static void main(String args[]) {
		creationalPatterns();
		structuralPatterns();
		behavioralPatterns();
	}

	// CREATIONAL DESIGN PATTERNS

	public static void factoryPatternFun() {
		CarFactory factory = new CarFactory();
		Car car = factory.makeCar("Electric");

		car.startEngine();
		car.drive();
		car.stop();

		car = factory.makeCar("Diesel");

		car.startEngine();
		car.drive();
		car.stop();
	}

	public static void abstractFactoryPatternFun() {
		AbstractFactory factory = AbstractFactory.getFactory(Class.ARCHER);
		Weapon weapon = factory.createWeapon();
		weapon.attack();
	}

	public static void builderPatternFun() {
		Account account = new Account.Builder().id(3).name("John Smith").email("jonhsmith@email.com").age(40)
				.city("Vranje").country("Serbia").build();
		System.out.println(account.toString());
	}

	public static void singletonPatternFun() {
		Singleton singleton = Singleton.getInstance();
		singleton.fun();
	}

	public static void prototypePatternFun() {
		CloneFactory cloneFactory = new CloneFactory();

		Animal dolly = new Sheep();

		Animal sally = cloneFactory.getClone(dolly);

		System.out.println(sally.getClass());
	}

	public static void objectPoolPatternFun() {
		ObjectPool pool = new ObjectPool();

		Resource resource = pool.acquireResource();
		resource.setValue(5);
		System.out.println(resource.getValue());

		pool.returnResource(resource);

		Resource resource1 = pool.acquireResource();
		Resource resource2 = pool.acquireResource();
		System.out.println(resource1.getValue());
	}

	public static void creationalPatterns() {
		// Factory design pattern
		factoryPatternFun();

		// Abstract factory design pattern
		abstractFactoryPatternFun();

		// Builder design pattern
		builderPatternFun();

		// Singleton design pattern
		singletonPatternFun();

		// Prototype design pattern
		prototypePatternFun();

		// Object pool design pattern
		objectPoolPatternFun();
	}

	// STRUCTURAL DESIGN PATTERNS

	public static void bridgePatternFun() {
		Shape shape = new Triangle(new RedColor());
		shape.paint();

		shape = new Circle(new GreenColor());
		shape.paint();
	}

	public static void compositePatternFun() {
		Employee boss = new Manager("Markus Bossy", 45, "markus@mail.com");
		Employee manager = new Manager("Anne Hanks", 41, "anne@mail.com");

		manager.addSubordinate(new Worker("Peter Johnson", 31, "peter@mail.com"));
		manager.addSubordinate(new Worker("John Smith", 36, "john@mail.com"));
		boss.addSubordinate(new Worker("Karen Smith", 46, "karen@mail.com"));
		boss.addSubordinate(manager);

		System.out.println(boss.toString());
	}

	public static void decoratorPatternFun() {
		Pizza pizza = new Olives(new Mozzarella(new PlainPizza()));

		System.out.println("Ingredients: " + pizza.getDescription());
		System.out.println("Price: $" + pizza.getCost());
	}

	public static void facadePatternFun() {
		Facade facade = new Facade(new CreditCard(1234, 200.00),
				new Profile("user@mail.com", "password", "Street n.41"));
		facade.depositMoney(30, 1235);
		facade.depositMoney(30, 1234);
		facade.orderItem(210, 1234);
	}

	public static void proxyPatternFun() {
		Proxy proxy = new Proxy();
		if (proxy.payOnRegister(140)) {
			System.out.println("Payment successful");
		} else {
			System.out.println("Payment failed");
		}
	}

	public static void flyweightPatternFun() {
		BanditFactory banditFactory = new BanditFactory();

		BanditType banditType1 = banditFactory.getBanditType("Bandit Outlaw", new double[] { 100.00, 120.00, 120.00 });
		BanditType banditType2 = banditFactory.getBanditType("Bandit Marauder",
				new double[] { 150.00, 200.00, 180.00 });
		BanditType banditType3 = banditFactory.getBanditType("Bandit Outlaw", new double[] {});

		Bandit bandit1 = new Bandit(banditType1, 2, 4);
		Bandit bandit2 = new Bandit(banditType2, 6, 9);
		Bandit bandit3 = new Bandit(banditType3, 12, 1);

		System.out.println(bandit1.toString());
		System.out.println(bandit2.toString());
		System.out.println(bandit3.toString());
	}

	public static void structuralPatterns() {
		// Bridge design pattern
		bridgePatternFun();

		// Composite design pattern
		compositePatternFun();

		// Decorator design pattern
		decoratorPatternFun();

		// Facade design pattern
		facadePatternFun();

		// Proxy design pattern
		proxyPatternFun();

		// Flyweight design pattern
		flyweightPatternFun();

	}

	// BEHAVIORAL DESIGN PATTERNS

	public static void chainOfResponsibilityPatternFun() {
		AbstractLogger logger = ChainPattern.getLoggerChain();
		logger.logMessage("This is warning message", AbstractLogger.WARNING);
		logger.logMessage("This is error message", AbstractLogger.ERROR);
		logger.logMessage("This is info message", AbstractLogger.INFO);
	}

	public static void commandPatternFun() {
		Broker broker = new Broker();
		broker.addOrder(new BuyStock(new Stock("StockA", 20)));
		broker.addOrder(new SellStock(new Stock("StockB", 120)));
		broker.addOrder(new BuyStock(new Stock("StockC", 220)));
		broker.addOrder(new SellStock(new Stock("StockD", 240)));
		broker.addOrder(new SellStock(new Stock("StockE", 120)));
		broker.addOrder(new SellStock(new Stock("StockF", 250)));
		broker.addOrder(new BuyStock(new Stock("StockG", 260)));
		broker.executeNextOrder();
		broker.executeNextOrder();
		broker.executeNextOrder();
	}

	public static void strategyPatternFun() {
		Calculator calculator = new Calculator();
		calculator.setOperation(new Addition());
		calculator.executeOperation(2, 5);
		calculator.setOperation(new Subtraction());
		calculator.executeOperation(2, 5);
		calculator.setOperation(new Multiplication());
		calculator.executeOperation(2, 5);
	}

	public static void iteratorPatternFun() {
		Container container = new NameContainer();
		Iterator iterator = container.getIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void mediatorPatternFun() {
		ChatUser user1 = new ChatUser();
		user1.setUsername("John");

		ChatUser user2 = new ChatUser();
		user2.setUsername("David");

		user1.sendMessage("Hi David!");
		user2.sendMessage("Hey John");
	}

	public static void mementoPatternFun() {
		CareTaker careTaker = new CareTaker();
		Originator originator = new Originator();
		originator.setState("v0.0.1");
		careTaker.addMemento(originator.saveStateToMemento());
		originator.setState("v1.0.0");
		careTaker.addMemento(originator.saveStateToMemento());
		originator.setState("v1.1.0");
		originator.setState("v1.1.6");
		careTaker.addMemento(originator.saveStateToMemento());
		originator.setState("v2.0.1");
		System.out.println(originator.getState());
		originator.loadPreviousState(careTaker.getLatestMemento());
		System.out.println(originator.getState());
	}

	public static void observerPatternFun() {
		Publisher publisher = new Publisher();

		Subscriber subscriber = new Subscriber();

		publisher.addSubscriber(subscriber);

		publisher.notifyAll("Hello");
		publisher.notifyAll("How are y'all?");

		subscriber.readAll();
	}

	public static void statePatternFun() {
		Context context = new Context();

		context.setState(new ConcreteStateA());
		context.request();

		context.setState(new ConcreteStateB());
		context.request();
	}

	public static void templateMethodPatternFun() {
		Reader reader = new PDFReader();
		reader.readFile("../file.pdf");

		reader = new DOCReader();
		reader.readFile("../file.doc");
	}

	public static void visitorPatternFun() {
		Visitor visitor1 = new HotelVisitor();
		Visitor visitor2 = new StoreVisitor();
		ICreditCard cc1 = new GoldCreditCard();
		ICreditCard cc2 = new SilverCreditCard();

		cc1.accept(visitor1);
		cc2.accept(visitor2);
	}

	public static void behavioralPatterns() {
		// Chain of responsibility design pattern
		chainOfResponsibilityPatternFun();

		// Command design pattern
		commandPatternFun();

		// Strategy design pattern
		strategyPatternFun();

		// Iterator design pattern
		iteratorPatternFun();

		// Mediator design pattern
		mediatorPatternFun();

		// Memento design pattern
		mementoPatternFun();

		// Observer design pattern
		observerPatternFun();

		// State design pattern
		statePatternFun();

		// Template method design pattern
		templateMethodPatternFun();

		// Visitor design pattern
		visitorPatternFun();
	}

}
