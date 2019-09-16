package Entities;


import java.util.Objects;

public class Certificate {
    private long id;
    private String name;
    private String dateOfCreation;
    private String dateOfModification;
    private double price;


    public Certificate(long id, String name, String dateOfCreation, String dateOfModification, double price) {
        this.id = id;
        this.name = name;
        this.dateOfCreation = dateOfCreation;
        this.dateOfModification = dateOfModification;
        this.price = price;
    }


    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getDateOfModification() {
        return dateOfModification;
    }

    public void setDateOfModification(String dateOfModification) {
        this.dateOfModification = dateOfModification;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Certificate certificate = (Certificate) obj;
        if ((this.id == 0) ? (certificate.id != 0) : this.id != certificate.id) {
            return false;
        }
        if ((this.name == null) ? (certificate.name != null) : !this.name.equals(certificate.name)) {
            return false;
        }
        if ((this.dateOfCreation == null) ? (certificate.dateOfCreation != null) : (this.dateOfCreation != certificate.dateOfCreation)) {
            return false;
        }
        if ((this.dateOfModification == null) ? (certificate.dateOfCreation != null) : (this.dateOfModification != certificate.dateOfModification)) {
            return false;
        }
        if ((this.price == 0.00) ? (certificate.price != 0.00) : this.price != certificate.price) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Certificate{" + "id=" + id + ", name=" + name
                + ", date of creation=" + dateOfCreation + ", date of modification=" + dateOfModification + ", price=" + price + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateOfCreation, dateOfModification, price);
    }

}
