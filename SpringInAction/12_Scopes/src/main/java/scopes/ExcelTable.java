package scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 11.05.2016.
 */
@Component
public class ExcelTable implements Table {
    private String data;
    public String getData() {
        return data == null ? "There is no data" : data;
    }
    @Autowired(required = false)
    public void setData(String data){
        this.data = data;
    }
}
