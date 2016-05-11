package scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Dasha on 11.05.2016.
 */
public class MainClass {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        Document document1 = (Document) context.getBean(Document.class);
        Document document2 = (Document) context.getBean(Document.class);
        document1.setText("text one");
        System.out.println(document1.getText());
        System.out.println(document2.getText());
        Table table1 = (Table) context.getBean(Table.class);
        Table table2 = (Table) context.getBean(Table.class);
        table1.setData("data one");
        System.out.println(table1.getData());
        System.out.println(table2.getData());
    }
}
