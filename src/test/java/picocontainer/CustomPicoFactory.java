package picocontainer;

import actions.UIAutomationAPI;
import actions.UIKnowsTheGeneralActions;
import actions.UIKnowsTheSearch;
import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.picocontainer.PicoFactory;

public class CustomPicoFactory implements ObjectFactory {
    private final PicoFactory delegate = new PicoFactory();

    public CustomPicoFactory() {
        System.out.println("this is test debug");
        addClass(UIKnowsTheSearch.class);
        addClass(UIAutomationAPI.class);
        addClass(UIKnowsTheGeneralActions.class);
    }

    @Override
    public void start() {
        delegate.start();
    }

    @Override
    public void stop() {
        delegate.stop();
    }

    @Override
    public boolean addClass(Class<?> aClass) {
        return delegate.addClass(aClass);
    }

    @Override
    public <T> T getInstance(Class<T> aClass) {
        return delegate.getInstance(aClass);
    }
}
