import oop2\animals\Snake.java;

public class CreateSnakeExecutable implements CommandExecutable{
    private Zoo zoo;

    public CreateSnakeExecutable(Zoo zoo){
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        Snake snake = new Snake(1.5,15 , 562 , 4 );
        zoo.CreateSnakeOutCage(snake);
    }
}
