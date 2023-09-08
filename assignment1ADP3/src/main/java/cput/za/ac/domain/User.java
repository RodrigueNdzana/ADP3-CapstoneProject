package cput.za.ac.domain;

/*User.java
 Entity for the User
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/
public class User {
    private String userId;
    private String firstname;
    private String lastname;
    private String phoneNum;
    private String email;
    private String address;
    private User(Builder builder){
        this.userId = builder.userId;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.phoneNum = builder.phoneNum;
        this.email = builder.email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public static class Builder{
        private String userId;
        private String firstname;
        private String lastname;
        private String phoneNum;
        private String email;
        private String address;

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder  setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public  Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }

        public Builder  setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
        public Builder copy(User user){
            this.userId = user.userId;
            this.firstname = user.firstname;
            this.lastname = user.lastname;
            this.phoneNum = user.phoneNum;
            this.email = user.email;
            this.address = user.address;
            return this;
        }
        public User build(){
            return new User(this);
        }


    }
}


