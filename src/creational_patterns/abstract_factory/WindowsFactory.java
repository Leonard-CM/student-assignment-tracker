package creational_patterns.abstract_factory;

public class WindowsFactory implements UIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
}