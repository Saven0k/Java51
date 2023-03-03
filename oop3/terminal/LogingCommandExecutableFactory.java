public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {

    public LogingCommandExecutableFactory(Zoo zoo) {
        super(zoo);
    }

    @Override
    public CommandExecutable create(Command command, Zoo zoo) {
        System.out.println("Begin");
        CommandExecutable com = super.create(command, zoo);
        System.out.println("end");
        return com;
    }

}