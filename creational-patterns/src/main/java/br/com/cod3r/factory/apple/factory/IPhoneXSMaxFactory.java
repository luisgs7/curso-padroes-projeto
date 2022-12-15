package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory{
    @Override
    public IPhone createIphone() {
        return new IPhoneXSMax();
    }
}
