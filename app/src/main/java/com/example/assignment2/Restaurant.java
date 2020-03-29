package com.example.assignment2;

import java.util.ArrayList;

public class Restaurant {
    private String id;
    private String name;
    private String area;
    private String address;
    private String number;
    private String cost;
    private String cuisine;
    private String menu;
    private String ratings;
    private String hours;
    private String email;
    private String website;

    public Restaurant() {
    }

    public Restaurant(String id, String name, String area, String address, String number, String cost, String cuisine, String menu, String ratings, String hours, String email, String website) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.address = address;
        this.number = number;
        this.cost = cost;
        this.cuisine = cuisine;
        this.menu = menu;
        this.ratings = ratings;
        this.hours = hours;
        this.email = email;
        this.website = website;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public static Restaurant getRestaurant(String id) {
        for(Restaurant restaurant : getRestaurants()) {
            if(restaurant.getId().equals(id)) {
                return restaurant;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return id;
    }

    public static ArrayList<Restaurant> getRestaurants() {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("1", "BL Burgers", "Darlinghurst", "Shop 1, 151 Oxford Street, Darlinghurst, Sydney", "61293574527", "40", "Burgers", "https://blburgers.com.au/", "4.8", "Mon-Tue, Sun : 11am – 9pm \nWed-Thu : 11am – 10pm \nFri-Sat : 11am – 11:30pm", "info@blburgers.com.au", "http://www.blburgers.com.au"));
        restaurants.add(new Restaurant("2", "The Little Snail", "Darling Habour", "50 Murray Street, Darling Harbour, Sydney", "61292127512", "140", "French", "https://www.thelittlesnail.com.au/menus/a-la-carte-menu", "4.7", "Mon-Thu, Sun : 12noon – 3pm, 5:30pm – 9pm \nFri-Sat : 12noon – 3pm, 5:30pm – 10pm", "restaurant@thelittlesnail.com.au", "http://www.thelittlesnail.com.au"));
        restaurants.add(new Restaurant("3", "Betty's Burgers", "Darling Habour", "Shop E-04, International Convention Centre, 14 Darling Drive, Darling Harbour, Sydney", "61292127773", "50", "Burgers", "https://www.bettysburgers.com.au/images/bettys_burgers_nsw_sample_menu_v2.pdf", "4.5", "Mon-Thu : 11am – 9pm \nFri-Sun : 10:30am – 9pm", "contact@bettysburgers.com.au", "http://www.bettysburgers.com.au"));
        restaurants.add(new Restaurant("4", "Lola Cocina", "Parramatta", "Level 1/79-81 Phillip St, Parramatta NSW 2150, Parramatta, Sydney", "61278051195", "80", "Spanish", "https://lolacocinaparramatta.com.au/menu/", "4.4", "Mon : Closed \nTue, Sun : 11:30am – 4pm, 5pm – 9:30pm \nWed-Sat : 11:30am – 4pm, 5pm – 10pm", "info@lolacocinaparramatta.com.au", "http://www.lolacocinaparramatta.com.au"));
        restaurants.add(new Restaurant("5", "TK Something", "Canley Vale", "Shop 6-7, 47-49 Canley Vale Road, Canley Vale, Sydney", "61297261552", "60", "Korean", "https://www.zomato.com/sydney/tk-something-canley-vale/menu", "4.4", "Mon-Thu, Sun : 12noon – 10pm \nFri-Sat : 12noon – 11pm", "info@tksomething.com.au", "http://tksomethingbbqrestaurant.cafeleader.com"));
        restaurants.add(new Restaurant("6", "Ribs & Burgers", "Chipendale", "Shop RB09A, Lower Ground Level, Central Shopping Centre, 28 Broadway, Chippendale, Sydney", "61292800488", "70", "Burgers", "https://ribsandburgers.com/au/the-menu/", "4.3", "Mon-Thu, Sun : 11am – 9:30pm \nFri-Sat : 11am – 10pm", "info@ribsandburgers.com.au", "http://ribsandburgers.com.au"));
        restaurants.add(new Restaurant("7", "Soul Burger", "Randwick", "49 Perouse Road, Randwick, Sydney", "61293987496", "30", "Burgers", "http://www.soulburger.com.au/menu-1/", "4.2", "Mon-Sun : 11am – 10pm", "feedback@soulburger.com.au", "http://www.soulburger.com.au/"));
        restaurants.add(new Restaurant("8", "Kikuma", "Canley Vale", "Shop 1, 53 Canley Vale Road, Canley Vale, Sydney", "61297555549", "60", "Japanese", "https://kikumasydney.com.au/menu", "4.1", "Mon-Tue : Closed \nWed-Sat : 5:30pm – 8:45pm \nSun : 12:30pm – 2:30pm, 5:30pm – 8:45pm", "kikumasydney@gmail.com", "http://kikumasydney.com.au"));
        restaurants.add(new Restaurant("9", "Pho Hien", "Canley Vale", "3/236 Canley Vale Road, Canley Heights, Sydney", "61297286688", "35", "Vietnamese", "https://www.zomato.com/sydney/pho-hien-restaurant-canley-heights", "4.0", "Mon-Sun : 9am – 11pm", "info@phohien.com.au", "https://www.facebook.com/phohienrestaurant"));
        restaurants.add(new Restaurant("10", "The Italian Bowl", "Newtown", "255 King Street, Newtown, Sydney", "61295160857", "40", "Italian", "https://theitalianbowl.com.au/menu/", "4.0", "Mon-Thu, Sun : 12noon – 10pm \nFri-Sat : 12noon – 11pm", "theitalianbowl@optusnet.com.au", "https://theitalianbowl.com.au"));
        return restaurants;
    }
}
