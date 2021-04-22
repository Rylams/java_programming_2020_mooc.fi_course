
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getSquares() {
        return squares;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }
    
    public int getPrice() {
        return this.princePerSquare * this.squares;
    }
    
    public int priceDifference(Apartment compared) {
        if(compared.getPrice() > this.getPrice()) {
        return compared.getPrice() - this.getPrice();
        } else {
            return this.getPrice() - compared.getPrice();
        }
    }
    
    public boolean largerThan(Apartment compared) {
        if(this.squares > compared.getSquares()) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if(compared.getPrice() > this.getPrice()) {
            return false;
        } else {
            return true;
        }
    }

}
