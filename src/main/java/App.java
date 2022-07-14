import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        /////////////////////////////////////////////////////////////////////////////////
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld second_bean = (HelloWorld) applicationContext.getBean(HelloWorld.class);
        /////////////////////////////////////////////////////////////////////////////////
        Cat cat_first = (Cat) applicationContext.getBean("cat");
        Cat cat_second = (Cat) applicationContext.getBean(Cat.class);
        /////////////////////////////////////////////////////////////////////////////////
        System.out.println(String.format("bean == second_bean? Result: %b", bean.equals(second_bean)));
        System.out.println(String.format("cat_first == cat_second? Result: %b", cat_first.equals(cat_second)));
        //System.out.println(bean.getMessage());
    }
}