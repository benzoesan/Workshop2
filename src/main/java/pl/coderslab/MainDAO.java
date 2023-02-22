package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainDAO {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
//        User user = new User();
//        user.setUserName("Damian");
//        user.setEmail("damian.kot@gmail.com");
//        user.setPassword("kotunio");
//        userDao.create(user);

//        User user = new User();
//        user.setUserName("Adam");
//        user.setEmail("adas.kot@gmail.com");
//        user.setPassword("adamek");
//        userDao.create(user);

        User read = userDao.read(5);
        System.out.println(read);

//        User userToUpdate = userDao.read(1);
//        userToUpdate.setUserName("Michał");
//        userToUpdate.setEmail("michal@wp.pl");
//        userToUpdate.setPassword("newpassword");
//        userDao.update(userToUpdate);

//        User secondUser = new User();
//        secondUser.setUserName("Janek");
//        secondUser.setEmail("janek2@wp.pl");
//        secondUser.setPassword("alamakota");
//        userDao.create(secondUser);
//        User[] all = userDao.findAll();
//        for (User u : all) {
//            System.out.println(u);
//        }
//        userDao.delete(3);



    }

}
