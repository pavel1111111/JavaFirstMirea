package ru.mirea.test.task2;

public class Author {
    private String name;
    private String email;
    private char gender = 'U';
    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;

    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public char getGender(){
        return this.gender;
    }
    @Override
    public String toString() {
        return switch (this.gender) {
            case 'U' -> this.name + " (unstated gender) at " + this.email;
            case 'F' -> this.name + " (ms) at " + this.email;
            case 'M' -> this.name + " (mr) at " + this.email;
            default -> "Wrong info";
        };
    }
}
