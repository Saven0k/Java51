public class CreateLionExecutable implements CommandExecutable{

    private Zoo zoo;

    public CreateLionExecutable(Zoo zoo){
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        Lion lion = new Lion(1.5,15 , 562 , 4 );
        zoo.CreateLionOutCage(lion);
    }
    
}
