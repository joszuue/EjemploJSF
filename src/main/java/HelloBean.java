import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class HelloBean {
    private String name;
    private String greetingMessage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }

    public void sayHello() {
        greetingMessage = "¡Hola, " + name + "!";
    }
}
