package org.example.HomeWork10.Task2;

import java.util.ArrayList;
import java.util.List;

public class User implements Cloneable {
    private String id;
    private String name;
    private List<String> friends; //список друзей
    private Address address;

    public User(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.friends = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getFriends() {
        return friends;
    }

    public Address getAddress() {
        return address;
    }

    public void addFriend(String friend) {
        friends.add(friend);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + ", address ='" + address + "}" + ", friends ='" + friends + "}";
    }

    public User cloneShallow() {
        System.out.println("Поверхностное копирование:");
        User cloneShallow = new User(this.id, this.name, this.address);
        cloneShallow.friends = this.friends;
        return cloneShallow;
    }

    public User cloneDeep() {
        System.out.println("Глубокое копирование:");
        Address cloneAddress = null;
        if (this.address != null) {
            cloneAddress = this.address.clone();
        }
        User cloneDeep = new User(this.id, this.name, cloneAddress);
        cloneDeep.friends = new ArrayList<>(this.friends);
        return cloneDeep;
    }
}
