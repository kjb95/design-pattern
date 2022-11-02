package model;

public class Language {
    private LanguageStrategy languageStrategy;

    public Language(LanguageStrategy languageStrategy) {
        this.languageStrategy = languageStrategy;
    }

    public void hello() {
        languageStrategy.hello();
    }
}
