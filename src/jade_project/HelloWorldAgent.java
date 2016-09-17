package jade_project;
import jade.core.Agent;

/**
 *
 * @author abhijeet
 */
public class HelloWorldAgent extends Agent{

    @Override
    protected void setup(){
        System.out.println("Hello World. I’m an agent!");
    }
}
