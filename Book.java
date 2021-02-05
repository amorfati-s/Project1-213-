//this is our ADT

public class Book{
    private String number;
    private String name;
    private boolean checkedOut;
    private Date datePublished;

    //constructors....
    public Book(String name, String number, boolean checkedOut, Date datePublished){
        this.setName(name);
        this.setNumber(number);
        this.setCheckedOut(checkedOut);
        this.setDate(datePublished);
    }

    public String getName(){
        return this.name;

    }
    public String getNumber(){
        return this.number;
    }

    public boolean isCheckedOut(){
        return this.checkedOut;
    }

    public Date getDate(){
        return this.datePublished;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public void setCheckedOut(boolean checkedOut){
        this.checkedOut = checkedOut;
    }
    public void setDate(Date date){
        this.datePublished = date;
    }

    //we can typecast an obj to our own class
    //use equals method
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Book){
            Book book = (Book) obj;
            return this.number.equals(book.number);
        }
        return false;
    }

    @Override
    public String toString(){
        String output = "Book#" + this.number + "::" + this.name + "::"+ this.datePublished +"::"+ this.checkedOut;
        return output;
    }

}