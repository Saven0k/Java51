import java.lang.System;

public class Command {
    private String commandString;

    String menu = ("1 - Добавить льва"
            + "2 - Удалить льва"
            + "3 - Просмотр зоопарка"
            + "stop - Выйти");

    public String getCommandString() {
        return commandString;
    }

    // PrintMenu pM = new PrintMenu(menu); Если хотим вывести меню наверное надо , а
    // так вроде нет

    public boolean isCreateLion() {
        return (commandString.equals("CreateLion"));
    }

    public boolean isDeleteLion() {
        return (commandString.equals("DeleteLion"));
    }

}
