package cput.za.ac.domain;
/*   Administrator.java
     Domain for Administrator
     Author:Neilyn Parnell (218132425)
     Date: 07 April 2022
*/
public class Administartor {
  private String ID;

  private String Name;

  private String Password;

  private String Email;

  private Administartor(Administartor.Builder builder){
      this.ID = builder.ID;
      this.Name = builder.Name;
      this.Password = builder.Password;
      this.Email = builder.Email;

  }

    public class Builder {
        public static String ID;
        public String Name;
        public String Password;
        public String Email;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Administartor{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Password='" + Password + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}

