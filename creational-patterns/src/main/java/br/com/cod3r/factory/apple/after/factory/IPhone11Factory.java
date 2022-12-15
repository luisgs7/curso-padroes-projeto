package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.after.model.IPhone;
import br.com.cod3r.factory.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory{
    @Override
    public IPhone createIphone() {
        return new IPhone11();
    }
}
