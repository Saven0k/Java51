public class CreateLionExecutable implements CommandExecutable {
    private Zoo zoo;
    

    public CreateLionExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        Lion lion;
        zoo.CreateLionOutCage(lion);
    }

}
