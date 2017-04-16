package com.lucien.commandPattern;

/**
 * Created by Lucien on 2017/4/16.
 */
public class SaveUserCommand extends Command{

    public SaveUserCommand() {
        super(new UserDao());
    }
    public SaveUserCommand(BeanDao beanDao) {
        super(beanDao);
    }

    @Override
    public void save() {
        super.beanDao.find("Lucien");
        super.beanDao.insert("Lucien");
    }

    @Override
    public void update() {
        super.beanDao.find("Lucien");
        super.beanDao.update("Lucien");
    }

    @Override
    public void delete() {
        super.beanDao.find("Lucien");
        super.beanDao.delete("Lucien");
    }

    @Override
    public void select() {
        super.beanDao.find("Lucien");
    }
}
