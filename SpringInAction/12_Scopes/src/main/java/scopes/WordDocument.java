package scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 11.05.2016.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Qualifier("windows")
public class WordDocument implements Document {

    private String text;

    public String getText() {
        return text == null ? "This is an empty word document" : text;
    }

    @Autowired(required = false)
    public void setText(String text) {
        this.text = text;
    }
}
