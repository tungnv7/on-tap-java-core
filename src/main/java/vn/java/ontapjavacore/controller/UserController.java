package vn.java.ontapjavacore.controller;

import vn.java.ontapjavacore.model.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserController {
    //Có 3 cách khởi tạo một đối tượng
    public static void main(String[] args) throws ParseException {
        //1. Khởi tạo thông qua reference variable (Biến tham chiếu)
        User user = new User();
        user.message = "Hello";
        System.out.println(user.message);

        //2. Khởi tạo thông qua biến method (Phương thức)
        User user1 = new User();
        user1.setId(1);
        user1.setFirstName("Nguyen");
        user1.setLastName("Tung");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dateOfBirth = sdf.parse("28/09/2004");
        user1.setDateOfBirth(dateOfBirth);

        List<User.Address> address = new ArrayList<>();
        User.Address address1 = new User.Address();
        address1.setCity("Hà Nội");
        address1.setCountry("HN");
        address1.setDistrict("1");
        address1.setStreet("Nguyen Van Dong");

        User.Address address2 = new User.Address();
        address2.setCity("HCM");
        address2.setCountry("HCM");
        address2.setDistrict("2");
        address2.setStreet("Vo Nguyen Giap");
        address.add(address1);
        address.add(address2);

        user1.setAddress(address);
        System.out.println("u1: " +user1);

        //3.khởi tạo thông qua constructor
        Date dob = sdf.parse("20/10/2003");
        User user3 = new User(2, "Nguyen", "Minh", dob);
        System.out.println("u2: " + user3);
    }
}
