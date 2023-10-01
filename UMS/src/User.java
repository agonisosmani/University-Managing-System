/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
class User {

    private String id, name, address, email, tel;
    private int capacity, created;

    public User(int capacity, int created, String id, String name, String address, String email, String tel) {

        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.tel = tel;
        this.capacity = capacity;
        this.created = created;

    }

    User(String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    User(String string, String string0, String string1, String string2, String string3, int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    User(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getid() {
        return id;
    }
    public String getname() {
        return name;
    }
    public String getaddress() {
        return address;
    }
    public String getemail() {
        return email;
    }
    public String gettel() {
        return tel;
    }
    public int getcapacity() {
        return capacity;
    }
    public int getcreated() {
        return created;
    }
}