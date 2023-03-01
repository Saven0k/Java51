import oop2\cage;
import oop2\animals;
public class CommandExecutableFactory {
    public CommandExecutable create (String[] input){
        for (int i = 0; i < input.length; i++){
            if (input[i].equals("Lion")){
                if ((input[i-1].equals("add")) || (input[i+1].equals("add"))){
                    LionCage LC = new LionCage<>();
                    LC.addAnimalInCage(input);
                }



                if ((input[i-1].equals("delete")) || (input[i+1].equals("delete"))){
                    Zoo zoo = new Zoo();
                    DeleteLionExecutable DL = new DeleteLionExecutable(zoo);
                    DL.execute();
                }

            }



            if (input[i].equals("Snake")){
                if ((input[i-1].equals("add")) || (input[i+1].equals("add"))){
                    SnakeCage SC = new SnakeCage<>();
                    SC.addAnimalInCage(input);
                }


                if ((input[i-1].equals("delete")) || (input[i+1].equals("delete"))){
                    Zoo zoo = new Zoo();
                    DeleteSnakeExecutable DL = new DeleteSnakeExecutable(zoo);
                    DL.execute();
                }
            }



            if (input[i].equals("Wolf")){
                if ((input[i-1].equals("add")) || (input[i+1].equals("add"))){
                    WolfCage WC = new WolfCage<>();
                    WC.addAnimalInCage(input);
                }
                if ((input[i-1].equals("delete")) || (input[i+1].equals("delete"))){
                        Zoo zoo = new Zoo();
                        DeleteWolfExecutable DL = new DeleteWolfExecutable(zoo);
                        DL.execute();
                    }

            }
        }

        return null;
    }
}
