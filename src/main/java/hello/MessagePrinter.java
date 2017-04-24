package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by qizeng on 2017/4/24.
 */
@Component
public class MessagePrinter {
    final private MessageService service;

    //if contains two service impls,will not work due to confusion
    @Autowired
    public MessagePrinter(MessageService service){
        this.service = service;
    }

    public void printMessage(){
        System.out.println(service.getMessage());
    }
}
