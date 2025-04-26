package vn.java.ontapjavacore.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class User { // Ký tự { bắt đầu Block của lớp User

    // Các fields này chính là instance variables
    private Integer id; // đây là fields
    private String firstName; // đây là fields
    private String lastName; // đây là fields
    private Date dateOfBirth; // đây là fields
    private List<Address> address; // đây là fields
    public String message; // đây là fields

    // đây là constructor
    public User() {
    }
    // đây là constructor có tham số truyền vào

    public User(Integer id, String firstName, String lastName, Date dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;

    }

    // đây là method để thể hiện các hành vi (Behavior)
    public Integer getId() { // { bắt đầu Block của method getId()
        return id;
    } // } kết thúc Block của method getId()

    // đây là method để thể hiện các hành vi (Behavior)
    public void setId(Integer id) {
        this.id = id;
    }

    // đây là method để thể hiện các hành vi (Behavior)
    public String getFirstName() {
        return firstName;
    }

    // đây là method để thể hiện các hành vi (Behavior)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // đây là method để thể hiện các hành vi (Behavior)
    public String getLastName() {
        return lastName;
    }

    // đây là method để thể hiện các hành vi (Behavior)
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // đây là method để thể hiện các hành vi (Behavior)
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    // đây là method để thể hiện các hành vi (Behavior)
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // đây là method để thể hiện các hành vi (Behavior)
    public String getFullName() {
        return this.firstName + " " + lastName;
    }

    // đây là method để thể hiện các hành vi (Behavior)
    public Address getAddress() {
        return (Address) address;
    }


    // đây là method để thể hiện các hành vi (Behavior)
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    // Nested class (Lớp lồng nhau)
     public static class Address {
        private String street;
        private String district;
        private String city;
        private String country;

        public Address() {
        }

        public Address(String street, String district, String city, String country) {
            this.street = street;
            this.district = district;
            this.city = city;
            this.country = country;
        }

        public String getStreet() {
            return street;
        }

        public String getDistrict() {
            return district;
        }

        public String getCity() {
            return city;
        }

        public String getCountry() {
            return country;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", district='" + district + '\'' +
                    ", city='" + city + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = (dateOfBirth != null) ? dateFormat.format(dateOfBirth) : "null";
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + formattedDate +
                ", address=" + address +
                '}';
    }
} // Ký tự } kết thúc Block của lớp User
