public class DeleteWolfExecutable implements CommandExecutable{
    private Zoo zoo;

    public DeleteWolfExecutable(Zoo zoo){
        this.zoo = zoo;
    }

    @Override
    public void execute(){
        zoo.DeleteWolfOutCage();
    }
}
