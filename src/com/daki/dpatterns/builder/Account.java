package com.stefancipe.dpatterns.builder;

public class Account {
    private int id;
    private String name;
    private String email;
    private int age;
    private String city;
    private String country;

    private Account(Builder builder) {
        id = builder.id;
        name = builder.name;
        email = builder.email;
        age = builder.age;
        city = builder.city;
        country = builder.country;
    }

    public static class Builder {
        private int id;
        private String name;
        private String email;
        private int age;
        private String city;
        private String country;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
