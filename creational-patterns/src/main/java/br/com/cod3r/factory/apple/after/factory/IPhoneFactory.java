package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.after.model.IPhone;

public abstract class IPhoneFactory {

	public IPhone orderIphone() {
        IPhone device = null;

        device = createIphone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    public abstract IPhone createIphone();
}
