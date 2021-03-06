package zula.common.commands;


import zula.common.data.Dragon;
import zula.common.exceptions.PrintException;
import zula.common.util.CollectionManager;
import zula.common.util.IoManager;

import java.io.Serializable;

/**
 * Realisation of add command
 */


public class Add extends Command implements Serializable {
    @Override
    public void doInstructions(IoManager ioManager, CollectionManager collectionManager, Serializable argument) throws PrintException {
        Dragon dragon = (Dragon) argument;
        collectionManager.addDragon(dragon);
        ioManager.getOutputManager().write("Команда выполнена!");
    }







}
