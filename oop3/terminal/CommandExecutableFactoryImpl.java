public class CommandExecutableFactoryImpl implements CommandExecutableFactory {

    public CommandExecutableFactoryImpl(Zoo zoo) {
    }

    public CommandExecutable create(Command command, Zoo zoo) {
        if (command.equals("DeleteLion")) {
            return new DeleteLionExecutable(zoo);
        }

        else if (command.equals("CreateLion")) {
            return new CreateLionExecutable(zoo);
        }

        return null;
    }
}
