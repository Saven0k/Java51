import oop2\animals;

public class CreateWolfExecutable implements CommandExecutable {
    private Zoo zoo;

    public CreateWolfExecutable(Zoo zoo){
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        Wolf wolf = new Wolf(1.5,15 , 562 , 4 );
        zoo.CreateWolfOutCage(wolf);
    }
}
