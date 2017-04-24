package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by qizeng on 2017/4/24.
 */
@Configuration
@ComponentScan
public class Application {
    //first test,create only one service impl,ioc then auto bind,success
//    @Bean
//    MessageService mockMessageService(){
//        return new MessageService() {
//            public String getMessage() {
//                return "hello";
//            }
//        };
//    }
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
