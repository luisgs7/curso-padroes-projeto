package br.com.cod3r.factory.apple;


import br.com.cod3r.factory.apple.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneXFactory.orderIphone();
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11ProFactory.orderIphone();
		System.out.println(iphone2);

	}
}
